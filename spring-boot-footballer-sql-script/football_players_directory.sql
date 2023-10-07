CREATE DATABASE  IF NOT EXISTS football_players_directory;
USE football_players_directory;

--
-- Table structure for "football_players" 
--

DROP TABLE IF EXISTS football_players;

create table football_players(
  id int NOT NULL AUTO_INCREMENT,
  name varchar(45) DEFAULT NULL,
  club varchar(45) DEFAULT NULL,
  position varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO football_players VALUES 
	(1,'vinicius jr','Real Madrid','Winger'),
	(2,'Harry Kane','Bayern Munich','Striker'),
	(3,'Marquinhos','PSG','Defender');