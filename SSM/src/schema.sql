create database seckill;
use seckill;
create table seckill(
	`seckill_id` bigint not null auto_increment,
	`name` varchar(120)	not null,
	`number` int not null,
	`create_time` timestamp not null default current_timestamp,
	`start_time` timestamp not null,
	`end_time` timestamp not null,
	primary key (seckill_id),
	key idx_start_time(start_time),
	key idx_end_time(end_time),
	key idx_create_time(create_time)
)engine=InnoDB auto_increment=1000 default charset=utf8 comment='秒杀库存表';

insert into seckill(name,number,start_time,end_time)
values
('100元秒杀iphone6',100,'2015-01-01 00:00:00','2015-01-02 00:00:00'),
('500元秒杀ipad2',200,'2015-01-01 00:00:00','2015-01-02 00:00:00'),
('300元秒杀小米4',300,'2015-01-01 00:00:00','2015-01-02 00:00:00'),
('200元秒杀红米note',400,'2015-01-01 00:00:00','2015-01-02 00:00:00');

create table success_killed(
	`seckill_id` bigint not null,
	`user_phone` bigint not null,
	`state` tinyint not null default -1,
	`create_time` timestamp not null,
	primary key(seckill_id,user_phone),
	key idx_create_time(create_time)
)engine=InnoDB default charset=utf8;

alter table seckill
drop index idx_create_time,
add index idx_c_s(start_time,create_time);


