/*
Purpose: To create a database for MovinOn
*/
/* Script date: December 10, 2024 
Developed by: Team 6 */


use MovinOn
;
go

/* The following script must be used only during the development process and NOT on the production database. */
select *
from sys.all_objects
;
go

-- making sure all previous tables are dropped 
if OBJECT_ID('MovinOn.Employees', 'U') is not null
	drop table MovinOn.Employees
;
go

select * from MovinOn.Employees;
go

/* ***** Table No. 1 - Employees ***** */
create table MovinOn.Employees
(
	EmpID int not null,
	EmpFirst nvarchar(30) not null,
    EmpLast nvarchar(30) not null,
	Address nvarchar(40) not null,
    City nvarchar(30) not null,
    State nvarchar(2) not null,
    ZIP nvarchar(10) not null,
    Phone nvarchar(15) not null, 
    Cell nvarchar(15) not null,
    SSN nvarchar(9) not null,
    DOB datetime2 not null,
    StartDate datetime2 not null,
    EndDate datetime2 NULL,
    PositionID int not null,
    Salary money,
    HourlyRate money,
    Review datetime2 NULL,
    Memo nvarchar(max),
	WarehouseID varchar(5) not null,
    constraint pk_EmpID primary key clustered (EmpID)
)
;
go

alter table MovinOn.Employees
	alter column WarehouseID nvarchar(5) not null
;
go


-- returning everthing for testing purposes
execute sp_help 'MovinOn.Employees'
;
go

/* ***** Table No. 2 - Positions ***** */

-- making sure all previous tables are dropped 
if OBJECT_ID('MovinOn.Positions', 'U') is not null
	drop table MovinOn.Positions
;
go

create table MovinOn.Positions
(
	PositionID INT not null,
    Title nvarchar(30) not null,
    constraint pk_PositionID primary key clustered (PositionID asc) 
)
;
go

-- returning everthing for testing purposes
execute sp_help 'MovinOn.Positions'
;
go

   
/* ***** Table No. 3 - Warehouses ***** */
if OBJECT_ID('MovinOn.Warehouses', 'U') is not null
	drop table MovinOn.Warehouses
;
go


create table MovinOn.Warehouses
(
	WarehouseID nvarchar(5) not null,
    Address nvarchar(40) not null,
    City nvarchar(30) not null,
    State nvarchar(2) not null,
    ZIP nvarchar(10) not null,
    Phone nvarchar(15) not null,
    ClimateControl nvarchar(5) not null,
    SecurityGate nvarchar(5) not null,
    constraint pk_WarehouseID primary key clustered (WarehouseID)
)
;
go

-- returning everthing for testing purposes
execute sp_help 'MovinOn.Warehouses'
;
go


/* ***** Table No. 4 - StorageUnits ***** */
if OBJECT_ID('MovinOn.StorageUnits', 'U') is not null
	drop table MovinOn.StorageUnits
;
go


create table MovinOn.StorageUnits
(
	ID int not null,
    UnitID int not null,
    UnitSize nvarchar(10) not null,
    WarehouseID nvarchar(5) not null,
    Rent money not null,
    constraint pk_ID primary key clustered (ID asc)
)
;
go


-- returning everthing for testing purposes
execute sp_help 'MovinOn.StorageUnits'
;
go


/* ***** Table No. 5 - UnitRentals ***** */

if OBJECT_ID('MovinOn.UnitRentals', 'U') is not null
	drop table MovinOn.UnitRentals
;
go

create table MovinOn.UnitRentals
(
	UnitID INT not null,
	CustID INT not null,
    WarehouseID nvarchar(5) not null,
    DateIn datetime2 not null,
    DateOut datetime2 NULL,
    constraint pk_unitRentals primary key clustered (UnitID, WarehouseID, CustID)  -- composite primary key 
	-- validate with Dr. Khattar 
)
;
go



-- returning everthing for testing purposes
execute sp_help 'MovinOn.UnitRentals'
;
go


