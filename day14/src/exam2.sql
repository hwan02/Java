[���̺����]
create table ���̺��(�÷���1   �÷�Ÿ��  [��������],�÷���2  �÷�Ÿ��  [��������],.....);

 -  ���ڷν���(30���̳�) : ���� ��ҹ���,����,Ư������( _ , $ , # ),�ѱ�
 -  �ߺ��Ǵ� �̸��� ���ȵ�
 -  �����(create, table, column��)�� ����Ҽ� ����
 -  �ڷ���
    number :  number(��ü�ڸ�,�Ҽ�����), number  ==> ������(������)
    int    :  ������ ����(������)
    float / double : �Ǽ��� ����(������)
    varchar/varchar2 :  ����,���ڿ�(������) ==> �ִ� 4000byte
    char :                    ����,���ڿ�(������) ==> 2000byte
    date :                    ��¥��
    clob :                    ���ڿ� ===> �ִ�4GB
    blob:                    ���̳ʸ���(�׸�,����,������..)  ===> �ִ�4GB  

  - ��������
     not null :  �ش��÷��� NULL�� ���Ե��� �ʵ��� ��       
     primary key : �� ���� �����ϰ� �ĺ��Ҽ� �ֵ�����   
=======================================================================================
[������]
 : ���������� �������� �ڵ����� �����ϴ� ��ü

create  sequence  ��������
[increment by ������] [start with ���۰�]
[maxvalue  �ִ밪 | minvalue  �ּҰ�]
[cycle | nocycle]
[cache | nocache]

  - increment  by  ������ : ����/���� ����(�⺻�� : 1)
  - start with : ���۹�ȣ(�⺻�� : 1)
  - maxvalue / minvalue : �������� �ִ�/�ּҰ�����
  - cycle/nocycle : �ִ�/�ּҰ��� ���޽� �ݺ����ΰ���
  - cache / nocache : �����Ѽ�����ŭ �޸� �������ΰ��� (�ּҰ� : 2, �⺻�� : 20)
---------------------------------------------------------------------------------
[ insert ]
 : ���̺� ������(���ο���)�߰� -- ���� ���� ����

insert into ���̺�� [ (column1, column2, .....)]   values (value1,value2,.....)
 -  column�� values�� ������ġ
 -  column�� values��  ���� ��ġ

---------------------------------------------------------------------------------
[ update ]
 : ���̺� ���Ե� ���� �����ͼ��� -- ���� ���� ������� ����
   ��ü ������ �Ǽ�(���)�� �޶����� ����
   ���ǿ� �´� ��(�Ǵ� ��)�� �÷����� �����Ҽ� �ִ�

update ���̺��  set  �÷���1=value1, �÷���2=value2 ..... [where  ������]
   - where �� ������ �Ǹ� ��ü���� ����
   - set���� ����������밡��, default�ɼ� ��밡�� 
---------------------------------------------------------------------------------
[ delete ]
 : ���̺� ���Ե� ���������͸� ����  -- ���� ���� ����
   �� ������ �����ǹǷ� ��ü����� �޶���
   
delete [from] ���̺�� [where  ������];
 - where�� �����ϸ� ��ü���� ������
 - �����ʹ� �����ǰ� ���̺� ������ ������

---------------------------------------------------------------------------------
[ tracnsationó�� ]
  : ���� ���۰� ���� �Ϻ��ϰ� ������(commit)
    ó������ ���ͷ�Ʈ(interrupt:���)�� �߻��ϸ� �ǵ��ƿ�(rollback)
==================================================================================================
--edu�������� �α���

--ex1) ���̺� ����
--���̺�� : student
-- idx   �й� varchar(7)    
-- name  �̸� varchar(10)   
-- phone ��ȭ varchar(15) 
-- tall  Ű  float
-- score ���� int
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
--ex2)student���̺��� ���score�� 30���� �����Ͻÿ�
update student;
set score=30;
select * from student;
--ex3)student���̺��� idx�� 1�� �л��� score�� 90, phone�� 010-000-000
--���� �����Ͻÿ�
update student
set score=90, phone='010-000-0000'
where idx=1;
--ex4)student���̺��� score�� 90�� �л��� �����Ͻÿ�
delete from student
where score=90;

--ex5)student���̺��� ��� �л��� �����Ͻÿ�


--ex6)student���̺��� �����Ͻÿ�

===============================================================================
--ex7)���̺����(�������� �߰�)
--���̺�� : emp
-- eno      �����ȣ varchar(5)    primary key
-- ename  ����̸� varchar(10)   not null
-- dept     �μ��̸� varchar(10) 
-- salary    �޿�      int






insert into emp(eno,ename,dept,salary) 
values(1,'kim','developer',1500000);

insert into emp(ename,dept,salary) 
values('lee','engineer',1300000);    -- ���Ἲ �������� ����  not null(eno)

insert into emp(eno,dept,salary) 
values(2,'engineer',1300000);   --���Ἲ �������� ����  not null(ename)

insert into emp(eno,name,dept,salary) 
values(1,'park','engineer',1300000);  --���Ἲ �������� ���� primary key

===============================================================================
--ex8) ���������� / ����
create sequence idx_sql increment by 2 start with 1 maxvalue 9 cycle nocache
select * from user_sequence;
drop sequence idx_sql;
select idx_sql.nextval from dual;
select idx_sql.currentval from dual;

--ex9) ���̺������ ����������
--���̺�� : book
-- num      ��ȣ number        primary key
-- subject  ���� varchar2(50)  
-- price    ���� number 
-- year     �⵵ year
create table book(
	num number primary key,
	subject varchar2(50),
	price number,
	year date
);

create sequence num_seq increment by 1 start with 1 nocycle nocache;

insert into book(num, subject, price, year)
values(num_seq.nextval, '����Ŭ ������ �����ϱ�', 10000, sysdate);

insert into book(num, subject, price, year)
values(num_seq.nextval, '�ڹ� 3�� �ϼ�', 15000, '2017-7-7');

insert into book
values(num_seq.nextval, 'JSP���εǱ�', 18000, to_char(sysdate,'YYYY-MM-DD'));


--=============================================================================
--[����]
--���̺�� : member
-- idx, ����(5), �⺻Ű / name, ����(10), �����X / kor, ����(5) / eng, ����(5) / mat, ����(5)

-- �������� : m_seq, 1���� 1������, nocycle, nocache

--����Ÿ : �Ѹ�, 90, 80,95
--         ��ġ, 75, 90,65
--         ��浿, 100,95,90
--         ������, 60,60,60
--         �����, 75,80,75
--         ����, 80,78,90
-- idx�� �ڵ����� 1���������� �����ÿ�

--select������ ������ ���� ����Ͻÿ�
--����1)��պ� �������� �����Ͻÿ�
--����2)����� �Ҽ������� 2°�ڸ����� ����Ͻÿ�
--����3)Ÿ��Ʋ�� �Ʒ��� ���� ó���� �ֽÿ�

--�й�     �̸�    ����   ����   ����    ����   ���
-- -----------------------------------------------------
--  1      �Ѹ�    90     80     96       266    88.66

