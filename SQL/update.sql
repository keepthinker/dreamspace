insert into user(name,password,profile) values('root','123456','he he');
insert into user(name,password,profile) values('keepthinker','123456','keep thinking!');
insert into user(name,password,profile) values('zhangquanling','123456','a funny guy');
insert into user(name,password,profile) values('liyang','123456','look to the future with confidence');
insert into user(name,password,profile) values('xiyueyiwan','123456','good good study,day day up');
insert into user(name,password,profile) values('wangboxing','123456','a talented dotaer');
insert into user(name,password,profile) values('renmengjie','123456','just do it');

insert into role(role_name) values('root');
insert into role(role_name) values('user');

insert into permission(permission_name) values('root');
insert into permission(permission_name) values('normal');

insert into user_role_relation(user_id,role_id) values(1,1);
insert into user_role_relation(user_id,role_id) values(2,2);
insert into user_role_relation(user_id,role_id) values(3,2);
insert into user_role_relation(user_id,role_id) values(4,2);
insert into user_role_relation(user_id,role_id) values(5,2);
insert into user_role_relation(user_id,role_id) values(6,2);

insert into role_permission_relation(role_id,permission_id) values(1,1);
insert into role_permission_relation(role_id,permission_id) values(2,2);



drop table user_role_relation;
drop table role_permission_relation;
drop table friendship;
drop table comment;
drop table blog;
drop table user;
drop table role;
drop table permission;

alter table user change name user_name varchar(35);