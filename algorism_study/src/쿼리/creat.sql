create table ANIMAL_INS
(
	ANIMAL_ID VARCHAR(50) null comment '동물_아이디',
	ANIMAL_TYPE VARCHAR(50) not null,
	DATETIME DATETIME not null,
	INTAKE_CONDITION VARCHAR(50) not null,
	NAME VARCHAR(50) null,
	SEX_UPON_INTAKE VARCHAR(50) not null,
	constraint ANIMAL_INS_pk
		primary key (ANIMAL_ID)
);



create table ANIMAL_OUTS
(
	ANIMAL_ID VARCHAR(50) null comment '동물_아이디',
	ANIMAL_TYPE VARCHAR(50) not null,
	DATETIME DATETIME not null,
	NAME VARCHAR(50) null,
	SEX_UPON_OUTCOME VARCHAR(50) not null,
	constraint ANIMAL_INS_pk
		primary key (ANIMAL_ID)
);



select * from ANIMAL_INS;

-- 유실된 ANIAML 찾기
SELECT A.ANIMAL_ID, A.NAME FROM animal_outs A
LEFT JOIN ANIMAL_INS B ON A.ANIMAL_ID = B.ANIMAL_ID WHERE B.ANIMAL_ID IS NULL;



## 2번 문제 실행쿼리

delete from ANIMAL_INS where 1=1;
delete from ANIMAL_OUTS where 1=1;

insert into ssooya_study1.animal_ins (ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE) values ('A350276', 'Cat', '2017-08-13 13:50:00', 'Normal', 'Jewel', 'Spayed Female');
insert into ssooya_study1.animal_ins (ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE) values ('A381217', 'Dog', '2017-07-08 09:41:00', 'Sick', 'Cherokee', 'Neutered Male');


insert into ssooya_study1.animal_outs (ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME) values ('A350276', 'Cat', '2018-01-28 17:51:00', 'Jewel', 'Spayed Female');
insert into ssooya_study1.animal_outs (ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME) values ('A381217', 'Dog', '2017-06-09 18:51:00', 'Cherokee', 'Neutered Male');

commit;

## 2번 문제
-- 관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다. 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.


-- A.DATETIME 보호시작일
-- B.입양일

-- 입양일은 보호시작일보다 클 수 없다
SELECT A.ANIMAL_ID, A.NAME FROM ANIMAL_INS A
INNER JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID WHERE A.DATETIME > B.DATETIME ORDER BY A.DATETIME;




## 3번 문제 실행쿼리

delete from ANIMAL_INS where 1=1;
delete from ANIMAL_OUTS where 1=1;

insert into ssooya_study1.animal_ins (ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE) values ('A354597', 'Cat', '2014-05-02 12:16:00', 'Normal', 'Ariel', 'Spayed Female');
insert into ssooya_study1.animal_ins (ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE) values ('A368930', 'Dog', '2014-06-08 13:20:00', 'Normal', null, 'Spayed Female');
insert into ssooya_study1.animal_ins (ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE) values ('A373687', 'Dog', '2014-03-20 12:31:00', 'Normal', 'Rosie', 'Spayed Female');
insert into ssooya_study1.animal_ins (ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE) values ('A412697', 'Dog', '2016-01-03 16:25:00', 'Normal', 'Jackie', 'Neutered Male');
insert into ssooya_study1.animal_ins (ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE) values ('A413789', 'Dog', '2016-04-19 13:28:00', 'Normal', 'Benji', 'Spayed Female');
insert into ssooya_study1.animal_ins (ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE) values ('A414198', 'Dog', '2015-01-29 15:01:00', 'Normal', 'Shelly', 'Spayed Female');


insert into ssooya_study1.animal_outs (ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME) values ('A354597', 'Cat', '2014-05-02 12:16:00', 'Ariel', 'Spayed Female');
insert into ssooya_study1.animal_outs (ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME) values ('A368930', 'Dog', '2014-06-13 15:52:00', null, 'Spayed Female');
insert into ssooya_study1.animal_outs (ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME) values ('A373687', 'Dog', '2014-03-20 12:31:00', 'Rosie', 'Spayed Female');


commit;

## 2번 문제
-- 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 이때 결과는 보호 시작일 순으로 조회해야 합니다.

-- 1조건 : 입양일이 없는 동물
--

SELECT C.NAME, C.DATETIME
FROM (
		 SELECT A.*, ROW_NUMBER() over () AS RNUM
		 FROM ANIMAL_INS A
				  LEFT JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
		 WHERE B.DATETIME IS NULL
	 ) C
WHERE RNUM <= 4
ORDER BY C.DATETIME;


-- 구글링
SELECT A.NAME, A.DATETIME
FROM ANIMAL_INS A
		 LEFT JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE B.DATETIME IS NULL
ORDER BY A.DATETIME
LIMIT 3;





