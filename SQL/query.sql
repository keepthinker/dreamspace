select * from user;
select * from role;
select * from permission;

 select r.role_name from user u, user_role_relation ur, role r
 where u.id = ur.user_id and r.id = ur.role_id and u.user_name ='keepthinker';
 
ALTER TABLE user
MODIFY COLUMN name user