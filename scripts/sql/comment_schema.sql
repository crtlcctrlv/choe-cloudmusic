CREATE SCHEMA `comment` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;

drop table if exists t_comment_0;

CREATE TABLE `t_comment_0` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `parent_comment_id` int(11) DEFAULT NULL,
  `work_id` int(11) NOT NULL,
  `work_type` enum('ALBUM','SONG','MV') NOT NULL,
  `content` varchar(200) NOT NULL,
  `like_count` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_comment_id` (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

drop table if exists t_comment_1;

CREATE TABLE `t_comment_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `parent_comment_id` int(11) DEFAULT NULL,
  `work_id` int(11) NOT NULL,
  `work_type` enum('ALBUM','SONG','MV') NOT NULL,
  `content` varchar(200) NOT NULL,
  `like_count` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_comment_id` (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

drop table if exists t_comment_2;

CREATE TABLE `t_comment_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `parent_comment_id` int(11) DEFAULT NULL,
  `work_id` int(11) NOT NULL,
  `work_type` enum('ALBUM','SONG','MV') NOT NULL,
  `content` varchar(200) NOT NULL,
  `like_count` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_comment_id` (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

drop table if exists t_comment_3;

CREATE TABLE `t_comment_3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `parent_comment_id` int(11) DEFAULT NULL,
  `work_id` int(11) NOT NULL,
  `work_type` enum('ALBUM','SONG','MV') NOT NULL,
  `content` varchar(200) NOT NULL,
  `like_count` int(11) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_comment_id` (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;