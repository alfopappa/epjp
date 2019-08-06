--Qual è il salario corrente, quale sarebbe con un incremento dell’8.5%, qual è il delta come valore assoluto?
select first_name, last_name, salary, (((salary*8)/100) + salary) as "Salary's 8% increase", abs((salary*8)/100) as "Delta as absolute value"
from employees;

--Chi ha ‘a’ nel nome o cognome
select first_name, last_name
from employees
where regexp_like (first_name,'a','i') or regexp_like (last_name,'a', 'i');

--Quanti mesi sono passati dall’assunzione a oggi
select first_name, last_name, round( months_between(sysdate, hire_date))
from employees;

--Salario mostrato come una serie di asterischi (1 = 1000€)
select salary, rpad('*',round(salary/1000), '*')
from employees;

--Quant’è la commissione di ognuno o ‘no value’
select nvl2(commission_pct, to_char(commission_pct, '99.90'), 'no value') 
from employees;





