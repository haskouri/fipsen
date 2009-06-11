CREATE TABLE t_celebrity (
	oid 		VARCHAR(20) 	NOT NULL,
	firstname 	VARCHAR(40) 	not null,
	lastname 	VARCHAR(40) 	not null,
	middlename 	VARCHAR(40) 	not null,
	birthplace 	VARCHAR(40) 	not null,
	biography 	VARCHAR(2000) 	not null
) engine = innodb; 

alter table t_celebrity add constraint `pk_celebrity` primary key (oid);

alter table t_celebrity add Index `index_cele` (oid);