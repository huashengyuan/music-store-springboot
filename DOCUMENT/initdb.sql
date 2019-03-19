CREATE DATABASE `musticstore`  DEFAULT CHARACTER SET utf8;

CREATE TABLE `user` (
  `uuid` varchar(36) NOT NULL,
  `first_name` varchar(8) NOT NULL,
  `last_name` varchar(8) NOT NULL,
  `nick_name` varchar(8) NOT NULL,
  `gender` enum('unknow','male','female') NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` varchar(12) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `uuid_UNIQUE` (`uuid`),
  UNIQUE KEY `nick_name_UNIQUE` (`nick_name`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

CREATE TABLE `artist` (
  `uuid` varchar(36) NOT NULL,
  `name` varchar(20) NOT NULL,
  `photo` varchar(25) DEFAULT NULL,
  `profile` text,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `uuid_UNIQUE` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='艺术家';

CREATE TABLE `genre` (
  `uuid` varchar(36) NOT NULL,
  `name` varchar(45) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否在售',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `uuid_UNIQUE` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='音乐流派';

CREATE TABLE `song` (
  `uuid` varchar(36) NOT NULL,
  `artist_uuid` varchar(36) NOT NULL,
  `genre_uuid` varchar(36) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` float NOT NULL,
  `file` varchar(45) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否在售，1：是的，0：没有',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `uuid_UNIQUE` (`uuid`),
  KEY `song_artist_uuid_idx` (`artist_uuid`),
  KEY `song_genre_uuid_idx` (`genre_uuid`),
  CONSTRAINT `song_artist_uuid` FOREIGN KEY (`artist_uuid`) REFERENCES `artist` (`uuid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `song_genre_uuid` FOREIGN KEY (`genre_uuid`) REFERENCES `genre` (`uuid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='歌曲';

CREATE TABLE `admin` (
  `uuid` varchar(36) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `role` varchar(12) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `is_deleted` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `uuid_UNIQUE` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后端管理员';

