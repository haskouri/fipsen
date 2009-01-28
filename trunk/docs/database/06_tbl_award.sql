CREATE TABLE t_award (
oid 		VARCHAR(20) 	NOT NULL,
name 		VARCHAR(100) 	not null,
description 	VARCHAR(2000) 	not null
) 
engine = innodb; 

alter table t_award add constraint 	`pk_award` 	primary key (oid);

alter table t_award add Index 		`index_award` 	(oid);