/* ***** Table No. 6 - Customers ***** */

if OBJECT_ID('MovinOn.Customers', 'U') is not null
	drop table MovinOn.Customers
;
go

create table MovinOn.Customers
(
	CustID INT not null,
    CompanyName nvarchar(50) null,
    ContactFirst nvarchar(30) not null,
    ContactLast nvarchar(30) not null,
    Address nvarchar(40) not null,
    City nvarchar(30) not null,
    State nvarchar(2) not null,
    ZIP nvarchar(10) not null,
    Phone nvarchar(15) not null,
    Balance money not null,
    constraint pk_CustID primary key clustered (CustID asc)
)
;
go

alter table MovinOn.Customers
DROP constraint pk_CustID
;
go


-- displaying the table and its attributes
execute sp_help 'MovinOn.Customers'
;
go

/* ***** Table No. 7 - JobOrders ***** */

if OBJECT_ID('MovinOn.JobOrders', 'U') is not null
	drop table MovinOn.JobOrders
;
go

create table MovinOn.JobOrders
(
	JobID INT not null, -- auto-increment but starts from 2
    CustID INT not null,
    MoveDate datetime2 not null,
    FromAddress nvarchar(30) not null,
    FromCity nvarchar(30) not null,
    FromState nvarchar(2) not null,
    ToAddress nvarchar(30) not null,
    ToCity nvarchar(30) not null,
    ToState nvarchar(2) not null,
    DistanceEst INT not null,
    WeightEst INT not null, 
    Packing nvarchar(5) not null,
    Heavy nvarchar(5) not null,
    Storage nvarchar(5) not null,
    constraint pk_JobID primary key clustered (JobID asc)
)
;
go 

execute sp_help 'MovinOn.JobOrders'
;
go


/* ***** Table No. 8 - JobDetails ***** */

if OBJECT_ID('MovinOn.JobDetails', 'U') is not null
	drop table MovinOn.JobDetails
;
go

create table MovinOn.JobDetails
(
	JobID INT not null,
    VehicleID nvarchar(10) not null, 
    DriverID INT not null,
    MileageActual INT not null,
    WeightActual INT not null,
    constraint pk_JobID_JobDetails primary key clustered (JobID asc)
)
;
go

-- we had a typo in MileageActual
exec sp_rename 'MovinOn.JobDetails.MileageAcutal', 'MileageActual', 'COLUMN'
;
go

execute sp_help 'MovinOn.JobDetails'
;
go



/* ***** Table No. 9 - Drivers ***** */

if OBJECT_ID('MovinOn.Drivers ', 'U') is not null
	drop table MovinOn.Drivers 
;
go

create table MovinOn.Drivers
(
	DriverID INT not null,
    DriverFirst nvarchar(30) not null,
    DriverLast nvarchar(30) not null,
    SSN nvarchar(9) not null,
    DOB datetime2 not null,
    StartDate datetime2 not null,
    EndDate datetime2 NULL,
    Address nvarchar(40) not null,
    City nvarchar(30) not null,
    State nvarchar(50) not null,
    ZIP nvarchar(10) not null,
    Phone nvarchar(15) not null,
    Cell nvarchar(15) not null,
    MileageRate money not null,
    Review datetime2,
    DrivingRecord nvarchar(1) not null,
    constraint pk_DriverID primary key clustered (DriverID) 
)
;
go

drop table MovinOn.Drivers
;
go

execute sp_help 'MovinOn.Drivers'
;
go
    
/* ***** Table No. 10 - Vehicles ***** */

if OBJECT_ID('MovinOn.Vehicles ', 'U') is not null
	drop table MovinOn.Vehicles 
;
go


create table MovinOn.Vehicles
(
	VehicleID nvarchar(10) not null, 
    LicensePlateNum nvarchar(7) not null,
    Axle INT not null,
    Color nvarchar(10) not null,
    constraint pk_VehicleID primary key clustered (VehicleID)
)
;
go

execute sp_help 'MovinOn.Vehicles'
;
go