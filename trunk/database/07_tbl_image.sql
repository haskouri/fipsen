CREATE TABLE t_image (
oid 		VARCHAR(20) 	NOT NULL,
type 		BIGINT UNSIGNED NOT NULL,
path		VARCHAR(1000) 	not null,
url		VARCHAR(1000) 	not null,
altertag	VARCHAR(100) 	not null,
title		VARCHAR(1000) 	not null,
referenceid 	VARCHAR(20) 	not null
) 
engine = innodb; 

alter table t_image add constraint 	`pk_image` 	primary key (oid);

alter table t_image add Index 		`index_image` 	(oid);