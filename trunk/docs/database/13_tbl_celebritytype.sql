create table t_celebritytype
(
	oid 		VARCHAR(20) 	NOT NULL,
	celebrityid 	VARCHAR(20)  	NOT NULL,
	typeid 		VARCHAR(20) 	NOT NULL	
)
engine = innodb;

alter table t_celebritytype add constraint 	`pk_cele_type` 	primary key (oid);

alter table t_celebritytype add index 		`index_ct_cele`	(celebrityid);
alter table t_celebritytype add index 		`index_ct_type`	(typeid);

alter table t_celebritytype add constraint 	`fk_ct_cele`	foreign key (celebrityid)	references t_celebrity 	(oid);
alter table t_celebritytype add constraint 	`fk_ct_type`	foreign key (typeid) 		references t_type 	(oid);