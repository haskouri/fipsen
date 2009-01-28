CREATE TABLE t_video (
oid 	VARCHAR(20) 	NOT NULL,
details VARCHAR(10000) 	not null,
date	VARCHAR(10000) 	not null,
url	VARCHAR(1000) 	not null
) engine = innodb; 

alter table t_video add constraint `pk_video` primary key (oid);

alter table t_video add Index `index_video` (oid);