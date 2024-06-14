CREATE TABLE IF NOT EXISTS `user` (
    `id` SERIAL PRIMARY KEY,
    `name` varchar(255) DEFAULT NULL,
    `use_yn` tinyint DEFAULT 0
) COLLATE utf8mb4_general_ci;