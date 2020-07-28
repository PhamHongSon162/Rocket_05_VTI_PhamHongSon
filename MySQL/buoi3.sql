USE qlbaithi;

SELECT * FROM department;

SELECT DeparmentID FROM department WHERE DepartmentName = 'Sale';

SELECT GroupName FROM Groupp WHERE CreateDate < '2019-12-20';

SELECT * FROM Accountt WHERE LENGTH(Fullname) = (SELECT Max(LENGTH(Fullname)) FROM Accountt ) ORDER BY Fullname DESC;

SELECT * FROM Accountt WHERE LENGTH(Fullname) = (SELECT Max(LENGTH(Fullname)) FROM Accountt ) AND DepartmentID ='3' ;

SELECT  QuestionID FROM Answer GROUP BY QuestionID  HAVING count(QuestionID) >= 4 ;

SELECT _code FROM Exam WHERE Duration >= 60 AND CreateDate < '2019-12-20' ;

SELECT * FROM Groupp ORDER BY CreateDate DESC LIMIT 5;

SELECT 	COUNT(Email) FROM  Accountt WHERE DepartmentID = 2;

SELECT FullName FROM Accountt WHERE FullName LIKE 'D%o' ;







