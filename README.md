CREATE TABLE Users (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255),
    Surname VARCHAR(255),
    Email VARCHAR(255) UNIQUE
);

CREATE TABLE Coffees (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255),
    Description TEXT,
    Price DECIMAL(10,2)
);

CREATE TABLE Ingredients (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255),
    Description TEXT
);

CREATE TABLE Coffee_Ingredients (
    Coffee_ID INT,
    Ingredient_ID INT,
    Quantity VARCHAR(255),
    PRIMARY KEY (Coffee_ID, Ingredient_ID),
    FOREIGN KEY (Coffee_ID) REFERENCES Coffees(ID) ON DELETE CASCADE,
    FOREIGN KEY (Ingredient_ID) REFERENCES Ingredients(ID) ON DELETE CASCADE
);
