CREATE TABLE t_news (
oid 	VARCHAR(20) 	NOT NULL,
heading VARCHAR(1000) 	not null,
details VARCHAR(10000) 	not null,
date	VARCHAR(50) 	not null,
time	VARCHAR(50) 	not null,
newsurl VARCHAR(250) 	not null,
imageId varchar(20)	not null
) engine = innodb; 

alter table t_news add constraint `pk_news` primary key (oid);

alter table t_news add Index `index_news` (oid);
alter table t_news add Index `index_nws_img` (imageId);

alter table t_news add constraint	`fk_nws_img`	foreign key (imageId) 	references t_image	(oid);