CREATE TABLE t_rating (
oid 	VARCHAR(20) 	UNSIGNED NOT NULL,
type	VARCHAR(20) 	not null,
referenceid	VARCHAR(20) 	not null,
) engine = innodb; 

alter table t_news add constraint `pk_rating` primary key (oid);

alter table t_news add Index `index_rating` (oid);