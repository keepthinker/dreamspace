
CREATE DATABASE /*!32312 IF NOT EXISTS*/dreamspace 

USE dreamspace;
DROP TABLE IF EXISTS blog;

CREATE TABLE blog (
  id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) DEFAULT NULL,
  title varchar(20) DEFAULT NULL,
  content varchar(100) DEFAULT NULL,
  created_time datetime DEFAULT NULL,
  modefied_time datetime DEFAULT NULL,
  comment_sum int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY user_id (user_id),
  CONSTRAINT blog_ibfk_1 FOREIGN KEY (user_id) REFERENCES user (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS comment;

CREATE TABLE comment (
  id int(11) NOT NULL AUTO_INCREMENT,
  blog_id int(11) DEFAULT NULL,
  commentator varchar(20) DEFAULT NULL,
  content varchar(50) DEFAULT NULL,
  created_time datetime DEFAULT NULL,
  PRIMARY KEY (id),
  KEY blog_id (blog_id),
  CONSTRAINT comment_ibfk_1 FOREIGN KEY (blog_id) REFERENCES blog (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS friendship;

CREATE TABLE friendship (
  id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY user_id (user_id),
  CONSTRAINT friendship_ibfk_1 FOREIGN KEY (user_id) REFERENCES user (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS permission;

CREATE TABLE permission (
  id int(11) NOT NULL AUTO_INCREMENT,
  permission_name varchar(20) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS role;

CREATE TABLE role (
  id int(11) NOT NULL AUTO_INCREMENT,
  role_id int(11) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS role_permission_relation;

CREATE TABLE role_permission_relation (
  id int(11) NOT NULL AUTO_INCREMENT,
  role_id int(11) DEFAULT NULL,
  permission_id int(11) DEFAULT NULL,
  
DROP TABLE IF EXISTS comment;
PRIMARY KEY (id),
  KEY role_id (role_id),
  KEY permission_id (permission_id),
  CONSTRAINT role_permission_relation_ibfk_2 FOREIGN KEY (permission_id) REFERENCES permission (id),
  CONSTRAINT role_permission_relation_ibfk_1 FOREIGN KEY (role_id) REFERENCES role (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(20) DEFAULT NULL,
  password varchar(20) DEFAULT NULL,
  profile varchar(50) DEFAULT NULL,
  head_pic varchar(50) DEFAULT NULL,
  friendship_id int(11) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS user_role_relation;

CREATE TABLE user_role_relation (
  id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) DEFAULT NULL,
  role_id int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY role_id (role_id),
  KEY user_id (user_id),
  CONSTRAINT user_role_relation_ibfk_2 FOREIGN KEY (user_id) REFERENCES user (id),
  CONSTRAINT user_role_relation_ibfk_1 FOREIGN KEY (role_id) REFERENCES role (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;