�� SQL��
1. ����Ÿ ���۾�(DML : Data Manipulation Language)
    : insert, update, delete, merge
2. ����Ÿ ���Ǿ�(DDL : Data Definition Language)
    : create, alter, drop, rename, truncate    
3. ����Ÿ�˻�
    : select 
4. Ʈ����������
    : commit, rollback, savepoint
5. ����Ÿ �����(DCL : Data Control Language)
    : grant,  revoke


�� select
[����]
 select [distinct] [�÷�1,�÷�2,.....][as ����][ || ������][*]
 from ���̺��
 [where ������] 

distinct : �ߺ�����
* : ���
������ : and,or,like,in,between and,is null,is not null
==================================================================================
--hr�������� �α���

select * from tab;         -- ���̺� ���Ȯ���ϱ�
select * from employees;   --employees���̺��� ����Ȯ���ϱ�
select * from departments; 

--ex1)employees���̺��� ��� ����� �����ȣ,�̸�(last_name),�޿� �˻�
select employee_id, last_name, salary
from employees;

--ex2)employees���̺��� ��� ����� �̸�, �Ի���, ����ID �� �˻� 
select last_name, hire_date, job_id
from EMPLOYEES;

--ex3)employees���̺��� ��� ����� �̸�(last_name), ����(salary*12)�� �˻�
select last_name, salary*12
from EMPLOYEES;

--ex4)������̱�(as�� ��������)
--    employees���̺��� ��� ����� �����ȣ,�̸�(last_name),�޿� �˻�
--    ����) title �����ȣ, �̸� ,�޿��� ����Ұ�
select employee_id as "�����ȣ", last_name as "�̸�", salary as "�޿�"
from EMPLOYEES;
--ex5) employee���̺��� �����ȣ,�̸�,������ ���Ͻÿ�
--     ����1) ���� = �޿� * 12
--     ����2) ������ �����ȣ, �̸�,�������� ���
select employee_id as "�����ȣ", last_name as "�̸�", salary*12 as "����"
from EMPLOYEES;
--ex6) ���Ῥ����( || ) : �÷��� �����ؼ� ���
--    first_name��  last_name�� �����ؼ� ����Ͻÿ�
--     ��   ��
--     ------------
--     Ellen   Abel
select first_name || '   ' || last_name as "��    ��"
from EMPLOYEES

--ex7) ����ó�� ����Ͻÿ�
--   �����ȣ    ��  ��        �� ��
--   ---------------------------------------------
--    100      Steven King   288000�޷� 
select employee_id as "�����ȣ", first_name || '   ' || last_name as "��    ��", salary*12 || '�޷�'  as "����"
from EMPLOYEES;        
--ex8) ����ó�� ����Ͻÿ� (last_name, job_id�̿�)
--     Employee  Detail
--     --------------------
--     King  is a  AD_PRES
select last_name || '  is a  ' || job_id as "Employee Detail"
from EMPLOYEES;


--�ߺ�����(distinct)
--ex9)employees���̺��� �μ��� ����Ͻÿ�
--    ����1)�ߺ��Ǵ� �μ��� 1���� ����Ͻÿ�
--    ����2)�μ��� ������������ �����ֽÿ�
select distinct department_id as "�μ�"
from EMPLOYEES;
order by department_id asc; --�������� desc, asc�� �������� 
--ex10) 10���μ� �Ǵ� 90���μ� ������� �̸�,�Ի���,�μ�ID�� ����Ͻÿ�
select last_name, hire_date, department_id
from EMPLOYEES
where department_id = 10 or department_id =90;
--ex11)�޿��� 2500�̻� 3500�̸��� ����� �̸�(last), �Ի���, �޿��� �˻��Ͻÿ�
select last_name, hire_date, salary
from EMPLOYEES
where salary>=2500 and salary<3500;
--ex12) �޿��� 2500���� �̰ų� 3000�̻��̸鼭, 90�� �μ��� ����� �̸�, �޿�, �μ�ID�� ����Ͻÿ�.
--      ����1) ������ �����, ��  ��, �μ��ڵ�� �Ͻÿ�
--      ����2) �޿��տ� $�� ���̽ÿ�
--      ����3) ������� first_name�� last_name�� �����ؼ� ����Ͻÿ�
select first_name || '   ' || last_name �����, '$' || salary "�� ��", department_id �μ��ڵ�  
from EMPLOYEES
where (salary<=2500 or salary>=3000) and department_id =90;

