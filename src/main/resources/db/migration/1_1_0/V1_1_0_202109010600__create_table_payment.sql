create table payment
(
    id uuid default uuid_generate_v4() not null,
    capacity INT,
    type VARCHAR,
    participant_id uuid
        constraint participant_user_id_fk
            references participant (id),
    create_date date,
    modified_date date,
    delete_date date,
    user_created_id uuid
        constraint payment_user_created_id_fk
            references "user" (id),
    user_modified_id uuid
        constraint payment_user_modified_id_fk
            references "user" (id),
    user_deleted_id uuid
        constraint payment_user_deleted_id_fk
            references "user" (id)
);

create unique index payment_id_uindex
	on payment (id);

alter table payment
    add constraint payment_pk
        primary key (id);