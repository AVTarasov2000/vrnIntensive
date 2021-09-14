create table participant_place
(
    participant_id uuid not null
        constraint participant_place_participant_id_fk
            references participant,
    place_id uuid not null
        constraint participant_place_place_id_fk
            references place
);

