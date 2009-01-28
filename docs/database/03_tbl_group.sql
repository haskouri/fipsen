CREATE TABLE t_group (
oid 	VARCHAR(20) 	NOT NULL,
role 	VARCHAR(20) 	not null
) engine = innodb; 

alter table t_group 	add constraint 	`pk_group` 	primary key (oid);

alter table t_group 	add Index 	`index_group` 	(oid);
