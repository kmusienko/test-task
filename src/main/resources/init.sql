DROP SCHEMA IF EXISTS usersecure;
CREATE SCHEMA usersecure CHARACTER SET UTF8;
USE usersecure;

CREATE USER IF NOT EXISTS 'db_admin'@'localhost' IDENTIFIED BY 'rNT5Vn[j(>R2r6.UXcJwtv];`RWewYH`';
GRANT ALL PRIVILEGES ON usersecure.* TO 'db_admin'@'localhost';

FLUSH PRIVILEGES ;