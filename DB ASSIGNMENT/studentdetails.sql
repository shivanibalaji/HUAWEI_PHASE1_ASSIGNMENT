CREATE TABLE studentsdetails (
   
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL AUTO_INCREMENT,
    mobile num VARCHAR(10) NOT NULL UNIQUE,
    reg_num INT NOT NULL AUTO_INCREMENT,
    year_of_branch INT NOT NULL AUTO_INCREMENT,
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('Shivani',20,0987654321,1902219,2023);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('Shanmuga priya',20,0987654324,1902217,2020);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('Selvapriya', 22,0987655321,1802219,2022);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('priya', 23,0987656321,180344,2020);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('rani', 19,0987654325,201229,2024);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('amritha', 20,98765432109,1902246,2023);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('varshini', 20,0987654321,1902235,2023);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('tarunika', 20,0987654321,1902219,2020);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('sharmila', 20,0987654321,1902219,2020);
    INSERT INTO studentsdetails (name, age,mobile num,reg_num,year_of_branch) VALUES ('shruthi', 20,0987654321,1902219,2020);

    SELECT * FROM studentsdetails WHERE year_of_branch > '2020';

    UPDATE studentsdetails
    SET age = '21',
    WHERE year_of_branch = '2023' ; 
);