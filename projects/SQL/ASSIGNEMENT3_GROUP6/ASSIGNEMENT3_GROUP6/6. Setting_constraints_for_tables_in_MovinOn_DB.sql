/* Purposes: Adding UNIQUE, DEFAULT and CASE constraints */
/* Script Date: December 5 2024 
Developed by: Team 6 */
 
use MovinOn
;
go

/* ***** Table No. 1 - Employees ***** */

alter table MovinOn.Employees
add constraint uq_Cell unique (Cell)
;
go

alter table MovinOn.Employees
add constraint ck_StartDateMoreThanDOB check (StartDate > DOB)
;
go

alter table MovinOn.Employees
add constraint ck_ReviewLaterThanStartDate check (Review > StartDate)
;
go

alter table MovinOn.Employees
add constraint ck_EndDateMoreThanStartDate check (EndDate > StartDate)
;
go

alter table MovinOn.Employees
add constraint ck_SalaryMoreThanZero check (Salary > 0)
;
go

alter table MovinOn.Employees
add constraint ck_HourlyRateMoreThanZero check (HourlyRate > 0)
;
go

/* ***** Table No. 2 - Positions ***** */
-- no extra constraints deemed necessary 

/* ***** Table No. 3 - Warehouses ***** */

alter table MovinOn.Warehouses
add constraint df_ClimateControl default 'False' for ClimateControl
;
go

alter table MovinOn.Warehouses
add constraint df_SecurityGate default 'False' for SecurityGate
;
go

/* ***** Table No. 4 - StorageUnits ***** */

alter table MovinOn.StorageUnits
add constraint ck_RentMoreThanZero check (Rent > 0)
;
go

/* ***** Table No. 5 - UnitRentals ***** */

alter table MovinOn.UnitRentals
add constraint ck_DateOutLaterThanDateIn check (DateOut > DateIn)
;
go

/* ***** Table No. 6 - Customers ***** */

alter table MovinOn.Customers
add constraint ck_Balance check (Balance >= 0)
;
go

/* ***** Table No. 7 - JobOrders ***** */

alter table MovinOn.JobOrders
add constraint ck_DistanceEst check (DistanceEst >= 0)
;
go

alter table MovinOn.JobOrders
add constraint ck_WeightEst check (WeightEst >= 0)
;
go

alter table MovinOn.JobOrders
add constraint df_Packing default 'False' for Packing
;
go

alter table MovinOn.JobOrders
add constraint df_Heavy default 'False' for Heavy
;
go
-- business rules would apply to determining what is the cutoff minimum weight for Heavy
-- we could set a constraint or a trigger than automatically sets a JobOrder as Heavy

alter table MovinOn.JobOrders
add constraint df_Storage default 'False' for Storage
;
go

/* ***** Table No. 8 - JobDetails ***** */

alter table MovinOn.JobDetails
add constraint ck_MileageActual check (MileageActual >= 0)
;
go
-- would it be helpful to set the default of MileageActual to MileageEst?
-- or to set a trigger for a X discrepancy between MileageActual and MileageEst?

alter table MovinOn.JobDetails
add constraint ck_WeightActual check (WeightActual >= 0)
;
go

/* ***** Table No. 9 - Drivers ***** */


alter table MovinOn.Drivers
add constraint ck_EndDateMoreThanStartDateForDrivers check (EndDate > StartDate)
;
go
 -- ERROR
 -- returns The ALTER TABLE statement conflicted with the CHECK constraint "ck_EndDateMoreThanStartDateForDrivers". The conflict occurred in database "MovinOn", table "MovinOn.Drivers".
 
alter table MovinOn.Drivers
add constraint ck_MileageRate check (MileageRate>= 0)
;
go

alter table MovinOn.Drivers
add constraint ck_ReviewDateLaterThanStartDateForDrivers check (Review > StartDate)
;
go
-- idk similar error message 

alter table MovinOn.Drivers
add constraint ck_DrivingRecord check (DrivingRecord IN ('A', 'B', 'C', 'D', 'F'))
; 
go


/* ***** Table No. 10 - Vehicles ***** */

alter table MovinOn.Vehicles
add constraint uq_LicensePlateNum  unique (LicensePlateNum )
;
go


alter table MovinOn.Vehicles
add constraint ck_Axle check (Axle >=2)
;
go
-- displays error message 

-- no constraints for colors, what is 'red' for one person is 'burgundy' or 'carmine' for others
-- even more confusing when the truck has multiple colors 




