create table "user"
(
    -- Only integer types can be auto increment
    id uuid default uuid_generate_v4()  not null,
    login varchar,
    password varchar,
    role role
);

create unique index user_id_uindex
	on "user" (id);

alter table "user"
    add constraint user_pk
        primary key (id);

