select first_name, last_name, email, phone_number, hire_date
from employees
order by last_name asc, first_name asc;


select *
from employees
where first_name = 'Peter' or first_name = 'David'; 


select *
from employees
where department_id = 60;


select *
from employees
where department_id = 30 or department_id = 50;


select *
from employees
where salary > 10000;


select * 
from employees
where salary < 4000 or salary > 15000;


select *
from employees
where salary < 4000 or salary > 15000 and department_id in (50, 80);


select *
from employees
where hire_date like '%05';


select job_id
from employees
order by job_id asc;


select *
from employees
where commission_pct is not null;


select first_name, last_name
from employees
where first_name like ('%a%') or last_name like ('%a%');


select first_name
from employees
order by first_name asc;


select street_address
from locations;








 











