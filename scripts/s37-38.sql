--Nome degli employees e del loro department
select first_name, department_name
from employees left outer join departments
using(department_id);

--Nome degli employees e job title (da JOBS)
select first_name, job_title
from employees left outer join jobs
using (job_id);

--Nome degli employees che hanno il salario minimo o massimo previsto per il loro job title (1)
select e.first_name, e.last_name, e.salary
from employees e join jobs j 
on (e.job_id = j.job_id and (e.salary = j.min_salary or e.salary = j.max_salary));

--Nome degli employees che hanno il salario minimo o massimo previsto per il loro job title (2)
select first_name, last_name, jobs.min_salary, jobs.max_salary
from employees natural join jobs
where salary in (min_salary, max_salary);

--Nome degli employees basati in UK (LOCATIONS)
select first_name, last_name, country_id
from employees join departments 
using (department_id)
join locations on departments.location_id = locations.location_id
where locations.country_id = 'UK';

--Nome dei departments e manager associato
select first_name, last_name, department_name
from departments left outer join employees
on employees.employee_id = departments.manager_id;

--Nome di ogni department e, se esiste, del relativo manager
select first_name, last_name, department_name
from departments join employees
on employees.employee_id = departments.manager_id;

--Nome dei department che non hanno un manager associato
select first_name, last_name, department_name
from departments left outer join employees
on employees.employee_id = departments.manager_id
where departments.manager_id is null;

--Nome degli employees e del loro manager
select e.first_name as "Employee Name", e.last_name as "Employee Lastname", m.last_name as "Manager"
from employees e left outer join employees m
on (e.manager_id = m.employee_id);

--Nome degli employees che non sono manager
select e.first_name as "Employee Name", e.last_name as "Employee LastName"
from employees e left outer join employees m
on (e.manager_id = m.employee_id)
where e.employee_id not in m.manager_id;


select distinct manager_id
from employees































