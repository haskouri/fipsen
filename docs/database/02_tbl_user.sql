CREATE TABLE t_user (
oid 	VARCHAR(20)  not null,
loginid 	VARCHAR(20) 	not null,
screenname 	VARCHAR(20) 	not null,
password 	VARCHAR(20) 	not null,
role 		VARCHAR(20) 	not null,
last_logged_in 	date 		not null
) engine = innodb; 

alter table t_user add constraint `pk_user` primary key (oid);

alter table t_user add Index `index_User` (oid);