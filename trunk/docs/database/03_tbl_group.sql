CREATE TABLE t_group (
oid 	VARCHAR(20) 	UNSIGNED NOT NULL,
role 	VARCHAR(20) 	not null,
) engine = innodb; 

alter table t_group add constraint `pk_group` primary key (oid);

alter table user add Index `IndexGroup` (oid);
