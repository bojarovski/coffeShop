```
DROP DATABASE IF EXISTS coffee_bar;
CREATE DATABASE coffee_bar;
USE coffee_bar;

CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255) UNIQUE
);

CREATE TABLE coffee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    price DECIMAL(10,2)
);

CREATE TABLE ingredient (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT
);

CREATE TABLE coffee_ingredient (
    coffee_id INT,
    ingredient_id INT,
    quantity VARCHAR(255),
    PRIMARY KEY (coffee_id, ingredient_id),
    FOREIGN KEY (coffee_id) REFERENCES coffee(id) ON DELETE CASCADE,
    FOREIGN KEY (ingredient_id) REFERENCES ingredient(id) ON DELETE CASCADE
);
```
