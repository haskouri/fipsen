CREATE TABLE t_latest_video (
oid 	VARCHAR(20) 	NOT NULL,
details VARCHAR(10000) 	not null,
date	VARCHAR(10000) 	not null,
url	VARCHAR(1000) 	not null
) engine = innodb; 

alter table t_latest_video add constraint 	`pk_ltst_vdo` 	primary key (oid);

alter table t_latest_video add Index 		`index_lst_vdo` (oid);