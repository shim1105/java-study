
/* Drop Tables */

DROP TABLE board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE board
(
	num number(10,0),
	title nvarchar2(150),
	contents nvarchar2(4000)
);



