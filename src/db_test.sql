
/* Drop Tables */

DROP TABLE USER_INFO CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE USER_INFO
(
	UI_NUM  number(10,0),
	UI_NAME nvarchar2(100) NOT NULL,
	UI_AGE  number(3,0) NOT NULL
);



