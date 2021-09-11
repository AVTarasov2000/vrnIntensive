/* Single line comment */
CREATE TABLE place_type
(
    id uuid DEFAULT uuid_generate_v4() NOT NULL ,
    description json
);

CREATE UNIQUE index place_type_id_uindex
	ON place_type (id);

ALTER TABLE place_type
    ADD CONSTRAINT place_type_pk
        PRIMARY KEY (id);

