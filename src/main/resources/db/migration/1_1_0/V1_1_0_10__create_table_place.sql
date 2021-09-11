/* Single line comment */
CREATE TABLE place
(
    id uuid DEFAULT uuid_generate_v4() NOT NULL ,
    price INT ,
    number VARCHAR,
    description json,
    type_id uuid,
    parent_id uuid
);

CREATE UNIQUE index place_id_uindex
	ON place (id);

ALTER TABLE place
    ADD CONSTRAINT place_pk
        PRIMARY KEY (id);

alter table place
    add constraint parent_place_id_fk
        foreign key (parent_id) references place (id)