create table payment
(
    id uuid default uuid_generate_v4()  not null,
    payment_value_id uuid
        constraint payment_payment_value_id_fk
            references payment_value
            on update cascade on delete set null,
    user_id uuid
        constraint payment_user_id_fk
            references "user" (id),
    participant_id uuid
        constraint payment_participant_id_fk
            references participant
            on update cascade on delete set null
);

create unique index payment_id_uindex
	on payment (id);

alter table payment
    add constraint payment_pk
        primary key (id);