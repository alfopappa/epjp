drop table books;
drop table authors;
drop table book_author;
drop table users;
drop table out_books;
drop table out_hist;







create table books(
book_id integer
constraint book_pk primary key,
publishing_house varchar2(20),
title varchar2(20),
author_id integer);

create table authors(
author_id integer
constraint author_pk primary key,
first_name varchar2(20),
last_name varchar2(20));

create table book_author(
book_id integer references books(book_id),
author_id integer references authors(author_id));


create table users(
user_id integer
constraint user_pk primary key,
first_name varchar2(20),
last_name varchar2(20));


create table out_books(
out_id integer
constraint out_pk primary key,
user_id integer references users(user_id),
book_id integer references books(book_id),
start_date date,
end_date date);

create table out_hist(
hist_id integer
constraint hist_pk primary key,
user_id integer references users(user_id),
book_id integer references books(book_id),
end_date date);

insert into authors(author_id, first_name, last_name)
values (1, 'Dan', 'Brown');
insert into authors(author_id, first_name, last_name)
values (2, 'Paulo', 'Coelho');
insert into authors(author_id, first_name, last_name)
values (3, 'Anna', 'Frank');











insert into books(book_id, publishing_house, title, author_id)
values (2004, 'Mondadori', 'The Da Vinci Code', 1);
insert into books(book_id, publishing_house, title, author_id)
values (1988, 'Bompiani', 'O Alchimista', 2);
insert into books(book_id, publishing_house, title, author_id)
values (1954, 'Einaudi', 'Het Achterhuis', 3);
insert into books(book_id, publishing_house, title, author_id)
values (2000, 'Mondadori', 'Angels and Demons', 1);





insert into book_author(book_id, author_id)
values (2004, 1);
insert into book_author(book_id, author_id)
values (1988, 2);
insert into book_author(book_id, author_id)
values (1954, 3);
insert into book_author(book_id, author_id)
values (2000, 1);


insert into users(user_id, first_name, last_name)
values (99, 'Alfonso', 'Pappalardo');
insert into users(user_id, first_name, last_name)
values (98, 'Giacomo', 'Gaglione');
insert into users(user_id, first_name, last_name)
values (97, 'Maurizio', 'Pilato');
insert into users(user_id, first_name, last_name)
values (96, 'Emanuele', 'Baldi');



select title
from books
where author_id = 1;

insert into out_books(out_id, user_id, book_id, start_date, end_date)
values (999, 96, 2000, sysdate, '09-SET-19');
insert into out_books(out_id, user_id, book_id, start_date, end_date)
values (990, 98, 1954, '07-MAR-19', sysdate);
insert into out_books(out_id, user_id, book_id, start_date, end_date)
values (980, 99, 2004, '10-SET-19', '25-DIC-19');



insert into out_hist(hist_id, user_id, book_id, end_date)
values (2, 96, 2000, null);
insert into out_hist(hist_id, user_id, book_id, end_date)
values (1, 98, 1954, sysdate);
insert into out_hist(hist_id, user_id, book_id, end_date)
values (3, 99, 2004, null);


select *
from authors;

select *
from books;

select *
from out_books;

select *
from out_hist;


select first_name, last_name
from authors
where regexp_like (first_name,'u','i') or regexp_like (last_name,'e', 'i');

select first_name, last_name, round( months_between(start_date, end_date))
from users natural join out_books;

update users 
set first_name = 'Rkkion'
where user_id = 96;

select *
from users;

set serveroutput on

create or replace procedure get_user(
p_user_id in users.user_id%type,
p_first_name out users.first_name%type,
p_last_name out users.last_name%type) is
begin
select first_name, last_name
into p_first_name, p_last_name
from users
where user_id = p_user_id;
end get_user;
/

declare
v_first_name users.first_name%type;
v_last_name users.last_name%type;
begin
select first_name, last_name
into v_first_name, v_last_name
from users
where user_id = 99;
dbms_output.put_line('[' || v_first_name || ' ' || v_last_name || ']');
end;
/




