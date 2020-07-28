CREATE DATABASE IF NOT EXISTS qlbaithi;
use qlbaithi;
CREATE TABLE Department 
(
 DepartmentID   INT  PRIMARY KEY AUTO_INCREMENT ,
 DepartmentName NVARCHAR(50) NOT NULL
 );
 CREATE TABLE Position  
 (
 PositionID   INT           PRIMARY KEY AUTO_INCREMENT ,
 PositionName NVARCHAR(50)  NOT NULL
 );
 CREATE TABLE  Accountt 
 (
 AccountID    INT PRIMARY KEY AUTO_INCREMENT ,
 Email        NVARCHAR(50)  UNIQUE KEY ,
 Username     NVARCHAR(50) NOT NULL ,
 Fullname     NVARCHAR(50) NOT NULL,
 DepartmentID INT   ,
 PositionID   INT   ,
 CreateDate   DATETIME  NOT NULL,
 
 CONSTRAINT DepartmentIDqs FOREIGN KEY (DepartmentID) REFERENCES Department (DepartmentID) ON DELETE CASCADE,
 CONSTRAINT PositionIDqs FOREIGN KEY (PositionID) REFERENCES Position (PositionID) ON DELETE CASCADE
 );
 CREATE TABLE Groupp
 (
 GroupID     INT   PRIMARY KEY AUTO_INCREMENT,
 GroupName   NVARCHAR(50)      NOT NULL,
 CreatorID   INT  ,
 CreateDate  DATETIME NOT NULL 
 );
  CREATE TABLE GroupAccount 
  (
  GroupID    INT,
  AccountID  INT,
  JoinDate   DATETIME  NOT NULL,
  
  CONSTRAINT GroupIDqs FOREIGN KEY (GroupID) REFERENCES Groupp (GroupID) ON DELETE CASCADE,
  CONSTRAINT AccountIDqs FOREIGN KEY (AccountID) REFERENCES Accountt (AccountID) ON DELETE CASCADE
  );
  CREATE TABLE TypeQuestion 
  (
  TypeID   INT  PRIMARY KEY AUTO_INCREMENT     ,
  TypeName NVARCHAR(50) NOT NULL
  );
  CREATE TABLE CategoryQuestion  
  (
  CategoryID   INT PRIMARY KEY  AUTO_INCREMENT,
  CategoryName NVARCHAR(50) NOT NULL
  );
  CREATE TABLE  Question  
  (
  QuestionID INT PRIMARY KEY AUTO_INCREMENT,
  Content    NVARCHAR(50) NOT NULL,
  CategoryID INT,
  TypeID     INT,
  CreatorID  INT,
  CreateDate DATETIME NOT NULL,

  CONSTRAINT CategoryIDqs FOREIGN KEY(CategoryID) 	REFERENCES CategoryQuestion(CategoryID) ON DELETE CASCADE,
  CONSTRAINT TypeID FOREIGN KEY(TypeID) 		REFERENCES TypeQuestion(TypeID) ON DELETE CASCADE
  );
  CREATE TABLE Answer 
  (
  AnswerID   INT PRIMARY KEY AUTO_INCREMENT,
  Content    NVARCHAR(50) NOT NULL,
  QuestionID INT,
  isCorrect  BOOL NOT NULL,
  CONSTRAINT QuestionIDqs FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID) ON DELETE CASCADE
  );
  CREATE TABLE  Exam  
  (
  ExamID     INT PRIMARY KEY AUTO_INCREMENT,
  _Code      CHAR(10) NOT NULL,
  Title      NVARCHAR(50) NOT NULL,
  CategoryID INT,
  Duration   INT NOT NULL,
  CreatorID  INT,
  CreateDate DATETIME NOT NULL
  );
  
  CREATE TABLE ExamQuestion 
  (
   ExamID     INT NOT NULL,
   QuestionID INT NOT NULL,
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID),
    FOREIGN KEY(ExamID) REFERENCES Exam(ExamID)
   );