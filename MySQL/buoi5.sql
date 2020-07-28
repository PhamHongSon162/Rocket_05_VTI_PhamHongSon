USE qlbaithi;
/* Cau 1 Tạo view có chứa nhân viên phòng ban thuộc phòng ban sales */
CREATE VIEW DSNV_Sales AS 
SELECT  Accountt.*, Department.DepartmentName
FROM Accountt
JOIN Department ON Accountt.DepartmentID = Department.DepartmentID WHERE Department.DepartmentName = 'Sale';

SELECT * FROM DSNV_Sales;
/* Cau2  Tạo view có chứa thông tin các account tham gia vào nhiều groupp nhất  */
CREATE VIEW  maxgroupaccount AS
SELECT Accountt.* , COUNT(GroupAccount.AccountID) AS 'So acc'
FROM Accountt
JOIN GroupAccount ON Accountt.AccountID = GroupAccount.AccountID
GROUP BY Accountt.AccountID
HAVING COUNT(GroupAccount.AccountID) = (SELECT MAX(son) FROM (SELECT COUNT(AccountID) AS son FROM GroupAccount
GROUP BY AccountID) AS sonbaka);

SELECT * FROM maxgroupaccount;

/* CAu 3  Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi  */
CREATE VIEW contentqua300 AS
SELECT LENGTH(Content)
FROM  Question
WHERE LENGTH(Content) > 300 ;

SELECT * FROM contentqua300tu;
/* Cau 4 Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất */
CREATE VIEW PhongbanMAXnhanvien AS
SELECT Department.*, COUNT(Accountt.DepartmentID)
FROM Department
JOIN Accountt ON Department.DepartmentID = Accountt.DepartmentID
GROUP BY Department.DepartmentID 
HAVING COUNT(Accountt.DepartmentID) = (SELECT MAX(son) FROM (SELECT COUNT(Accountt.DepartmentID) AS son FROM Accountt
GROUP BY DepartmentID) AS sonbaka);

SELECT * FROM PhongbanMAXnhanvien ;
/* Cau 5  Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo */
CREATE VIEW questionNguyen AS
SELECT Question.* , Accountt.FullName
FROM Question
JOIN Accountt ON Question.CreatorID = Accountt.AccountID
WHERE FullName LIKE 'Nguyen%';

SELECT * FROM questionNguyen;

