### ecom-java-lab-task2

- [Create an order from customer. (example given as in product side)](https://github.com/b14ck0ps/ecom-java-lab/commit/da62fbf24df84a4c6341d41d8897bf90e8346f5d)
- [Save address of a customer while creating customer or user (One to Many)](https://github.com/b14ck0ps/ecom-java-lab/commit/aa5fc0695311fc80c95e20f2df7d2213321d76e4)
- [Use lazy loading while fetching data in one to many association](https://github.com/b14ck0ps/ecom-java-lab/commit/8958db2511a0ad1625fa260f276f26f00cb92103)


### Schema
```mysql
CREATE TABLE `user` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `full_name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `enabled` TINYINT(1) NOT NULL,
  `created_on` DATE,
  PRIMARY KEY (`id`)
);


CREATE TABLE `product` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255),
  PRIMARY KEY (`id`)
);


CREATE TABLE `customer` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `gender` varchar(10) NOT NULL,
  `date_of_birth` date NOT NULL,
  `user_id` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_CUSTOMER_USER` (`user_id`),
  CONSTRAINT `FK_CUSTOMER_USER` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
);



CREATE TABLE `address` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(255),
  `type` ENUM('HOME','OFFICE','LOCAL'),
  `customer_id` BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_ADDRESS_CUSTOMER` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
);


CREATE TABLE `customer_order` (
  `product_id` BIGINT UNSIGNED NOT NULL,
  `customer_id` BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (`product_id`,`customer_id`),
  CONSTRAINT `FK_CUSTOMER_ORDER_PRODUCT` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
  CONSTRAINT `FK_CUSTOMER_ORDER_CUSTOMER` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
);

```
