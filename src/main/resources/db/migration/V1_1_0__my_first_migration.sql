create table dev."user"
(
    id serial not null,
    login varchar not null,
    password varchar not null,
    role varchar not null
);

create unique index user_id_uindex
	on dev."user" (id);

create unique index user_login_uindex
	on dev."user" (login);

