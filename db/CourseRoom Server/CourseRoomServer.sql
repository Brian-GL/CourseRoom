-- MySQL Script generated by MySQL Workbench
-- Fri Jan 28 20:22:08 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema CourseRoom_Server
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema CourseRoom_Server
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `CourseRoom_Server` DEFAULT CHARACTER SET utf8 ;
USE `CourseRoom_Server` ;

-- -----------------------------------------------------
-- Table `CourseRoom_Server`.`Tb_Metodos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CourseRoom_Server`.`Tb_Metodos` (
  `Metodo` VARCHAR(50) NOT NULL,
  `Activo` BIT(1) NOT NULL,
  PRIMARY KEY (`Metodo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `CourseRoom_Server`.`Tb_Tickets`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `CourseRoom_Server`.`Tb_Tickets` (
  `IdTicket` INT NOT NULL AUTO_INCREMENT,
  `Solicitud` VARCHAR(100) NOT NULL,
  `Cliente` VARCHAR(40) NOT NULL,
  `FechaSolicitud` DATETIME NOT NULL,
  `Respuesta` VARCHAR(100) NULL,
  `FechaRespuesta` DATETIME NULL,
  PRIMARY KEY (`IdTicket`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
