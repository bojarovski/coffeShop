```angular2html

DROP DATABASE IF EXISTS coffee_bar;
CREATE DATABASE coffee_bar;
USE coffee_bar;

CREATE TABLE role (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(255)
);

CREATE TABLE `user` (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        first_name VARCHAR(255),
                        last_name VARCHAR(255),
                        email VARCHAR(255) UNIQUE,
                        password VARCHAR(255),
                        role_id INT,
                        FOREIGN KEY (role_id) REFERENCES role(id) ON DELETE SET NULL
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



-- Insert data into the role table
INSERT INTO role (name) VALUES
('Admin'),
('User');

INSERT INTO `user` (first_name, last_name, email, role_id, password) VALUES
('John', 'Doe', 'john@example.com', 1, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'), -- Password: 123456789
('Alice', 'Smith', 'alice@example.com', 2, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'),
('Bob', 'Johnson', 'bob@example.com', 1, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'),
('Emily', 'Brown', 'emily@example.com', 1, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'),
('Michael', 'Wilson', 'michael@example.com', 2, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'),
('Sarah', 'Anderson', 'sarah@example.com', 1, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'),
('David', 'Martinez', 'david@example.com', 2, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'),
('Olivia', 'Taylor', 'olivia@example.com', 2, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'),
('James', 'Garcia', 'james@example.com', 1, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK'),
('Sophia', 'Hernandez', 'sophia@example.com', 2, '$2y$12$SxvN5jG9zDe5ouGOmj/oo.OtzHrzfJAdOcKpB0mFy9nNhfGjopDYK');


-- Insert data into the coffee table
INSERT INTO coffee (name, description, price) VALUES
('Espresso', 'Strong and concentrated coffee', 2.50),
('Latte', 'Espresso with steamed milk', 3.50),
('Cappuccino', 'Espresso with frothy milk', 3.00),
('Americano', 'Espresso with hot water', 2.75),
('Mocha', 'Espresso with chocolate syrup', 4.00),
('Macchiato', 'Espresso with a dash of milk', 3.25),
('Flat White', 'Espresso with velvety milk', 3.75),
('Affogato', 'Espresso with vanilla ice cream', 4.50),
('Irish Coffee', 'Coffee with Irish whiskey', 4.25),
('Frappuccino', 'Blended coffee with ice', 4.00);

-- Insert data into the ingredient table
INSERT INTO ingredient (name, description) VALUES
('Coffee Beans', 'Freshly ground Arabica beans'),
('Milk', 'Fresh whole milk'),
('Chocolate', 'Rich cocoa powder'),
('Water', 'Purified spring water'),
('Vanilla', 'Pure vanilla extract'),
('Whiskey', 'Premium Irish whiskey'),
('Ice Cream', 'Creamy vanilla ice cream'),
('Sugar', 'Fine granulated sugar'),
('Cinnamon', 'Ground cinnamon spice'),
('Cream', 'Heavy cream');

-- Insert data into the coffee_ingredient table
INSERT INTO coffee_ingredient (coffee_id, ingredient_id, quantity) VALUES
(1, 1, '2 shots'),
(1, 4, '1 cup'),
(2, 1, '1 shot'),
(2, 2, '1 cup'),
(3, 1, '1 shot'),
(3, 2, '1 cup'),
(4, 1, '1 shot'),
(4, 4, '1 cup'),
(5, 1, '1 shot'),
(5, 3, '1 tbsp');




```