--ex13) 'King'����� ��� �÷��� ǥ���Ͻÿ�
select * 
from employees
where last_name='King';   -->���ڿ��˻��Ҷ� ��.�ҹ��ڸ� ����

SELECT *
FROM EMPLOYEES
WHERE UPPER(LAST_NAME)='KING';   --->���ڿ��� �빮�ڷ�

SELECT *
FROM EMPLOYEES
WHERE LOWER(LAST_NAME)='king';   --->���ڿ��� �ҹ��ڷ�

-- like  : ���ڸ� ����
-- '%d'      d�� ������ 
-- 'a%'      a�� �����ϴ�
-- '%test%'   test�� ���ԵǾ��ִ�
-- ��)  select * from employees where first_name like '%net%';
--ex14)����ID�� CL�� ���ԵǾ��ִ� ������� �̸�,����ID,�μ�ID�� ����Ͻÿ� --45��


--ex15) ����ID��  IT�� �����ϴ� ������� �̸�,����ID,�μ�ID�� ����Ͻÿ� --5��


--ex16) is null / is not null 
--Ŀ�̼��� �޴� ������� �̸��� �޿�,Ŀ�̼��� ����Ͻÿ�--35��


--ex17)Ŀ�̼��� ���� �ʴ� ������� �̸��� �޿�,Ŀ�̼��� ����Ͻÿ�--72��


--ex18) in������(or�������� �ٸ�ǥ��)
--����ID��  FI_MGR�̰ų�  FI_ACCOUNT�� ������� �����ȣ,�̸�,������ ����Ͻÿ�   --6��

--���1


--���2


--ex19) between������(and�������� �ٸ� ǥ��) : �ʰ�,�̸������� ����Ҽ� ����
--�޿���  10000�̻�  20000������ ����� �����ȣ,�̸�,�޿��� ����Ͻÿ�   --18��

--���1


--���2


--==============================================================================
--[����1] ����ID�� 'SA_REP' �̰ų� 'AD_PRES' �̸鼭, �޿��� 15000�� �ʰ��ϴ� 
--������� �̸�,����ID,�޿��� ����Ͻÿ�  --1��
--�̸�        ����ID            ��  ��
-- --------------------------------------
--King       AD_PRES            24000��



------------------------------------------------------------------------------
--[����2] Employees���̺��� ����ID�� �ߺ����� �ʰ� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ� --19��
-- JOB_ID
-- ---------
--AC_ACCOUNT
--AC_MGR
--     :


-----------------------------------------------------------------------------
--[����3] �Ի����� 03���� ������� �����ȣ,�̸�,�Ի����� ǥ���Ͻÿ� --6��




=======================================================================================
[������]
=  : ����
!=,  ^=,  <> : �����ʴ�
>=, <=, >, < : ũ�ų�����,�۰ų�����,ũ��,�۴�
and, or, between and, in, like, is null/is not null

�� select 
select  [distinct] [�÷�1, �÷�2.......][*][ ||���Ῥ����][AS ����]
from ���̺��
[where ������]
[order by �÷��� asc|desc ]

order by : ����
                asc  - ��������(��������)
                desc - ��������
�÷��� : ���ڷε� ����
=======================================================================================
--ex1) �����,�μ�ID,�Ի����� �μ����� �������� �����Ͻÿ�
select last_name, department_id, hire_date
from employees
order by  2 desc;      -- order by department_id desc;


--ex2) �����, �μ�ID, �Ի�����  �μ����� �������� �����Ͻÿ�
--     �����μ��� ��������  �Ի��ϼ����� �����Ͻÿ�
select last_name,department_id,hire_date 
from employees
order by 2 desc, 3 asc;    -- asc ��������


--ex3) ������� ������ ������ ���������� �������������Ͻÿ�
--�� ��     �� ��     
-- ---------------
--King      28800
select  last_name as "�� ��", salary*12 as "�� ��"
from employees
order by 2 desc;
