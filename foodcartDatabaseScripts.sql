use food;
drop table tutorials_tbl
select * from foodcart
create table foodcart(
   id INT NOT NULL AUTO_INCREMENT,
   ietem VARCHAR(100),
   price INT,
   PRIMARY KEY (id )
);

insert into foodcart values(1, "Birayani", 100)
insert into foodcart values(2, "Pizza", 250)
insert into foodcart values(3, "Chicken lolypop", 300)
insert into foodcart values(4, "Puri bhaji", 150)