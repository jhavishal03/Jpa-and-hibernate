insert into course(id,name,fees) values(10001,'DSA',2500);
insert into course(id,name,fees) values(10002,'adroid',700);
insert into course(id,name,fees) values(10003,'jdbl',9900);

insert into Review(id,rating,description,course_id) values(40001,5,'very good tutorial',10001);
insert into Review(id,rating,description,course_id) values(40002,4,'Great Exlpanation',10001);
insert into Review(id,rating,description,course_id) values(40003,1,'Poor Quality! No discussion thread',10003);

insert into  Passport(id,number) values(30001,'X356Y637');
insert into  Passport(id,number) values(30002,'X637Z763');
insert into  Passport(id,number) values(30003,'X647YZ968');

insert into Student(id,name,age,PASSPORT_ID) values(20001,'Vishal Jha',22,30001);
insert into Student(id,name,age,PASSPORT_ID) values(20002,'Devansh Chaubey',23,30002);
insert into Student(id,name,age,PASSPORT_ID) values(20003,'Abhishek Bose',21,30003);

insert into student_course(student_id,course_id) values(20001,10001);
insert into student_course(student_id,course_id) values(20001,10002);
insert into student_course(student_id,course_id) values(20001,10002);
insert into student_course(student_id,course_id) values(20003,10002);
insert into student_course(student_id,course_id) values(20003,10001);
insert into student_course(student_id,course_id) values(20002,10002);
