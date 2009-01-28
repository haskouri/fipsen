CREATE TABLE t_news (
oid 	VARCHAR(20) 	NOT NULL,
heading VARCHAR(1000) 	not null,
details VARCHAR(10000) 	not null,
date	VARCHAR(10000) 	not null,
time	VARCHAR(10000) 	not null
) engine = innodb; 

alter table t_news add constraint `pk_news` primary key (oid);

alter table t_news add Index `index_news` (oid);