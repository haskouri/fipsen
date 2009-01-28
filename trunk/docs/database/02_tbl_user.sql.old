CREATE TABLE t_user (
oid 	VARCHAR(20) 	UNSIGNED NOT NULL,
loginid 	VARCHAR(20) 	not null,
screenname 	VARCHAR(20) 	not null,
password 	VARCHAR(20) 	not null,
role 		VARCHAR(20) 	not null,
last_logged_in 	date 		not null,
) engine = innodb; 

alter table user add constraint `pk_user` primary key (oid);

alter table user add Index `index_User` (oid);