CREATE TABLE Stor 
( 
countity int, 
s_id int NOT NULL,
FOREIGN KEY(s_id) REFERENCES Storages(s_id), 
b_id int NOT NULL, 
FOREIGN KEY(b_id) REFERENCES Books(b_id) 
); 
CREATE TABLE Books 
( 
b_call text, 
b_author text, 
b_publ text, 
b_year int, 
b_price int, 
b_feature int
PRIMARY KEY(b_id) 
)
/ 
CREATE TABLE Storages 
( 
s_id PRIMARY KEY, 
head_name text, 
s_adresse text, 
s_phone int, 
s_capacity int 
)
/
CREATE TABLE Used_Books 
( 
discipline text, 
b_id int FOREIGN KEY REFERENCES Books(b_id), 
f_id int FOREIGN KEY REFERENCES Facultet(f_id) 
)
/
CREATE TABLE Facultet 
(f_id int PRIMARY KEY, 
f_call text, 
decan text, 
base_date int, 
)