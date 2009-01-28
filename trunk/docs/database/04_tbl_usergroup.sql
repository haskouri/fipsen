create table t_usergroup
(
	oid 	VARCHAR(20) 	not null,
	userid 	VARCHAR(20)	not null,
	groupid VARCHAR(20)	not null	
)
engine = innodb;

alter table t_usergroup add constraint 	`pk_user_group`	primary key (oid);

alter table t_usergroup add index 	`index_ug_usr`	(userid);
alter table t_usergroup add index 	`index_ug_grp`	(groupid);

alter table t_usergroup add constraint	`fk_ug_usr`	foreign key (userid) 	references t_user	(oid);
alter table t_usergroup add constraint 	`fk_ug_grp`	foreign key (groupid) 	references t_group 	(oid);
