DROP TABLE IF EXISTS Town;

DROP TABLE IF EXISTS Movie;

DROP TABLE IF EXISTS Theatre;

DROP TABLE IF EXISTS MovieShowType;

DROP TABLE IF EXISTS MovieShow;

DROP TABLE IF EXISTS Discount;

DROP TABLE IF EXISTS MovieBookingSeats;

DROP TABLE IF EXISTS MovieBooking;


CREATE TABLE IF NOT EXISTS `Town` (
	`Id` INT NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(50) NOT NULL,
	`countryCode` VARCHAR(20) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE IF NOT EXISTS `Movie` (
	`Id` INT NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`Id`)
);


CREATE TABLE IF NOT EXISTS `Theatre` (
	`Id` INT NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(50) NOT NULL,
	`Address` VARCHAR(100) NOT NULL,
	`TownId` INT REFERENCES Town(Id),
	PRIMARY KEY (`Id`)
);


CREATE TABLE IF NOT EXISTS `MovieShow` (
	`Id` INT NOT NULL AUTO_INCREMENT,
	 `TheatreId` INT NOT NULL,
	`MovieId` INT NOT NULL,
	`StartDate` DATE NOT NULL,
	`EndDate` DATE,
	`Active` INT,
	PRIMARY KEY (`Id`)
);

CREATE TABLE IF NOT EXISTS `MovieShowType` (
	`Id` INT NOT NULL AUTO_INCREMENT,
	 `ShowId` INT REFERENCES MovieShow(ID),
	`ShowType` VARCHAR(2) NOT NULL,
	`ShowTime` VARCHAR(6) NOT NULL,
	`Active` INT default 1,
	`Seats` INT,
	INDEX(Id),
	PRIMARY KEY (`ShowId`,`ShowType`,`ShowTime`)
);

CREATE TABLE IF NOT EXISTS `MovieBooking` (
	`Id` INT  AUTO_INCREMENT,
	 `customerName` VARCHAR(20) NOT NULL,
	`email` VARCHAR(20) NOT NULL,
	`movieShowTimeId` INT NOT NULL,
	`NumTickets` INT NOT NULL,
	`bookingDate` DATE NOT NULL,
	`showDate` DATE NOT NULL,
	PRIMARY KEY (`Id`)
	);
	
CREATE TABLE IF NOT EXISTS `MovieBookingSeats` (
	`BookingId` INT ,
	 `seatNum` INT NOT NULL,
	 `movieShowTimeId` INT NOT NULL,
	 `showDate` DATE NOT NULL,
	  `status` VARCHAR(20),
	 FOREIGN KEY(BookingId) REFERENCES MovieBooking(Id)
	);	
	
	
CREATE TABLE IF NOT EXISTS `Discount` (
	`TownId` INT default -1,
	`TheatreId` INT default -1,
	`movieShowTimeId` INT NOT NULL default -1,
	`StartDate` DATE default '0000:00:00',
	`EndDate` DATE default '0000:00:00',
	`Discount` INT NOT NULL,
	`NthTicket` INT,
	PRIMARY KEY (`TownId`,`TheatreId`,`movieShowTimeId`,`StartDate`,`EndDate`)
);

