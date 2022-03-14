CREATE TABLE teacher_details (
   name VARCHAR(50),
   domain VARCHAR(50),
   department VARCHAR(30),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Sahana',IOT,CSE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Srinitha',ML,CSE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('sharmila',EMBEDDED,ECE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Shanthini',IOT,ECE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Vimal',IOT,ECE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Kiruthika',EMBEDDED,ECE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Nivetha',ELECTRICAL,ECE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Sangeetha',IOT,ECE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Suganya',EMBEDDED,CSE),
   INSERT INTO teacher_details (name,domain,department) VALUES ('Vidhya',IOT,ECE),

   SELECT * FROM teacher_details WHERE department > 'CSE';

   DELETE FROM teacher_details WHERE name='Vidhya';
   DELETE FROM teacher_details WHERE name='Vimal';

);
