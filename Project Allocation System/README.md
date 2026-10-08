# Employee–Project Allocation System

## 📌 Overview

The **Employee–Project Allocation System** is a Java-based program that manages the working hours of multiple employees across different projects.

The employee-project data is stored in a **2D integer array**, where:

- Each row represents an employee.
- Each column represents a project.
- Each value represents the number of hours an employee worked on a particular project.

The system transforms the employee-wise data into a **project-wise report using matrix transpose**.

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- 2D Arrays
- Matrix Transpose
- Methods and Constructors

## 📋 Requirements

The system includes the following functionalities:

1. Create a `ProjectAllocation` class.
2. Store employee-project working hours using a 2D integer array named `hours`.
3. Use a constructor to initialize the employee-project data.
4. Display the original employee-wise working hours.
5. Calculate the total hours worked by each employee.
6. Generate a project-wise report using the transpose of the matrix.
7. Calculate the total hours spent on each project.
8. Find the project with the maximum total working hours.

## 📊 Sample Data

| Employee | P1 | P2 | P3 |
|----------|----|----|----|
| E1 | 20 | 15 | 10 |
| E2 | 12 | 18 | 14 |
| E3 | 25 | 10 | 20 |
| E4 | 15 | 22 | 12 |

## 🔄 Project-Wise Report

After transposing the employee-wise matrix:

| Project | E1 | E2 | E3 | E4 |
|---------|----|----|----|----|
| P1 | 20 | 12 | 25 | 15 |
| P2 | 15 | 18 | 10 | 22 |
| P3 | 10 | 14 | 20 | 12 |

## 🧮 Calculations

### Employee Totals

- Employee E1: **45 hours**
- Employee E2: **44 hours**
- Employee E3: **55 hours**
- Employee E4: **49 hours**

### Project Totals

- Project P1: **72 hours**
- Project P2: **65 hours**
- Project P3: **56 hours**

### Most Worked Project

**Project P1** has the maximum total working hours with **72 hours**.

## 📚 Concepts Practiced

This project helps practice:

- Classes and Objects
- Constructors
- Instance Variables
- Methods
- 2D Arrays
- Array Traversal
- Matrix Transpose
- Row-wise Calculations
- Column-wise Calculations
- Finding Maximum Values

## 🎯 Learning Objective

The main objective of this project is to understand how **OOP concepts and 2D arrays** can be combined to solve a real-world employee-project allocation problem.

It also provides practice with **matrix transpose** and calculating totals across rows and columns.

## 👩‍💻 Author

**Taranpreet Kaur**

## 💻 Language

**Java**
