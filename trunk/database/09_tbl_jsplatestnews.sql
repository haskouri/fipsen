CREATE TABLE t_jsplatestnews (
oid 		VARCHAR(20) 	NOT NULL,
heading 	VARCHAR(1000) 	not null,
details 	VARCHAR(10000) 	not null,
date		VARCHAR(50) 	not null,
time		VARCHAR(50) 	not null,
newsurl 	VARCHAR(250) 	not null,
imageId 	varchar(20)	not null,
position	BIGINT		not null
) engine = innodb; 

alter table t_jsplatestnews add constraint `pk_jspnews` primary key (oid);

alter table t_jsplatestnews add Index `index_jspnews` (oid);
alter table t_jsplatestnews add Index `index_lstnws_img` (imageId);

alter table t_jsplatestnews add constraint	`fk_lstnws_img`	foreign key (imageId) 	references t_image	(oid);
