CREATE SCHEMA `music` DEFAULT CHARACTER SET utf8mb4;

drop table if exists album;

CREATE TABLE `album` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `album_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `alias` varchar(50) DEFAULT NULL,
  `artist_id` int(11) NOT NULL,
  `artist_name` varchar(50) NOT NULL,
  `company` varchar(50) DEFAULT NULL,
  `pic_url` varchar(256) NOT NULL,
  `size` smallint(6) NOT NULL,
  `comment_count` int(11) NOT NULL,
  `share_count` int(11) NOT NULL,
  `comment_thread_id` varchar(32) DEFAULT NULL,
  `description` text,
  `publish_time` date NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_album_id` (`album_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

drop table if exists artist;

CREATE TABLE `artist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `artist_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `alias` varchar(100) DEFAULT NULL,
  `category` varchar(4) DEFAULT NULL,
  `initial` varchar(1) DEFAULT NULL,
  `pic_url` varchar(256) NOT NULL,
  `brief_desc` varchar(1024) NOT NULL,
  `music_size` smallint(6) NOT NULL,
  `album_size` smallint(6) NOT NULL,
  `mv_size` smallint(6) NOT NULL,
  `introduction` text,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_artist_id` (`artist_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

drop table if exists song;

CREATE TABLE `song` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `song_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `alias` varchar(50) DEFAULT NULL,
  `album_id` int(11) NOT NULL,
  `album_name` varchar(50) NOT NULL,
  `artist_id` int(11) NOT NULL,
  `artist_name` varchar(50) NOT NULL,
  `duration` int(11) NOT NULL,
  `mv_id` int(11) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_song_id` (`song_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

drop table if exists task_fail_record;

CREATE TABLE `task_fail_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_type` tinyint(2) NOT NULL,
  `task_impl_id` int(11) NOT NULL,
  `reason` varchar(200) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;