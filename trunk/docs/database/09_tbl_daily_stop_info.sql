create table daily_stop_info
(
	daily_stop_id 	BIGINT 		unsigned not null,
	line_id 	BIGINT 		not null,
	group_id 	BIGINT 		not null,
	stop_reason_id 	BIGINT 		not null,
	start_time	TIMESTAMP 	not null,
	end_time	TIMESTAMP 	not null,
	stop_duration	double 		not null,
	stop_cost	double 		not null,
	lunch_included	varchar(1),
	break_included	varchar(1),
	resolution_comment varchar(500),
	
)
engine = innodb;

alter table daily_stop_info add constraint `pk_daily_stop_info` primary key (daily_stop_id);

alter table daily_stop_info add index `IndexDSI_line`		(line_id);
alter table daily_stop_info add index `IndexDSI_group`		(group_id);
alter table daily_stop_info add index `IndexDSI_stopReason`	(stop_reason_id);

alter table daily_stop_info add constraint `fkDSI_line`		foreign key (line_id) 		references line 	(line_id);
alter table daily_stop_info add constraint `fkDSI_SR`		foreign key (stop_reason_id) 	references stop_reason 	(stop_reason_id);
alter table daily_stop_info add constraint `fkDSI_group`	foreign key (group_id) 		references group 	(group_id);
