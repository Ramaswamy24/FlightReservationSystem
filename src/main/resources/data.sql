insert into Credential_details values('admin123',0,'admin','A');
insert into Credential_details values('ra1234',0,'admin123','C');
insert into Credential_details values('ra1235',1,'2345','C');


insert into flight_details values('1011','Indigo',101,85);
insert into flight_details values('1012','AirIndia',120,25);
insert into flight_details values('1013','AirLines',130,95);
insert into flight_details values('1014','emirates',150,75);
insert into flight_details values('1015','Air Asia',170,90);



insert into Route_details values('12344','Banglore',25,10000,'Chennai');
insert into Route_details values('12345','Hyderbad',25,10000,'Chennai');
insert into Route_details values('12346','Kerala',25,10000,'Chennai');
insert into Route_details values('12347','Rajmundry',25,10000,'Chennai');
insert into Route_details values('12348','Kakinada',25,10000,'Chennai');

insert into Schedule_details values('1','5','9.20',3,'1011','12344');
insert into Schedule_details values('2','5','9.20',3,'1012','12345');


insert into reservation_details values('1',1,'2022-04-04','2022-04-06',3,500000,'ra1234','1');
insert into reservation_details values('2',1,'2022-04-04','2022-04-06',3,500000,'ra1235','2');


insert into passenger_details values(1,'21','male','swamy','45','1');
insert into passenger_details values(2,'22','male','rama','46','2');
insert into passenger_details values(3,'23','male','rama swamy','46','2');

