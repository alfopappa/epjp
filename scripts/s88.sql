--Scrivere e invocare la procedura tomorrow() che stampa la data di domani
set serveroutput on

create or replace procedure tomorrow is
begin
dbms_output.put_line(sysdate + 1);
end tomorrow;
/

begin
tomorrow;
end;
/

--Modificare tomorrow() per fargli accettare come parametro un nome da stampare
set serveroutput on

create or replace procedure tomorrow_name(
t_name in varchar2) is 
begin
dbms_output.put_line(t_name);
end tomorrow_name;
/

declare 
t_name varchar2(20) := 'Alfonso';
begin
tomorrow_name(t_name);
end;
/


--Scrivere e invocare la procedura get_coder() che ritorna nome e cognome di un coder identificato via id
set serveroutput on

create or replace procedure get_coder(
p_coder_id in coders.coder_id%type,
p_first_name out coders.first_name%type,
p_last_name out coders.last_name%type) is
begin
select first_name, last_name
into p_first_name, p_last_name
from coders
where coder_id = p_coder_id;
end get_coder;
/

declare
v_first_name coders.first_name%type;
v_last_name coders.last_name%type;
begin
select first_name, last_name
into v_first_name, v_last_name
from coders
where coder_id = 202;
dbms_output.put_line('[' || v_first_name || ' ' || v_last_name || ']');
end;
/

--Scrivere e invocare la funzione tomorrow() che stampa la data di 6 giorni dopo oggi
set serveroutput on

create or replace function day_after(
p_date in date, 
p_date_after in integer)
return date as
v_day_after date;
begin 
v_day_after := p_date + p_date_after;
return v_day_after;
end day_after;
/

declare
v_date date := '07-MAR-20';
v_date_after integer := 6;
v_day_after date;
begin
v_day_after := day_after(v_date, v_date_after);
dbms_output.put_line(v_day_after);
end;
/



































