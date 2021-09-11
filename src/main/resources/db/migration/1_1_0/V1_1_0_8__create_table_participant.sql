/* Single line comment */
CREATE TABLE participant
(
    id uuid DEFAULT uuid_generate_v4() NOT NULL ,
    name VARCHAR ,
    surname VARCHAR ,
    gender gender,
    phone_number VARCHAR ,
    status status,
    intensive_experience INT,
    voronezh_intensive_experience INT,
    t_shirt_size VARCHAR,
    first_payment_id uuid
        CONSTRAINT participant_payment_id_fk
            REFERENCES payment
            ON UPDATE CASCADE ON DELETE SET NULL ,
    second_payment_id uuid
        CONSTRAINT participant_payment_id_fk_2
            REFERENCES payment
            ON UPDATE CASCADE ON DELETE SET NULL
);

CREATE UNIQUE index participant_id_uindex
	ON participant (id);

ALTER TABLE participant
    ADD CONSTRAINT participant_pk
        PRIMARY KEY (id);

