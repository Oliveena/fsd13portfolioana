/*
Purpose: Creating the database Northwind24h2
Script Date: 06-12-2024
Developed by: Nikita Zelenskiy, Trang Tireu, Anastassia Tarassova 
*/
 

 
-- creating MovinOn database 
create database MovinOn
on primary
(
	-- 1) rows data logical filename
	name = 'MovinOn',
	-- 2) rows data initial file size
	size = 20MB,
	-- 3) rows data auto growth size
	maxsize = unlimited, 
	filegrowth = 10%,
	-- 4) rows data path and file name
	filename = 'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\MovinOn.mdf'
	)
 
	log on
	(
	-- 1) log logical filename
	name = 'MovinOn_log',
	-- 2) log initial file size (25% of rows data file size)
	size = 10MB,
	filegrowth = 10%,
	-- 3) log maximum size
	maxsize = 25MB,
	-- 4) log path and file name
	filename = 'C:\Program Files\Microsoft SQL Server\MSSQL16.MSSQLSERVER\MSSQL\DATA\MovinOn_log.ldf'
)
;
go
 

	-- return the definition of the Northwind24h2 using system stored procedure
	execute sp_helpdb 'MovinOn'
	;
	go
 
	-- return the SQL Server version we are running
	select @@version as 'SQL Server Version',
		   @@SERVERNAME as 'Server Name'
		   ; 
		   go
 
-- return the current user name and the database name
select
	user_name() as 'User Name',
	DB_NAME() as 'Database Name'
	;
	go
