CREATE SCHEMA `radio` DEFAULT CHARACTER SET utf8mb4;

drop table if exists category;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_cat_id` (`cat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;