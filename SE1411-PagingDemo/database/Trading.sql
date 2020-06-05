CREATE DATABASE Trading2019;
GO

USE Trading2019;
GO


CREATE TABLE Categories
(
	ID VARCHAR(6) PRIMARY KEY,
	[name] NVARCHAR(30),
	describe NVARCHAR(50),
);
GO

INSERT INTO Categories
VALUES
('N', 'Nokia', N'gọn nhẹ, pin lâu');
INSERT INTO Categories
VALUES
('S', 'Samsung', N'dáng đẹp, nhiều chức năng');
INSERT INTO Categories
VALUES
('IP', 'Iphone', N'Hiện đại, chụp ảnh 20GPixel...');
INSERT INTO Categories
VALUES
('Ga', 'Galaxy', N'Hiện đại, chụp ảnh 10GPixel...');
GO

CREATE TABLE products
(
	ID VARCHAR(8) PRIMARY KEY,
	[name] VARCHAR(30),
	cat_ID VARCHAR(6)
		REFERENCES Categories (ID),
	[image] VARCHAR(100),
	price FLOAT,
	quantity INT,
	describe NVARCHAR(50),
	status NVARCHAR(20),
	adddate DATETIME,
);
GO

INSERT INTO products
VALUES
('N8', 'Nokia N8', 'N', 'images/8800.jpg', 2300, 12, N'Màu hồng cho nữ ', 'còn hàng', '8/5/2019');
INSERT INTO products
VALUES
('E72', 'Nokia E72', 'N', 'images/B2000.jpg', 3200, 12, N'Màu đồng cho nam', 'hết hàng', '2/12/2019');
INSERT INTO products
VALUES
('S2', 'Samsung Corby II', 'S', 'images/X500.jpg', 3400, 8, N'Lướt Web thoải gà mái', 'còn hàng', '4/13/2019');
INSERT INTO products
VALUES
('E1050', 'Samsung E1050', 'S', 'images/X300.jpg', 2100, 10, N'Pin lâu', 'còn hàng', '3/23/2019');
INSERT INTO products
VALUES
('S23', 'Samsung E1050', 'S', 'images/X300.jpg', 2100, 10, N'Pin lâu', 'còn hàng', '5/19/2019');
INSERT INTO products
VALUES
('E19', 'Nokia E72', 'N', 'images/B2000.jpg', 3200, 12, N'chụp ảnh đẹp', 'còn hàng', '5/13/2019');
INSERT INTO products
VALUES
('S22', 'Samsung Corby II', 'S', 'images/X500.jpg', 3400, 8, N'lướt web đỉnh', 'còn hàng', '4/20/2019');
INSERT INTO products
VALUES
('E10', 'Samsung E1050', 'S', 'images/X300.jpg', 2100, 10, N'nồi đồng cối đá', 'còn hàng', '10/12/2018');
INSERT INTO products
VALUES
('S28', 'Samsung E1050', 'S', 'images/X300.jpg', 2100, 10, N'đập không vỡ', 'còn hàng', '10/12/2018');
GO

/*========= Select ==============*/
SELECT *
FROM dbo.products
INNER JOIN dbo.Categories ON products.cat_ID = Categories.ID


SELECT ID, name, describe
FROM dbo.Categories

SELECT * FROM dbo.Categories WHERE ID='ip';


UPDATE dbo.Categories SET name = ?, describe =?
WHERE ID=?
INSERT INTO Categories
VALUES
('1', '1', N'Hiện đại, chụp ảnh 10GPixel...');
GO
