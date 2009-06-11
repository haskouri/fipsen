create table t_celebrityaward
(
	oid 		VARCHAR(20) 	NOT NULL,
	celebrityid 	VARCHAR(20)  	NOT NULL,
	awardid 	VARCHAR(20) 	NOT NULL,
	achivedyear	VARCHAR(20) 	NOT NULL
)
engine = innodb;

alter table t_celebrityaward add constraint 	`pk_cele_awad` 	primary key (oid);

alter table t_celebrityaward add index 		`index_ca_cele`	(celebrityid);
alter table t_celebrityaward add index 		`index_ca_awrd`	(awardid);

alter table t_celebrityaward add constraint 	`fk_ca_cele`	foreign key (celebrityid)	references t_celebrity 	(oid);
alter table t_celebrityaward add constraint 	`fk_ca_awrd`	foreign key (awardid) 		references t_award 	(oid);