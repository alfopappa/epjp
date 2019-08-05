--hello
select *       --Tutta la tabella
from regions;

select region_id, region_name
from regions;

select region_name
from regions; -- colonne


select *
from regions 
where region_id = 1; --righe



select sysdate   --La tabella dual
from dual;

select 4*3 
from dual;



select rowid, rownum
from regions;


select country_name
from countries
where country_id = 'IT'; --esempio



select table_name
from user_tables;


select *
from user_tables;


select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS';


select 1+2, 3-4, 2*6, 5/2
from dual;


select to_date('30-NOV-2019') + 2, to_date('02-NOV-2019') - 3 from dual;


select to_date('02-NOV-2019') - to_date('25-MAR-2019') from dual;


select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;


select job_title, min_salary as original, min_salary salary
from jobs;


select job_title, min_salary + 2000 "increased min salary"
from jobs;


select first_name || ' ' || last_name as "Employee's name"
from employees;


select email || ' ' || last_name || ': ' || salary as "@ salary"       --esempio
from employees;


select first_name, last_name, commission_pct
from employees
where commission_pct is null;


select first_name, last_name, 12 * salary * commission_pct
from employees;


select first_name, last_name, 12 * salary * nvl(commission_pct, 0)
from employees;


select manager_id
from employees;


select distinct manager_id
from employees;


select last_name
from employees
where last_name = 'King';  --esempio


select * 
from regions 
where region_id = 1;


select * 
from regions 
where region_id != 2;


select *
from regions
where region_id < 3;


select *
from regions
where region_id <= 3;


select * 
from regions
where region_id > any(1, 2, 3);


select *
from regions
where region_id > all(1, 2, 3);


select last_name
from employees 
where last_name like '_ul%';


select last_name
from employees
where last_name like 'A%'; --esempio


select * 
from regions 
where region_id not in (2, 3);


select * 
from regions 
where region_id not in (2, 3, null);


select * 
from regions
where region_id between 2 and 3;


select * 
from employees
where manager_id is null;


select *
from employees
where salary between 10000 and 20000;


select *
from employees
where salary < 3000 and employee_id > 195;


select * 
from employees
where salary > 20000 or last_name = 'King';


select * 
from employees
where not department_id > 20;


select * 
from employees
order by last_name;


select * 
from employees
order by last_name desc, first_name asc;


select first_name, last_name
from employees
order by 2;



-------
--JOIN
select region_name 
from regions
where region_id = 1;
select country_name
from countries
where region_id = 1;


select region_name, country_name
from regions, countries
where regions.region_id = countries.region_id;


--ALIAS PER TABELLE
select r.region_name, c.country_name
from regions r, countries c
where r.region_id = c.region_id;


--SQL/92
select region_name, country_name
from regions join countries -- join è “inner” per default
using(region_id);


--NATURAL JOIN
select region_name, country_name
from regions natural join countries;


--JOIN-ON
select region_name, country_name
from regions join countries
on(regions.region_id = countries.region_id);


--JOIN – ON
select region_name, country_name
from regions r join countries c
on(r.region_id = c.region_id)
where r.region_id = 1;

--JOIN – USING
select region_name, country_name
from regions join countries
using(region_id)
where region_id = 1;

--NATURAL JOIN
select region_name, country_name
from regions natural join countries
where region_id = 1;


select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id);


select employee_id, city, department_name
from employees e join departments d on d.department_id = e.department_id
join locations l on d.location_id = l.location_id;



select *
from employees left outer join departments
using(department_id)
where last_name = 'Grant';


select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120;


select e.last_name, d.department_name
from employees e full outer join departments d      --}PARCONDICIO JOIN
on (e.department_id = d.department_id)
where last_name = 'Grant'
or d.department_id between 110 and 120;










