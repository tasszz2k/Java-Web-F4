USE Trading2019

create table Admin
(
      Username varchar(20) primary key,
      Password varchar(20),
	  email    varchar(30),
)
GO

insert into Admin values('sa','12345','anhdthe141302@fpt.edu.vn')
insert into Admin values('admin','admin','')
insert into Admin values('123','123','')
insert into Admin values('456','456','')
go

SELECT * FROM dbo.Admin

/*SELECT*/
SELECT * FROM dbo.Admin
WHERE Username = 'sa' AND Password = '12345'