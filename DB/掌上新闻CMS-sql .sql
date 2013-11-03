/* SQLEditor (MySQL (2))*/

CREATE TABLE pn_activity
(
id INTEGER AUTO_INCREMENT,
title VARCHAR(255),
content TEXT,
cover_path VARCHAR(255),
audit_status INTEGER COMMENT '1.待审核
2.通过
3.退回
',
create_time DATETIME,
PRIMARY KEY (id)
);

CREATE TABLE pn_activity_registration
(
id INTEGER AUTO_INCREMENT,
name VARCHAR(255),
phone VARCHAR(255),
gender INTEGER COMMENT '1.男
2.女',
create_time DATETIME,
PRIMARY KEY (id)
);

CREATE TABLE pn_function
(
id INTEGER AUTO_INCREMENT,
code INTEGER,
name VARCHAR(255),
PRIMARY KEY (id)
);

CREATE TABLE pn_news_category
(
id INTEGER AUTO_INCREMENT,
name VARCHAR(255),
order_index INTEGER,
PRIMARY KEY (id)
);

CREATE TABLE pn_news
(
id INTEGER AUTO_INCREMENT,
title VARCHAR(255),
content TEXT,
cover_path VARCHAR(255),
news_category_id INTEGER,
audit_status INTEGER COMMENT '1.待审核
2.通过
3.退回',
create_time DATETIME,
PRIMARY KEY (id)
);

CREATE TABLE pn_news_comment
(
id INTEGER AUTO_INCREMENT,
name VARCHAR(255),
content VARCHAR(255),
news_id INTEGER,
create_time DATETIME,
PRIMARY KEY (id)
);

CREATE TABLE pn_picture_news
(
id INTEGER AUTO_INCREMENT,
title VARBINARY(255),
audit_status INTEGER COMMENT '1.待审核
2.通过
3.退回
',
like_count INTEGER,
create_time DATETIME,
PRIMARY KEY (id)
);

CREATE TABLE pn_picture_news_item
(
id INTEGER AUTO_INCREMENT,
content VARCHAR(255),
pic_path VARCHAR(255),
picture_news_id INTEGER,
order_index INTEGER,
PRIMARY KEY (id)
);

CREATE TABLE pn_push
(
id INTEGER AUTO_INCREMENT,
title VARCHAR(255),
push_time DATETIME,
PRIMARY KEY (id)
);

CREATE TABLE pn_role
(
id INTEGER AUTO_INCREMENT,
name VARCHAR(255),
content_select INTEGER,
content_insert INTEGER,
content_update INTEGER,
content_delete INTEGER,
content_classify_select INTEGER,
content_classify_insert INTEGER,
content_classify_update INTEGER,
content_classify_delete INTEGER,
content_verify_select INTEGER,
content_verify_pass INTEGER,
content_verify_back INTEGER,
user_select INTEGER,
user_insert INTEGER,
user_update INTEGER,
user_delete INTEGER,
role_select INTEGER,
role_insert INTEGER,
role_update INTEGER,
role_delete INTEGER
PRIMARY KEY (id)
);

CREATE TABLE pn_role_function
(
funciton_id INTEGER,
role_id INTEGER
);

CREATE TABLE pn_user
(
id INTEGER AUTO_INCREMENT,
name VARCHAR(255),
password VARCHAR(255),
role_id INTEGER,
PRIMARY KEY (id)
);

ALTER TABLE pn_activity_registration ADD FOREIGN KEY id_idxfk (id) REFERENCES pn_activity (id);

ALTER TABLE pn_news ADD FOREIGN KEY news_category_id_idxfk (news_category_id) REFERENCES pn_news_category (id);

ALTER TABLE pn_news_comment ADD FOREIGN KEY news_id_idxfk (news_id) REFERENCES pn_news (id);

ALTER TABLE pn_picture_news_item ADD FOREIGN KEY picture_news_id_idxfk (picture_news_id) REFERENCES pn_picture_news (id);

ALTER TABLE pn_role_function ADD FOREIGN KEY funciton_id_idxfk (funciton_id) REFERENCES pn_function (id);

ALTER TABLE pn_role_function ADD FOREIGN KEY role_id_idxfk (role_id) REFERENCES pn_role (id);

ALTER TABLE pn_user ADD FOREIGN KEY role_id_idxfk_1 (role_id) REFERENCES pn_role (id);
