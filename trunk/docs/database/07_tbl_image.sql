CREATE TABLE t_image (
oid 	VARCHAR(20) 	UNSIGNED NOT NULL,
type 	VARCHAR(20) 	not null,
referenceid 	VARCHAR(20) 	not null,
) engine = innodb; 

alter table t_image add constraint `pk_image` primary key (oid);

alter table t_image add Index `index_image` (oid);