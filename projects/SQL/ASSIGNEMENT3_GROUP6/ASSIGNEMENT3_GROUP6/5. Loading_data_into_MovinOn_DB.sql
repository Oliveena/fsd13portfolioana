/* Purposes: Insert data into table object in MOVINON database */
/* Script Date: December 5 2024 
Developed by: Team 6 */
 
 
-- switch the the current database
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

insert into MovinOn.UnitRentals (
	CustID, WarehouseID, UnitID, DateIn, DateOut)
values
(2,'OR-1',4,'2016-01-04',NULL),
(2,'OR-1',5,'2016-01-04',NULL),
(4,'WY-1',3,'2016-02-15',NULL),
(6,'WA-1',5,'2016-01-01',NULL),
(7,'WY-1',6,'2016-01-15',NULL),
(7,'WY-1',11,'2016-01-15',NULL),
(9,'WA-1',10,'2016-02-15',NULL),
(10,'OR-1',6,'2016-02-01',NULL),
(10,'OR-1',7,'2016-02-01',NULL),
(10,'OR-1',8,'2016-02-15',NULL),
(11,'WY-1',2,'2016-01-15',NULL),
(12,'WA-1',2,'2016-02-15',NULL),
(12,'WA-1',6,'2016-02-01',NULL),
(13,'WY-1',4,'2016-02-01',NULL),
(13,'WY-1',5,'2016-02-01',NULL),
(14,'WA-1',4,'2016-02-15',NULL),
(15,'WA-1',3,'2016-02-20',NULL),
(17,'WY-1',9,'2016-02-01',NULL),
(18,'WA-1',7,'2016-02-01',NULL),
(20,'WA-1',6,'2016-01-15',NULL),
(26,'OR-1',2,'2016-02-01',NULL),
(27,'WA-1',8,'2016-02-01',NULL),
(31,'WY-1',8,'2016-02-20',NULL),
(32,'WA-1',9,'2016-01-05',NULL),
(36,'OR-1',10,'2016-02-15',NULL),
(38,'WY-1',10,'2016-01-15',NULL)
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
 