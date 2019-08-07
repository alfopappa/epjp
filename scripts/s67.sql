-- temporary
create table users (
    id integer,
    code integer,
    gender char(1)
);

insert into users values(92, 4, 'M');
insert into users values(32, 3, 'F');
insert into users values(31, 2, 'F');
insert into users values(14, 3, 'M');

-- btree index

create index users_id_ix on users(id);

create index users_id_code_ix on users(id, code);

drop index users_id_ix;


-- bitmap index

create bitmap index users_gender_ix on users(gender);

select * from users order by gender;

-- cleanup
drop table users;

