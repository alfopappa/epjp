create table items (
    item_id integer primary key,
    status char,
    name varchar2(20),
    coder_id integer);
    
create table coders
as
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

select *
from coders;

select *
from details;

