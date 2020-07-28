-- Create DB
	DROP DATABASE IF EXISTS Project;
	CREATE DATABASE IF NOT EXISTS Project;
  -- Use Database
	USE Project;
-- Drop table if exists 
	DROP TABLE IF EXISTS CUSTOMER;
	DROP TABLE IF EXISTS CAR_ORDER;
	DROP TABLE IF EXISTS CAR;
    -- Create Table   
   -- Create Table Employee
	CREATE TABLE 	CUSTOMER ( 
		CustomerID 					INT AUTO_INCREMENT PRIMARY KEY,
		`Name`						VARCHAR(30) NOT NULL,
		Phone 						CHAR(13) NOT NULL,
		Email 						VARCHAR(50) UNIQUE NOT NULL,
		Address 					VARCHAR(100) NOT NULL,
        Note						VARCHAR(500) NOT NULL
	);
    -- Create Table CAR
	CREATE TABLE 	CAR (
		CarID 						INT AUTO_INCREMENT PRIMARY KEY,
		Maker						ENUM('HONDA','TOYOTA','NISSAN') NOT NULL ,
		Model 						CHAR(13) NOT NULL,
		`Year` 						SMALLINT UNIQUE NOT NULL,
		Color 						VARCHAR(50) NOT NULL,
        Note						VARCHAR(500) NOT NULL
	);
    -- Create Table CAR_ORDER
	CREATE TABLE 	CAR_ORDER ( 
		OrderID 					INT AUTO_INCREMENT PRIMARY KEY,
		CustomerID					INT NOT NULL ,
		CarID 						INT NOT NULL,
		Amount						SMALLINT DEFAULT 1 NOT NULL,
		SalePrice 					DOUBLE NOT NULL,
		OrderDate 					DATE NOT NULL,
		DeliveryDate 				DATE NOT NULL,
		DeliveryAddress 			VARCHAR(100) NOT NULL,
		Staus 						INT DEFAULT 0 CHECK(Staus = 0 OR Staus = 1 OR Staus = 2),
        Note						VARCHAR(500) NOT NULL,
        FOREIGN KEY (CarID) REFERENCES  CAR(CarID) ON DELETE CASCADE,
        FOREIGN KEY (CustomerID) REFERENCES  CUSTOMER(CustomerID) ON DELETE CASCADE
	);
    
     -- Insert CUSTOMER
    INSERT INTO	CUSTOMER
	(`Name`,				Phone,				Email,					Address,						Note	)
	VALUES
	('A',					'123456',			'acb@gmail.com',		'HN',							'1'		),
	('A1',					'1234562',			'acb1@gmail.com',		'H1N',							'21'	),
	('A2',					'1234564',			'acb2@gmail.com',		'HN2',							'12'	);
     INSERT INTO	CAR
	(Maker,					 Model,				`Year`,					Color,							Note)
	VALUES
	('HONDA',				'HONDA1',			1990,					'YEALLOW',						'1'		),
	('TOYOTA',				'TOYOTA1',			1992,					'BLUE',							'12'	),
	('NISSAN',				'NISSAN1',			1994,					'RED',							'111'	);
    INSERT INTO		CAR_ORDER 
	(CustomerID,			CarID,				Amount,					SalePrice, 						OrderDate, 					DeliveryDate, 				DeliveryAddress,		Staus			,		Note)
	VALUES
	(1,						2,					2,						 5.000000,						'2000-03-01',				'2000-03-21',				 'HN' ,						'0'	,			'123'	),
	(2,						2,					2,						 6.000000,						'2000-03-04',				'2000-03-10',				 'HN1',						'1'	 ,			'1234'	),
	(3,						2,					2,						 8.000000,						'2000-03-08',				'2000-03-15',				 'HN2',						'2'		,		'1235'	),
	(3,						1,					7,						 8.000000,						'2000-03-08',				'2000-03-15',				 'HN2',						'2'		,		'1235'	);
    SELECT * FROM customer;
SELECT * FROM car;
SELECT * FROM car_order;
     /*b Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã
mua và sắp sếp tăng dần theo số lượng oto đã mua.*/
SELECT C.`Name`,CO.Amount AS soluong
    FROM CUSTOMER C
    JOIN CAR_ORDER CO
    ON C.CustomerID = CO.CustomerID
	WHERE Staus = 1
    GROUP BY  C.`Name`
    ORDER BY Amount ASC;
    /*c Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều
oto nhất trong năm nay. */
DROP FUNCTION IF EXISTS MostSale;
	DELIMITER $$
	CREATE FUNCTION MostSale() 
	RETURNS VARCHAR(30)
    BEGIN
    DECLARE      CarName VARCHAR(30);
    DECLARE      soluong INT;
    SELECT 		c.Maker,COUNT(c.CarID) INTO CarName,soluong
					FROM 		CAR c
                    INNER JOIN	CAR_ORDER co ON c.CarID=co.CarID
                    GROUP BY co.CarID 
                    HAVING COUNT(co.CarID) = (SELECT MAX(a) FROM (SELECT COUNT(CarID) AS a FROM CAR_ORDER GROUP BY CarID) AS b);
			RETURN 	CarName;
		END $$
	DELIMITER ;
    -- USE Function
    SELECT 	MostSale() AS Maker_Name;
   /* d Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của những năm trước. In ra số lượng bản ghi đã bị xóa. */
    DROP PROCEDURE IF EXISTS xoadonhang;
    DELIMITER $$
	CREATE PROCEDURE xoadonhang ()
    BEGIN
    DECLARE sobanghidaxoa INT;
    SELECT COUNT(*) AS soluongxoa INTO sobanghidaxoa FROM car_order
    WHERE staus = 2 AND Year(Now()) > Year(DeliveryDate) ;
    DELETE FROM car_order
    WHERE staus = 2 AND Year(Now()) > Year(DeliveryDate) ;
    SELECT sobanghidaxoa;
    END  $$
	DELIMITER ;
    
    CALL xoadonhang();
    
/*e Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn hàng đã đặt hàng bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto và tên hãng sản xuất */
DROP PROCEDURE IF EXISTS donhang;
    DELIMITER $$
	CREATE PROCEDURE donhang ()
    BEGIN
    SELECT c.`name` ,co.orderID,amount,maker FROM
    Customer c
    JOIN car_order co ON c.customerID = co.customerID
    JOIN car ON co.carID = car.carID;
    
    END  $$
	DELIMITER ;
    
    CALL donhang () ;
    /*Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ vào database (DeliveryDate < OrderDate + 15).*/
DROP TRIGGER IF EXISTS questione ;
 DELIMITER $$
 CREATE TRIGGER questione
 BEFORE INSERT  ON car_order
 FOR EACH ROW
 BEGIN
 IF DATEDIFF(DeliveryDate(),OrderDate()) = 15 THEN 
 SIGNAL SQLSTATE '123'
 SET MESSAGE_TEXT = 'Lỗi' ;
 END IF;
 END $$
DELIMITER ;

INSERT INTO Car_Order ( OrderDate , DeliveryDate)
VALUES                ('2000-03-01' , 2000-03-21 );
    
    
    
    

    
    
    
