/* Purposes: Adding constraints into table object in MovinOn database */
/* Script Date: December 5, 2024 
Developed by: Team 6 */
 
 
-- switch the the current database: OfficeMachine1
use MovinOn;
;
go
 
/* **************** Apply constraint to MOVINON ****************** */   
/* add foreign key constraint(s) to the table Employees */
 
/* 1. Between Employees and Positions tables */
alter table MovinOn.Employees
	add constraint fk_Employees_Positions foreign key (PositionID) -- fk_EmployeesPositions
		references MovinOn.Positions (PositionID) 
;
go

 
/* 2. Between Employees and Warehouses tables */
alter table MovinOn.Employees
	add constraint fk_Employees_Warehouses foreign key (WarehouseID)
		references MovinOn.Warehouses (WarehouseID)
;
go


 
/* add foreign key constraint(s) to table StorageUnits */
 
/* 1. Between StorageUnits and Warehouses tables */
alter table MovinOn.StorageUnits
	add constraint fk_StorageUnits_Warehouses foreign key (WarehouseID)
		references MovinOn.Warehouses (WarehouseID)
;
go
 
 
/* add foreign key constraint(s) to table UnitRentals */
 
/* 1. Between UnitRentals and Warehouses tables */
alter table MovinOn.UnitRentals
	add constraint fk_UnitRentals_Warehouses foreign key (WarehouseID)
		references MovinOn.Warehouses (WarehouseID)
; 
go
 
/* 2. Between UnitRentals and Customers tables */
alter table MovinOn.UnitRentals
	add constraint fk_UnitRentals_Customers foreign key (CustID)
		references MovinOn.Customers (CustID)
; 
go
 
 
/* add foreign key constraint(s) to table JobOrders */
 
/* 1. Between JobOrders and Customers tables */
alter table MovinOn.JobOrders
	add constraint fk_JobOrders_Customers foreign key (CustID)
		references MovinOn.Customers (CustID)
; 
go
 
/* add foreign key constraint(s) to table JobDetails */
 
/* 1. Between JobDetails and JobOrders tables */
/*alter table JobDetails
	add constraint fk_JobDetails_JobOrders foreign key (JobID)
		references JobOrders (JobID)
;
*/ -- > DEFINED JOB_ID AS PK
 
/* 2. Between JobDetails and Drivers tables */
alter table MovinOn.JobDetails
	add constraint fk_JobDetails_Drivers foreign key (DriverID)
		references MovinOn.Drivers (DriverID)
; 
go
 
/* 3. Between JobDetails and Vehicles tables */
alter table MovinOn.JobDetails
	add constraint fk_JobDetails_Vehicles foreign key (VehicleID)
		references MovinOn.Vehicles (VehicleID)
; 
go
 
 