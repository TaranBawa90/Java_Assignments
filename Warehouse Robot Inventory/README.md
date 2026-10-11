# Warehouse Robot Inventory System

## 📌 Overview

The Warehouse Robot Inventory System is a Java-based program that manages product inventory stored in an **N X N** warehouse grid.
The warehouse data is stored in a 2D integer array, where:   
Each cell represents the number of products stored in a particular section of the grid.   
A warehouse robot **traverses the entire grid starting from the top-left corner, moving along the boundary and spiraling inward.**   
The system tracks product counts in spiral order, calculates perimeter stock, and identifies peak stock sections. 



## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- 2D Arrays
- Spiral Traversal Algorithm
- Methods and Constructors

## 📋 Requirements

The system includes the following functionalities:

1. Create a `Warehouse` class.
2. Store warehouse inventory data using a 2D integer array named inventory.
3. Use a constructor to initialize the warehouse inventory.
4. Display the warehouse layout using displayInventory().
5. Print the product count in spiral traversal order using getRobotVisitOrder().
6. Calculate the total products stored along the outer boundary using calculateBoundaryStock().
7. Identify the section containing the maximum number of products using findMaximumSection().
8. Demonstrate all operations by creating an object in `main()`.
  
## 📊 Sample Data

| Row/Col | C1 | C2 | C3 | C4 |
|----------|----|----|----|----|
| R1 | 10 | 20 | 30 | 40 |
| R2 | 50 | 60 | 70 | 80 |
| R3 | 90 | 100 | 110 | 120 |
| R4 | 130 | 140 | 150 | 160 |

## 🔄 Project-Wise Report

After performing spiral traversal starting from the top-left corner:
`10 -> 20 -> 30 -> 40 -> 80 -> 120 -> 160 -> 150 -> 140 -> 130 -> 90 -> 50 -> 60 -> 70 -> 110 -> 100 `


## 🧮 Calculations

## Layer-Wise Breakdown (Dabbe Ke Andar Dabba)
- Outer Boundary (Layer 1): 12 sections (10, 20, 30, 40, 80, 120, 160, 150, 140, 130, 90, 50)   
- Inner Boundary (Layer 2): 4 sections (60, 70, 110, 100)

### Maximum Value of Stock and its Section

maximum value of stock & its section


## 📚 Concepts Practiced

This project helps practice:

- Classes and Objects
- Constructors
- Encapsulation
- Methods
- 2D Arrays
- Nested Loops & Array Traversal
- Spiral Traversal Algorithm
- Boundary Traversal
- Finding Maximum Values   

## 🎯 Learning Objective

The main objective of this project is to understand how **OOP concepts and 2D arrays** can be combined to solve a real-world warehouse - inventory problem.

It also provides practice with **matrix spiral** .

## 👩‍💻 Author
Taranpreet Kaur
