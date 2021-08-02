CREATE TABLE payment_value
(
    -- Only integer types can be auto increment
    id uuid DEFAULT uuid_generate_v4() NOT NULL,
    payment_date DATE,
    capacity INTEGER
);

CREATE UNIQUE index payment_value_id_uindex
	ON payment_value (id);

ALTER TABLE payment_value
    ADD CONSTRAINT payment_value_pk
        PRIMARY KEY (id);