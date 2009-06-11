CREATE TABLE t_topcelebrity (
	oid 		VARCHAR(20) 	NOT NULL,
	firstname 	VARCHAR(40) 	not null,
	lastname 	VARCHAR(40) 	not null,
	middlename 	VARCHAR(40) 	not null,
	position	BIGINT		not null
	
) engine = innodb; 

alter table t_topcelebrity add constraint `pk_topcelebrity` primary key (oid);

alter table t_topcelebrity add Index `index_topcele` (oid);