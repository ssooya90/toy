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



create table ANIMAL_OUT
(
	ANIMAL_ID VARCHAR(50) null comment '동물_아이디',
	ANIMAL_TYPE VARCHAR(50) not null,
	DATETIME DATETIME not null,
	NAME VARCHAR(50) null,
	SEX_UPON_OUTCOME VARCHAR(50) not null,
	constraint ANIMAL_INS_pk
		primary key (ANIMAL_ID)
);
