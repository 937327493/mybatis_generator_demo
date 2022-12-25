create table people (
                        id bigint unsigned comment '主键' auto_increment,
                        name varchar(128) not null comment '姓名',
                        constraint pk primary key (id)
) default character set utf8mb4  auto_increment=1;

insert into people(id, name) values(1, '王梓崴'),(2, '王梓崴'),(3, '王梓崴'),(4, '王梓崴'),(5, '王梓崴');