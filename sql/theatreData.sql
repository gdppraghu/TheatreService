insert into town(Name,CountryCode) values('Bangalore',91);
insert into town(Name,CountryCode) values('Hyderabad',91);

insert into theatre(Name,Address,TownId) values('Thriveni','MG Road',1);
insert into theatre(Name,Address,TownId) values('Krishna','Himayath Nagar',2);

insert into movie(Name) values('Valtaru Veeraiah');
insert into movie(Name) values('Veera Narasimha');

insert into movieshow(TheatreId,MovieId,StartDate,Active) 
values(1,1,'2023-01-21',true);

insert into movieshowtype(ShowId,ShowType,ShowTime,Seats) 
values(1,'M','11:00',30);
insert into movieshowtype(ShowId,ShowType,ShowTime,Seats) 
values(1,'AF','12:30',30);
insert into movieshowtype(ShowId,ShowType,ShowTime,Seats) 
values(1,'E','05:00',30);


insert into movieshow(TheatreId,MovieId,StartDate,Active) 
values(2,2,'2023-01-21',true);

insert into movieshowtype(ShowId,ShowType,ShowTime,Seats) 
values(2,'M','10:00',20);
insert into movieshowtype(ShowId,ShowType,ShowTime,Seats) 
values(2,'AF','01:00',30);
insert into movieshowtype(ShowId,ShowType,ShowTime,Seats) 
values(2,'E','05:30',10);


insert into discount(TownId,TheatreId,Discount,NthTicket) values(1,1,50,3);
insert into discount(movieShowTimeId,Discount) values(2,20);


insert into MovieBooking(customerName,email,movieShowTimeId,NumTickets,bookingDate,showDate)
values('Raghu','xyz@gmail.com',1,5,'2023-01-21','2023-01-29');

insert into MovieBooking(customerName,email,movieShowTimeId,NumTickets,bookingDate,showDate)
values('Seema','abc@gmail.com',1,2,'2023-01-21','2023-01-29');

insert into MovieBookingSeats(BookingId,seatNum,movieShowTimeId,showDate)
values(1,25,1,'2023-01-29');
insert into MovieBookingSeats(BookingId,seatNum,movieShowTimeId,showDate)
values(1,24,1,'2023-01-29');
insert into MovieBookingSeats(BookingId,seatNum,movieShowTimeId,showDate)
values(1,23,1,'2023-01-29');
insert into MovieBookingSeats(BookingId,seatNum,movieShowTimeId,showDate)
values(1,22,1,'2023-01-29');
insert into MovieBookingSeats(BookingId,seatNum,movieShowTimeId,showDate)
values(1,21,1,'2023-01-29');

insert into MovieBookingSeats(BookingId,seatNum,movieShowTimeId,showDate)
values(2,26,1,'2023-01-29');





