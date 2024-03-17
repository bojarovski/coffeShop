```angular2html

DROP DATABASE IF EXISTS coffee_bar;
CREATE DATABASE coffee_bar;
USE coffee_bar;



CREATE TABLE `user` (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        first_name VARCHAR(255),
                        last_name VARCHAR(255),
                        email VARCHAR(255) UNIQUE,
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
-- Seed data for the `user` table
INSERT INTO `user` (first_name, last_name, email) VALUES
('John', 'Doe', 'john@example.com'),
('Alice', 'Smith', 'alice@example.com'),
('Bob', 'Johnson', 'bob@example.com');

-- Seed data for the `coffee` table
INSERT INTO coffee (name, description, price) VALUES
('Espresso', 'Strong black coffee', 2.50),
('Latte', 'Coffee with steamed milk', 3.00),
('Cappuccino', 'Coffee with frothed milk', 3.50);

-- Seed data for the `ingredient` table
INSERT INTO ingredient (name, description) VALUES
('Coffee Beans', 'Arabica coffee beans'),
('Milk', 'Fresh cow milk'),
('Sugar', 'White granulated sugar'),
('Chocolate Syrup', 'Rich chocolate syrup');

-- Seed data for the `coffee_ingredient` table
INSERT INTO coffee_ingredient (coffee_id, ingredient_id, quantity) VALUES
(1, 1, '2 shots'),
(2, 1, '1 shot'),
(2, 2, '100ml'),
(3, 1, '1 shot'),
(3, 2, '50ml'),
(3, 4, '2 tablespoons');

```