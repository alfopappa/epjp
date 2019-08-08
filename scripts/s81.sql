set serveroutput on

declare
    cursor v_coder_cursor is
        select first_name, last_name, salary from coders;
begin
    for v_cur in v_coder_cursor loop
        dbms_output.put_line('[' || v_cur.first_name || ', ' || v_cur.last_name || ', '|| v_cur.salary ||']');
    end loop;
end;
/
--Questo esempio, che sta a pagina 81 delle slide, è stato modificato in classe aggiungendo i salary e il first_name.
--Di conseguenza questo esercizio è quello modificato.