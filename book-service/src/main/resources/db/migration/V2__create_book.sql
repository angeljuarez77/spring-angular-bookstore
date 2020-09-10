CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    author varchar(255),
    description text,
    price double precision,
    publisher varchar(255),
    release_year integer,
    title varchar(255)
);