CREATE TABLE t_type (
oid 	VARCHAR(20) 	NOT NULL,
type	VARCHAR(20) 	not null
) engine = innodb; 

alter table t_type add constraint 	`pk_type` 	primary key (oid);

alter table t_type add Index 		`index_type` 	(oid);