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
    t_shirt_size VARCHAR
);

CREATE UNIQUE index participant_id_uindex
	ON participant (id);

ALTER TABLE participant
    ADD CONSTRAINT participant_pk
        PRIMARY KEY (id);

