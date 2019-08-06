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
