CREATE TABLE t_award (
oid 	VARCHAR(20) 	UNSIGNED NOT NULL,
name 	VARCHAR(100) 	not null,
description 	VARCHAR(2000) 	not null,
) engine = innodb; 

alter table user add constraint `pk_user` primary key (oid);

alter table user add Index `index_User` (oid);