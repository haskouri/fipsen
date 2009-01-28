CREATE TABLE t_rating (
oid 	VARCHAR(20) 	NOT NULL,
type	VARCHAR(20) 	not null,
referenceid	VARCHAR(20) 	not null
) engine = innodb; 

alter table t_rating add constraint `pk_rating` primary key (oid);

alter table t_rating add Index `index_rating` (oid);