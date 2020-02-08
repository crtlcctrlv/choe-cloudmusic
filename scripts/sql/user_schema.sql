CREATE SCHEMA `user` DEFAULT CHARACTER SET utf8mb4;

drop table if exists user_0;

CREATE TABLE `user_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `gender` enum('M','F','U') NOT NULL,
  `avatar_url` varchar(256) DEFAULT NULL,
  `is_vinyl` tinyint(1) NOT NULL DEFAULT '0',
  `expiry_date` date DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

drop table if exists user_1;

CREATE TABLE `user_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `gender` enum('M','F','U') NOT NULL,
  `avatar_url` varchar(256) DEFAULT NULL,
  `is_vinyl` tinyint(1) NOT NULL DEFAULT '0',
  `expiry_date` date DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

drop table if exists user_2;

CREATE TABLE `user_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `gender` enum('M','F','U') NOT NULL,
  `avatar_url` varchar(256) DEFAULT NULL,
  `is_vinyl` tinyint(1) NOT NULL DEFAULT '0',
  `expiry_date` date DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

drop table if exists user_3;

CREATE TABLE `user_3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `gender` enum('M','F','U') NOT NULL,
  `avatar_url` varchar(256) DEFAULT NULL,
  `is_vinyl` tinyint(1) NOT NULL DEFAULT '0',
  `expiry_date` date DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;