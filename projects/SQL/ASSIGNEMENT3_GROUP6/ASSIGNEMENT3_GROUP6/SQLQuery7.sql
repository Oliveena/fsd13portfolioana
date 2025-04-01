/* Purposes: Insert data into table object in MOVINON database */
/* Script Date: December 5 2024 
Developed by: Team 6 */
 
 
-- switch the the current database: OfficeMachine1
use MovinOn
;
go
 
 
-- insert data into a table object using external data source 
bulk insert MovinOn.Employees
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\Employees.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go

select * 
from MovinOn.Employees
;
go

 
/* 1. load data from external csv file Vehicles */

bulk insert MovinOn.Vehicles
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\Vehicles.txt'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go

 
select * 
from MovinOn.Vehicles
;
go
 
 
/* 2. load data from external csv file Drivers */
bulk insert MovinOn.Drivers
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\Drivers.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go
 
select * 
from MovinOn.Drivers
;
go
 
/* 3. load data from external csv file Customers */
bulk insert MovinOn.Customers
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\Customers.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go
 
select * 
from MovinOn.Customers
;
go
 
/* 4. load data from external csv file JobOrders */
bulk insert MovinOn.JobOrders
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\JobOrders.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go

select * 
from MovinOn.JobOrders
;
go
 
/* 5. load data from external csv file JobDetails */
bulk insert MovinOn.JobDetails
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\JobDetails.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go
 
select * 
from MovinOn.JobDetails
;
go
 
/* 6. load data from external csv file Warehouses */

bulk insert MovinOn.Warehouses
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\Warehouses.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go 

 
select * 
from MovinOn.Warehouses
;
go
 
/* 7. load data from external csv file UnitRentals */

bulk insert MovinOn.UnitRentals
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\UnitRentals.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go 

 select *
 from MovinOn.UnitRentals
 ;
 go
 
/* 8. load data from external csv file StorageUnits */

bulk insert MovinOn.StorageUnits
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\StorageUnits.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go 

select * 
from MovinOn.StorageUnits
;
go
 
 
/* 9. load data from external  csv file Postions */
bulk insert MovinOn.Positions
from 'C:\Users\anata\Desktop\WEEKEND PROJECT\Uploads\Uploads\Positions.csv'
with 
(
	firstrow = 2, 
	fieldterminator = ',',
	rowterminator = '\n'
)
; 
go 
 
select * 
from MovinOn.Positions
;
go
 