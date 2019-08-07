--Salary: maggiore, minore, somma, media
select round(avg(salary)), sum(salary), max(salary), min(salary)
from employees;

--Come sopra, ma per ogni job_id
select round(avg(salary)), sum(salary), max(salary), min(salary)
from employees
group by job_id;

--Quanti dipendenti per ogni job_id
select count(employee_id), job_id
from employees
group by job_id;

--Quanti sono gli IT_PROG
select count(employee_id), job_id
from employees
group by job_id
having job_id = 'IT_PROG';

--Quanti sono i manager
select count(manager_id)
from employees;

--Qual è la differenza tra il salario maggiore e il minore
select (max(salary) - min(salary))
from employees;

--Come sopra, ma per ogni job_id, non considerando dove non c’è differenza
select (max(salary) - min(salary)), job_id
from employees
group by job_id
having (max(salary) - min(salary)) != 0;

--Qual è il salario minimo con i dipendenti raggruppati per manager, non considerare chi non ha manager, né i gruppi con salario minimo inferiore a 6.000€
select min(salary)
from employees
group by manager_id
having min(salary) >= 6000;

--Indirizzi completi, tra locations e countries
select street_address, postal_code, city, state_province, country_name
from locations inner join countries
using (country_id);

--Employees
--Name e department name
select first_name, last_name, department_name
from employees join departments
using(department_id);

--Come sopra, ma solo per chi è basato a Toronto
select first_name, last_name, department_name
from employees join departments
using(department_id)
join locations
using(location_id)
where city = 'Toronto';

--Chi è stato assunto dopo David Lee
select first_name, last_name, hire_date
from employees
where hire_date > (select hire_date from employees
where first_name = 'David' and last_name = 'Lee');

--Chi è stato assunto prima del proprio manager
select e.first_name, e.last_name, e.hire_date
from employees e left outer join employees m
on (e.manager_id = m.employee_id)
where e.hire_date < m.hire_date;

--Chi ha lo stesso manager di Lisa Ozer


@TODO















