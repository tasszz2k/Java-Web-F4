create database JobDB
go
USE [JobDB]
GO
CREATE TABLE [Jobs](
	[ID] [smallint] IDENTITY(1,1) NOT NULL primary key,
	[Name] [varchar](50) NOT NULL,
	[Salary] money not null,
	[Datecreated] date not null,
	[Activated] bit not null,
) 
GO
INSERT [dbo].[Jobs] ([name],[salary],[datecreated],[activated]) VALUES (N'Designer',7000,'1/21/2015',1)
INSERT [dbo].[Jobs] ( [name],[salary],[datecreated],[activated]) VALUES (N'Managing Editor',1000,'11/3/1990',0)
INSERT [dbo].[Jobs] ( [name],[salary],[datecreated],[activated]) VALUES (N'Marketing Manager',5000,'9/19/1996',0)
INSERT [dbo].[Jobs] ( [name],[salary],[datecreated],[activated]) VALUES (N'Public Relations Manager',2000,'12/7/2014',1)
GO
CREATE TABLE [Employee](
	[ID] [char](9) NOT NULL primary key,
	[FullName] [varchar](51) NOT NULL,
	[HireDate] [datetime] NOT NULL,
	[City] nvarchar(150) not null
) 
GO
INSERT [dbo].[Employee] ([id], [FullName], [HireDate],[City]) VALUES (N'EMP01', N'Paolo Accorti', CAST(0x0000843100000000 AS DateTime),'London')
INSERT [dbo].[Employee] ([id], [FullName], [HireDate],[City]) VALUES (N'EMP02', N'Pedro Afonso', CAST(0x000081CD00000000 AS DateTime),'Paris')
INSERT [dbo].[Employee] ([id], [FullName], [HireDate],[City]) VALUES (N'EMP03', N'Victoria Ashworth', CAST(0x0000816700000000 AS DateTime),'Moscow')
INSERT [dbo].[Employee] ([id], [FullName], [HireDate],[City]) VALUES (N'EMP04', N'Helen Bennett', CAST(0x0000800200000000 AS DateTime),'Moscow')
INSERT [dbo].[Employee] ([id], [FullName], [HireDate],[City]) VALUES (N'EMP05', N'Lesley Brown', CAST(0x0000820000000000 AS DateTime),'Rostov')
GO
create table JobEmployee
(
ID int identity (1,1) primary key,
Empid char(9) references Employee(ID), 
Jobid smallint references Jobs(ID)
)
Go
insert into JobEmployee(Empid,Jobid) values('EMP01',1)
insert into JobEmployee(Empid,Jobid) values('EMP01',2)
insert into JobEmployee(Empid,Jobid) values('EMP02',2)
insert into JobEmployee(Empid,Jobid) values('EMP03',4)
insert into JobEmployee(Empid,Jobid) values('EMP01',3)
insert into JobEmployee(Empid,Jobid) values('EMP01',4)
insert into JobEmployee(Empid,Jobid) values('EMP02',1)
insert into JobEmployee(Empid,Jobid) values('EMP03',3)

/*======== SELECT ==============*/
SELECT * FROM Employee
SELECT * FROM JobEmployee
WHERE Empid='EMP02' AND Jobid=2
SELECT * FROM Jobs
SELECT * FROM Employee
INNER JOIN JobEmployee ON JobEmployee.Empid=Employee.ID
INNER JOIN Jobs ON JobEmployee.Jobid=Jobs.ID
WHERE Jobid=2



DELETE FROM JobEmployee