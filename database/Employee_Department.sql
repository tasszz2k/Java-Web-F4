USE Trading2019
GO
/****** Object:  Table [dbo].[Department]    Script Date: 3/2/2020 4:57:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Department](
	[id] [int] NOT NULL,
	[name] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Department] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 3/2/2020 4:57:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[id] [int] NOT NULL,
	[name] [varchar](150) NOT NULL,
	[dob] [date] NOT NULL,
	[gender] [bit] NOT NULL,
	[did] [int] NOT NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Department] ([id], [name]) VALUES (1, N'IS')
INSERT [dbo].[Department] ([id], [name]) VALUES (2, N'IA')
INSERT [dbo].[Employee] ([id], [name], [dob], [gender], [did]) VALUES (1, N'mr A', CAST(N'2000-01-01' AS Date), 1, 2)
INSERT [dbo].[Employee] ([id], [name], [dob], [gender], [did]) VALUES (2, N'mr AA', CAST(N'2000-01-01' AS Date), 1, 1)
INSERT [dbo].[Employee] ([id], [name], [dob], [gender], [did]) VALUES (3, N'mr B', CAST(N'2000-01-01' AS Date), 1, 1)
INSERT [dbo].[Employee] ([id], [name], [dob], [gender], [did]) VALUES (4, N'mr BBB', CAST(N'2000-01-01' AS Date), 1, 2)
INSERT [dbo].[Employee] ([id], [name], [dob], [gender], [did]) VALUES (11, N'mrs A', CAST(N'2020-01-01' AS Date), 0, 2)
INSERT [dbo].[Employee] ([id], [name], [dob], [gender], [did]) VALUES (22, N'mrs AA', CAST(N'1900-01-01' AS Date), 0, 1)
INSERT [dbo].[Employee] ([id], [name], [dob], [gender], [did]) VALUES (32, N'mrs B', CAST(N'1000-01-01' AS Date), 0, 1)
INSERT [dbo].[Employee] ([id], [name], [dob], [gender], [did]) VALUES (43, N'mrs BBB', CAST(N'2200-01-01' AS Date), 0, 2)
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD  CONSTRAINT [FK_Employee_Department] FOREIGN KEY([did])
REFERENCES [dbo].[Department] ([id])
GO
ALTER TABLE [dbo].[Employee] CHECK CONSTRAINT [FK_Employee_Department]
GO

/*======SELECT==========*/
SELECT * FROM dbo.Employee 
INNER JOIN dbo.Department ON Department.id = Employee.did