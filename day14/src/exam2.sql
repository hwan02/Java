[테이블생성]
create table 테이블명(컬럼명1   컬럼타입  [제약조건],컬럼명2  컬럼타입  [제약조건],.....);

 -  문자로시작(30자이내) : 영문 대소문자,숫자,특수문자( _ , $ , # ),한글
 -  중복되는 이름은 사용안됨
 -  예약어(create, table, column등)은 사용할수 없다
 -  자료형
    number :  number(전체자리,소수이하), number  ==> 숫자형(가변형)
    int    :  정수형 숫자(고정형)
    float / double : 실수형 숫자(고정형)
    varchar/varchar2 :  문자,문자열(가변형) ==> 최대 4000byte
    char :                    문자,문자열(고정형) ==> 2000byte
    date :                    날짜형
    clob :                    문자열 ===> 최대4GB
    blob:                    바이너리형(그림,음악,동영상..)  ===> 최대4GB  

  - 제약조건
     not null :  해당컬럼에 NULL을 포함되지 않도록 함       
     primary key : 각 행을 유일하게 식별할수 있도록함   
=======================================================================================
[시퀀스]
 : 순차적으로 정수값을 자동으로 생성하는 객체

create  sequence  시퀀스명
[increment by 증가값] [start with 시작값]
[maxvalue  최대값 | minvalue  최소값]
[cycle | nocycle]
[cache | nocache]

  - increment  by  증가값 : 증가/감소 간격(기본값 : 1)
  - start with : 시작번호(기본값 : 1)
  - maxvalue / minvalue : 시퀀스의 최대/최소값지정
  - cycle/nocycle : 최대/최소값에 도달시 반복여부결정
  - cache / nocache : 지정한수량만큼 메모리 생성여부결정 (최소값 : 2, 기본값 : 20)
---------------------------------------------------------------------------------
[ insert ]
 : 테이블에 데이터(새로운행)추가 -- 행의 수가 변경

insert into 테이블명 [ (column1, column2, .....)]   values (value1,value2,.....)
 -  column과 values의 순서일치
 -  column과 values의  개수 일치

---------------------------------------------------------------------------------
[ update ]
 : 테이블에 포함된 기존 데이터수정 -- 행의 수가 변경되지 않음
   전체 데이터 건수(행수)는 달라지지 않음
   조건에 맞는 행(또는 열)의 컬럼값을 갱신할수 있다

update 테이블명  set  컬럼명1=value1, 컬럼명2=value2 ..... [where  조건절]
   - where 이 생략이 되면 전체행이 갱신
   - set절은 서브쿼리사용가능, default옵션 사용가능 
---------------------------------------------------------------------------------
[ delete ]
 : 테이블에 포함된 기존데이터를 삭제  -- 행의 수가 변경
   행 단위로 삭제되므로 전체행수가 달라짐
   
delete [from] 테이블명 [where  조건절];
 - where을 생략하면 전체행이 삭제됨
 - 데이터는 삭제되고 테이블 구조는 유지됨

---------------------------------------------------------------------------------
[ tracnsation처리 ]
  : 일의 시작과 끝이 완벽하게 마무리(commit)
    처리도중 인터럽트(interrupt:장애)가 발생하면 되돌아옴(rollback)
==================================================================================================
--edu계정으로 로그인

--ex1) 테이블 생성
--테이블명 : student
-- idx   학번 varchar(7)    
-- name  이름 varchar(10)   
-- phone 전화 varchar(15) 
-- tall  키  float
-- score 점수 int
create table student(
idx varchar(7),
name varchar(10),
phone varchar(15),
tall float,
score int
);

select * from tab;
select * from student;

insert into student(idx, name, phone, tall, score)
values (1, 'kim', '010-111-1234', 175.4, 95);

insert into student(idx, name, phone, tall, score)
values (2, 'lee', '010-555-4321', 165.4, 85);

insert into student(name, phone, score)
values ('lee', '010-777-7788', 90);
-- ---------------------------------------------------------------------------------
--ex2)student테이블의 모든score를 30으로 수정하시오
update student;
set score=30;
select * from student;
--ex3)student테이블의 idx가 1인 학생의 score를 90, phone를 010-000-000
--으로 변경하시오
update student
set score=90, phone='010-000-0000'
where idx=1;
--ex4)student테이블에서 score가 90인 학생을 삭제하시오
delete from student
where score=90;

--ex5)student테이블의 모든 학생을 삭제하시오


--ex6)student테이블을 삭제하시오

===============================================================================
--ex7)테이블생성(제약조건 추가)
--테이블명 : emp
-- eno      사원번호 varchar(5)    primary key
-- ename  사원이름 varchar(10)   not null
-- dept     부서이름 varchar(10) 
-- salary    급여      int






insert into emp(eno,ename,dept,salary) 
values(1,'kim','developer',1500000);

insert into emp(ename,dept,salary) 
values('lee','engineer',1300000);    -- 무결성 제약조건 위배  not null(eno)

insert into emp(eno,dept,salary) 
values(2,'engineer',1300000);   --무결성 제약조건 위배  not null(ename)

insert into emp(eno,name,dept,salary) 
values(1,'park','engineer',1300000);  --무결성 제약조건 위배 primary key

===============================================================================
--ex8) 시퀀스생성 / 삭제
create sequence idx_sql increment by 2 start with 1 maxvalue 9 cycle nocache
select * from user_sequence;
drop sequence idx_sql;
select idx_sql.nextval from dual;
select idx_sql.currentval from dual;

--ex9) 테이블생성과 시퀀스적용
--테이블명 : book
-- num      번호 number        primary key
-- subject  제목 varchar2(50)  
-- price    가격 number 
-- year     년도 year
create table book(
	num number primary key,
	subject varchar2(50),
	price number,
	year date
);

create sequence num_seq increment by 1 start with 1 nocycle nocache;

insert into book(num, subject, price, year)
values(num_seq.nextval, '오라클 무작정 따라하기', 10000, sysdate);

insert into book(num, subject, price, year)
values(num_seq.nextval, '자바 3일 완성', 15000, '2017-7-7');

insert into book
values(num_seq.nextval, 'JSP달인되기', 18000, to_char(sysdate,'YYYY-MM-DD'));


--=============================================================================
--[문제]
--테이블명 : member
-- idx, 숫자(5), 기본키 / name, 문자(10), 널허용X / kor, 숫자(5) / eng, 숫자(5) / mat, 숫자(5)

-- 시퀀스명 : m_seq, 1부터 1씩증가, nocycle, nocache

--데이타 : 둘리, 90, 80,95
--         또치, 75, 90,65
--         고길동, 100,95,90
--         마이콜, 60,60,60
--         도우너, 75,80,75
--         희동이, 80,78,90
-- idx는 자동으로 1씩증가값을 넣으시오

--select문으로 다음과 같이 출력하시오
--조건1)평균별 내림차순 정렬하시오
--조건2)평균은 소수점이하 2째자리까지 출력하시오
--조건3)타이틀은 아래와 같이 처리해 주시오

--학번     이름    국어   영어   수학    총점   평균
-- -----------------------------------------------------
--  1      둘리    90     80     96       266    88.66

