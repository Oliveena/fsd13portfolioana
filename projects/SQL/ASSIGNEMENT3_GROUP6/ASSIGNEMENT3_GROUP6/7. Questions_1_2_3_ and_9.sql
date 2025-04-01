/* Purposes: Answering questions 1, 2, 3 and  */
/* Script Date: December 5 2024 
Developed by: Anastassia Tarassova*/

use MovinOn
;
go

/* **** SCRIPT 1 **** */
/*
Purposes: 
- Add a script that calculates years of service for each employee.
- Determine if an employee is fully vested based on five years of service.
- Hide the End Date field for active employees and hide the Review field for inactive employees.

Logic: 
- CURDATE() - HireDate() = YearsOfService in int
- If YearsOfService >= 5, then 'Fully Vested' Else 'Not Fully Vested'
- adapt views: if EndDate = null {hide EndDate}, else {hide Review} from Views

we'll make a UDF (user-defined function)
*/

-- 1. dropping any previous function
-- copied from Dr. Khattar Daou's script 
if OBJECT_ID('MovinOn.getEmployeeSeniorityFn', 'Fn') is not null
	drop function MovinOn.getEmployeeSeniorityFn
;
go

-- 2. creating a UDF that returns seniority 
-- copied from Dr. Khattar Daou's script 
create function MovinOn.getEmployeeSeniority
(
	-- define parameter list 
	-- @parameter_name as data_type [ = expression ]
	@HireDate as Datetime2
)
returns int
as
	begin
		-- 1. declare the returned variable 
		-- syntax: declare @variable_name as data_type [ = expression]
		declare @Seniority as int

		-- 2. compute the returned value
		-- using DateDiff(datepart, start_date, end_date) 
		-- where DataPart: year, month, day, hour, minute, ...
		select @Seniority  = abs(DateDiff(year, @HireDate, getDate() ))

		-- 3. return the result to the function caller
		return @Seniority
	end
;
go

-- 3. validating if the Seniority indicated Vestedness or no 

select EmpID, EmpFirst, EmpLast, MovinOn.getEmployeeSeniority(StartDate) as Seniority,
case 
    when MovinOn.getEmployeeSeniority(StartDate) >= 5 then 'Fully Vested'
    else 'Not Fully Vested Yet'
    end as VestedOrNo
from MovinOn.Employees
where EndDate IS NULL
;
go

-- did I do the thing with hiding the views? 

-- yay, it works! 


select EmployeeID, FirstName, LastName, TIMESTAMPDIFF(years, StartDate, CurDate()) as YearsOfSeniority,
case 
	-- after 5 years, they become fully vested
	when TIMESTAMPDIFF >= 5 then 'Fully Vested'
	-- until then, they are not fully vested yet
	else 'Not Fully Vested Yet'
	-- for all of the Employees
	from MovinOn.Employee
	-- that are still employed
	where EndDate is not null
;
go


/* **** SCRIPT 2 **** */
/*
Purpose: Validate phone numbers. Verify phone and cell phone area codes for employees based on their state.
Oregon (OR): 541, 503, 971.
Washington (WA): 425, 360, 206, 509, 253.
Wyoming (WY): 307.
Provide error messages for invalid area codes.

Logic: case for authorized area codes, like we did in MovinOn.Drivers.DrivingRecord
*/

use MovinOn
;
go

-- this is not a procedure or a function, nothing to drop 

-- Assuming the Employee table has columns: EmployeeID, State, PhoneNumber
-- We're going to check if the area code of PhoneNumber is valid based on the state.

select EmpID, EmpFirst, EmpLast, State, Phone,
case
    when State = 'OR' and left(Phone, 3) in ('541', '503', '971') then 'The area code is valid for 0R, Oregon'
        
    when State = 'WA' and left(Phone, 3) in ('425', '360', '206', '509', '253') then 'The area code is valid for WA, Washington'
        
    when State = 'WY' and left(Phone, 3) = '307' then 'The area code is valid for WY, Wyoming'
        
-- for wrong cases
    when State = 'OR' and left(Phone, 3) not in('541', '503', '971') then 'OR phone area codes should be 541, 503, or 971".'
    when State = 'WA' and left(Phone, 3) not in('425', '360', '206', '509', '253') then 'WA phone area codes should be 425, 360, 206, 509, or 253".'
    when State = 'WY' and left(Phone, 3) != '307' then 'WY phone area codes should be 307".'
   
-- for any other case
-- else 'Error! Invalid area code or state'
-- we will coment it out because Warehouse managers should be able to enter phone area codes for other states not included in the lists.

-- should i make a validation that ONLY Warehouse managers are allowed to receive this message? 

end as PhoneValidationCase
from MovinOn.Employees
;
go


/* **** SCRIPT 3 **** */
/*
Purposes: 
- For salaried employees, display the annual salary.
- For hourly employees, calculate the annual earnings by multiplying the hourly rate by 2,080.

Create a script that returns the earnings of each employee. 
Maria wants to view each employee’s annual salary. 
For salaried employees, the Salary field value represents the annual salary. 
However, for active, hourly paid employees, the field value displays the hourly rate but not an annual salary. 
For these employees, Don needs to multiply the hourly rate by 2,080, which is the product of 40 hours per week 
and 52 weeks per year.

Logic: Make a procedure. 
*/

use MovinOn
;
go

-- dropping any previous procedure
if OBJECT_ID('MovinOn.GetEmployeeEarnings', 'P') in not null
drop procedure MovinOn.GetEmployeeEarnings
;
go

-- creating the procedure
create procedure MovinOn.GetEmployeeEarnings
as
begin 
	select EmpID, EmpFirst, EmpLast, 
		case
		when Salary is not null then Salary
		when HourlyRate is not null then HourlyRate * 2080
	end as AnnualEarnings
	from MovinOn.Employees;
end
;
go

-- testing it out
EXEC MovinOn.GetEmployeeEarnings
;
go
-- looks good! 

/* **** SCRIPT 9 **** */
/*
Purpose: 
What percentage of customers have rented at least one unit?*/



