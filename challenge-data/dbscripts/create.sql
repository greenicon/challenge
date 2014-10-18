-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.25a - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for challenge
CREATE DATABASE IF NOT EXISTS `challenge` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `challenge`;


-- Dumping structure for table challenge.category
CREATE TABLE IF NOT EXISTS `category` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(128) NOT NULL,
  `DESCRIPTION` varchar(256) NOT NULL,
  `COVER_MEDIAID` varchar(64) NOT NULL,
  `PROFILE_MEDIAID` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.category_categorychallenge_map
CREATE TABLE IF NOT EXISTS `category_categorychallenge_map` (
  `ID` varchar(64) NOT NULL,
  `PARENTID` varchar(64) NOT NULL,
  `CHILDID` varchar(64) NOT NULL,
  `ISCHILD_CATEGORY` tinyint(1) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `CATEGORY_TO_CATEGORY_CATEGORYCHALLENGE_MAP` (`PARENTID`),
  CONSTRAINT `CATEGORY_TO_CATEGORY_CATEGORYCHALLENGE_MAP` FOREIGN KEY (`PARENTID`) REFERENCES `category` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.challenge
CREATE TABLE IF NOT EXISTS `challenge` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(128) NOT NULL,
  `DESCRIPTION` varchar(256) NOT NULL,
  `TYPE` varchar(64) NOT NULL,
  `PROFILE_IMAGEID` varchar(64) NOT NULL,
  `COVER_IMAGEID` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `USER_ID` varchar(64) NOT NULL,
  `LOCATION_ID` varchar(64) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.challenge_data
CREATE TABLE IF NOT EXISTS `challenge_data` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(64) NOT NULL,
  `VALUE` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CHALLENGE_ID` varchar(64) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `CHALLENGE_DATA_CHALLENGE` (`CHALLENGE_ID`),
  CONSTRAINT `CHALLENGE_DATA_CHALLENGE` FOREIGN KEY (`CHALLENGE_ID`) REFERENCES `challenge` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.challenge_group_map
CREATE TABLE IF NOT EXISTS `challenge_group_map` (
  `ID` varchar(64) NOT NULL,
  `CHALLENGE_GROUP_ID` varchar(64) NOT NULL,
  `CHALLENGE_ID` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `CHALLENGE_GROUP_TO_CHALLENGE_GROUP_MAP` (`CHALLENGE_GROUP_ID`),
  KEY `CHALLENGE_TO_CHALLENGE_GROUP_MAP` (`CHALLENGE_ID`),
  CONSTRAINT `CHALLENGE_GROUP_TO_CHALLENGE_GROUP_MAP` FOREIGN KEY (`CHALLENGE_GROUP_ID`) REFERENCES `challenge` (`ID`),
  CONSTRAINT `CHALLENGE_TO_CHALLENGE_GROUP_MAP` FOREIGN KEY (`CHALLENGE_ID`) REFERENCES `challenge` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.challenge_list
CREATE TABLE IF NOT EXISTS `challenge_list` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(128) NOT NULL,
  `DESCRIPTION` varchar(256) NOT NULL,
  `TYPE` varchar(64) NOT NULL,
  `PROFILE_MEDIAID` varchar(64) NOT NULL,
  `COVER_MEDIAID` varchar(64) NOT NULL,
  `OWNER` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `MODIFIEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `USER_ID` varchar(64) NOT NULL,
  `LOCATION_ID` varchar(64) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.challenge_list_props
CREATE TABLE IF NOT EXISTS `challenge_list_props` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(64) NOT NULL,
  `VALUE` varchar(64) NOT NULL,
  `CHALLENGE_LIST_ID` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `CHALLENGE_LIST_TO_CHALLENGE_LIST_PROPS` (`CHALLENGE_LIST_ID`),
  CONSTRAINT `CHALLENGE_LIST_TO_CHALLENGE_LIST_PROPS` FOREIGN KEY (`CHALLENGE_LIST_ID`) REFERENCES `challenge_list` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.challenge_list_user__gang_map
CREATE TABLE IF NOT EXISTS `challenge_list_user__gang_map` (
  `ID` varchar(64) NOT NULL,
  `CHALLENGE_LIST_ID` varchar(64) NOT NULL,
  `CHALLENGER_ID` varchar(64) NOT NULL,
  `CHALLENGEE_ID` varchar(64) NOT NULL,
  `TYPE` char(1) NOT NULL DEFAULT '0',
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `STATE` char(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `CHALLENGE_LIST_TO_CHALLENGE_LIST_USER__GANG_MAP` (`CHALLENGE_LIST_ID`),
  CONSTRAINT `CHALLENGE_LIST_TO_CHALLENGE_LIST_USER__GANG_MAP` FOREIGN KEY (`CHALLENGE_LIST_ID`) REFERENCES `challenge_list` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.challenge_user__gang_map
CREATE TABLE IF NOT EXISTS `challenge_user__gang_map` (
  `ID` varchar(64) NOT NULL,
  `CHALLENGE_ID` varchar(64) NOT NULL,
  `CHALLENGER_ID` varchar(64) NOT NULL,
  `CHALLENGEE_ID` varchar(64) NOT NULL,
  `TYPE` char(1) NOT NULL DEFAULT '0',
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `STATE` char(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  KEY `CHALLENGE_TO_CHALLENGE_USER__GANG_MAP` (`CHALLENGE_ID`),
  CONSTRAINT `CHALLENGE_TO_CHALLENGE_USER__GANG_MAP` FOREIGN KEY (`CHALLENGE_ID`) REFERENCES `challenge` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.event
CREATE TABLE IF NOT EXISTS `event` (
  `ID` varchar(64) NOT NULL,
  `TYPE` char(1) NOT NULL,
  `USER_ID` varchar(64) NOT NULL,
  `TS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `CHALLENGE_ID` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.event_data
CREATE TABLE IF NOT EXISTS `event_data` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(64) NOT NULL,
  `VALUE` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.friends_map
CREATE TABLE IF NOT EXISTS `friends_map` (
  `ID` varchar(64) NOT NULL,
  `USER_ID` varchar(64) NOT NULL,
  `FRIEND_ID` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `FRIEND_TO_FRIENDS_MAP` (`FRIEND_ID`),
  KEY `USER_TO_FRIENDS_MAP` (`USER_ID`),
  CONSTRAINT `FRIEND_TO_FRIENDS_MAP` FOREIGN KEY (`FRIEND_ID`) REFERENCES `user` (`ID`),
  CONSTRAINT `USER_TO_FRIENDS_MAP` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.gang
CREATE TABLE IF NOT EXISTS `gang` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(128) NOT NULL,
  `THEME` varchar(64) NOT NULL,
  `DESCRIPTION` varchar(256) NOT NULL,
  `PROFILE_IMAGEID` varchar(64) NOT NULL,
  `COVER_IMAGEID` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `LOCATION_ID` varchar(64) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.gang_user_map
CREATE TABLE IF NOT EXISTS `gang_user_map` (
  `ID` varchar(64) NOT NULL,
  `USER_ID` varchar(64) NOT NULL,
  `GANG_ID` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `GANG_TO_GANG_USER_MAP` (`GANG_ID`),
  KEY `USER_DETAILS_TO_GANG_USER_MAP` (`USER_ID`),
  CONSTRAINT `GANG_TO_GANG_USER_MAP` FOREIGN KEY (`GANG_ID`) REFERENCES `gang` (`ID`),
  CONSTRAINT `USER_DETAILS_TO_GANG_USER_MAP` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.location
CREATE TABLE IF NOT EXISTS `location` (
  `ID` varchar(64) NOT NULL,
  `LOCALITY1` varchar(64) NOT NULL,
  `LOCALITY2` varchar(64) NOT NULL,
  `CITY` varchar(64) NOT NULL,
  `STATE` varchar(64) NOT NULL,
  `COUNTRY` varchar(64) NOT NULL,
  `LATITUDE` varchar(16) NOT NULL,
  `LONGITUDE` varchar(16) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.media
CREATE TABLE IF NOT EXISTS `media` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(128) NOT NULL,
  `TYPE` varchar(16) NOT NULL,
  `REF_ID` varchar(64) NOT NULL,
  `PATH` varchar(128) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `OWNER` varchar(64) NOT NULL,
  `EXTENSION` varchar(16) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.media_data
CREATE TABLE IF NOT EXISTS `media_data` (
  `ID` varchar(64) NOT NULL,
  `MEDIA_ID` varchar(64) NOT NULL,
  `NAME` varchar(64) NOT NULL,
  `VALUE` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `MEDIA_TO_MEDIA_DATA` (`MEDIA_ID`),
  CONSTRAINT `MEDIA_TO_MEDIA_DATA` FOREIGN KEY (`MEDIA_ID`) REFERENCES `media` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.user
CREATE TABLE IF NOT EXISTS `user` (
  `ID` varchar(64) NOT NULL,
  `FIRST_NAME` varchar(64) NOT NULL,
  `LAST_NAME` varchar(64) DEFAULT NULL,
  `EMAIL` varchar(64) DEFAULT NULL,
  `MOBILENUMBER` varchar(16) DEFAULT NULL,
  `GENDER` char(1) NOT NULL,
  `DOB` date NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `HOME_LOCATIONID` varchar(64) NOT NULL,
  `CURRENT_LOCATIONID` varchar(64) NOT NULL,
  `COVER_IMAGEID` varchar(64) NOT NULL,
  `PROFILE_IMAGEID` varchar(64) NOT NULL,
  `USER_LOGIN_ID` varchar(64) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `USER_USER_LOGIN` (`USER_LOGIN_ID`),
  CONSTRAINT `USER_USER_LOGIN` FOREIGN KEY (`USER_LOGIN_ID`) REFERENCES `user_login` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.user_data
CREATE TABLE IF NOT EXISTS `user_data` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(64) NOT NULL,
  `VALUE` varchar(64) DEFAULT NULL,
  `USER_ID` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`),
  KEY `USER_DATA_USER_DETAILS` (`USER_ID`),
  CONSTRAINT `USER_DATA_USER_DETAILS` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.


-- Dumping structure for table challenge.user_login
CREATE TABLE IF NOT EXISTS `user_login` (
  `ID` varchar(64) NOT NULL,
  `USER_NAME` varchar(64) NOT NULL,
  `PASSWORD` varchar(64) NOT NULL,
  `CREATEDTS` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATEDTS` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
