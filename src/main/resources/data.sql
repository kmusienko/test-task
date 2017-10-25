use usersecure;
insert into roles (`name`) values ('admin');

insert into users (`username`,`password`,role_id) values ('kostya', '1234k',1);
insert into users (`username`,`password`,role_id) values ('vasya', '321v',1);
insert into users (`username`,`password`,role_id) values ('nastya', 'nast55',1);
insert into users (`username`,`password`,role_id) values ('vladimir', '465vl',1);

insert into weekend_dates (`date`) values ('2017-10-07');
insert into weekend_dates (`date`) values ('2017-10-11');
insert into weekend_dates (`date`) values ('2017-10-18');
insert into weekend_dates (`date`) values ('1998-03-03');