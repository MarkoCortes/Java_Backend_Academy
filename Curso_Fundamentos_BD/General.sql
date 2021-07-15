#Crear una base de datos
create database platziblog;
#USE DATABASE plaziblog;

#CREA TABLA PERSONA
CREATE TABLE `platziblog`.`people` (
  `person_id` INT NOT NULL AUTO_INCREMENT,
  `lastname` VARCHAR(255) NULL,
  `first_name` VARCHAR(255) NULL,
  `address` VARCHAR(255) NULL,
  `city` VARCHAR(255) NULL,
  PRIMARY KEY (`person_id`));
  
  #ALTER TABLE
ALTER TABLE `platziblog`.`people` 
ADD COLUMN `date_of_birth` DATETIME NULL AFTER `city`;

#Crear view
CREATE VIEW `new_view` AS
SELECT * FROM platziblog.people;

#Drop tablas
DROP TABLE `platziblog`.`people`;

#Drop schemas o db
DROP DATABASE `platziblog`;