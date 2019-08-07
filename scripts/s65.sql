create table details (
    detail_id integer
        constraint detail_pk primary key
        constraint detail_id_ck check (mod(detail_id, 2) = 1),
    status char default 'A'
        constraint detail_status_ck check (status in ('A', 'B', 'X')),
    name varchar2(20),
        -- constraint detail_name_nn not null,
        -- constraint detail_name_uq unique,
    coder_id integer
        constraint detail_coder_id_fk references coders(coder_id) on delete cascade,

    constraint detail_name_status_uq unique(name, status));
