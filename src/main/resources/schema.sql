CREATE TABLE IF NOT EXISTS shedlock
(
    name       text         NOT NULL,
    lock_until timestamptz NULL,
    locked_at  timestamptz NULL,
    locked_by  text         NOT NULL,
    PRIMARY KEY (name)
);