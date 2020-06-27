drop table Customer;

create table Customer
(
Name varchar(30) not null,
UserName varchar(20) primary key,
Password varchar(20) not null,
Email varchar(30) unique,
MobileNumber bigint,
DateOfBirth date,
Gender varchar(6),
FlatNumber varchar(10),
Area varchar(30),
Locality varchar(30),
City varchar(20),
State varchar(20),
Country varchar(20),
PIN int(6)
);

select * from Customer;

insert into Customer(Name,UserName,Password,Email,MobileNumber,DateOfBirth,
Gender,FlatNumber,Area,Locality,City,State,PIN) 
values("Badhai Singhal", "Bebo", "Infy@1043603","badhaisinghal07@gmail.com",
9414160599, "1997-07-07", "Female", "13-A","Agrasen Nagar", "Udiapole", "Udaipur", "Rajasthan","India",
313001);



drop table Vendor;

create table Vendor
(
VendorName varchar(30) primary key,
VendorContact bigint,
VendorEmail varchar(25),
VendorAddress varchar(50)
);

Select * from Vendor;

Insert into Vendor values("PizzaHut");



drop table Item;

create table Item
(
ItemId int auto_increment primary key,
ItemName varchar(20),
ItemDescription varchar(50),
VendorName varchar(30) references Vendor(VendorName),
Veg varchar(10),
Cuisine varchar(15),
Price int,
UNIQUE(ItemName,VendorName)
);

Select * from Item;

insert into Item values(null,"Margerita","Cheese Burst crust with loaded cheese on top!",
"PizzaHut","Veg","Italian",250);



drop table Transaction;

create table Transaction
(
TransactionId int auto_increment primary key,
UserName varchar(20)references Customer(UserName),
DateandTime DateTime default now(),
Amount_Paid int
);

--insert into Transaction(TransactionId,UserName,DateandTime,Amount_Paid)
--values(null,"Bebo",now(),500);
--insert into Transaction(TransactionId,UserName,DateandTime,Amount_Paid)
--values(null,"Bebo",now(),102);

select * from Transaction;