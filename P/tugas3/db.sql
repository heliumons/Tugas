create sequence pegawai_seq increment 1 start 1;

CREATE TABLE pegawai (
	id serial PRIMARY KEY,
	name VARCHAR ( 50 )  NOT NULL,
	temp NUMERIC  NOT NULL,
	sleephour INTEGER NOT NULL,
	fitnote VARCHAR ( 50 ) NOT NULL 
);