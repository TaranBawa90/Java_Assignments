# Linear Recursion Practice Set

This repository contains solutions to **20 recursion-based programming problems**. The questions focus on understanding the basic concepts of **linear recursion**, including base cases, recursive calls, arrays, numbers, and strings.

## 📚 Topics Covered

The problems are divided into three main categories:

### 1. Integer Problems

Problems related to numbers and digit manipulation:

1. Print Numbers from 1 to N
2. Print Numbers from N to 1
3. Factorial of a Number
4. Sum of First N Natural Numbers
5. Sum of Digits
6. Count Digits
7. Reverse a Number

### 2. Array Problems

Problems that use recursion to process array elements:

8. Print Array Elements
9. Print Array in Reverse
10. Sum of Array Elements
11. Find Maximum Element
12. Find Minimum Element
13. Count Occurrences
14. Check Sorted Array

### 3. String Problems

Problems involving recursive string processing:

15. Print Characters
16. Count Vowels
17. Count Character Occurrences
18. Reverse a String
19. Check Palindrome
20. Count Uppercase Letters

The original practice set contains sample test cases for each problem.

## 🎯 Objective

The main objective of this practice set is to build a strong understanding of **recursion** and learn how to solve problems by breaking them into smaller subproblems.

Through these questions, the following concepts are practiced:

* Base Case
* Recursive Case
* Recursive Function Calls
* Number Recursion
* Digit Manipulation
* Array Traversal
* String Traversal
* Finding Maximum and Minimum
* Counting Elements
* Palindrome Checking
* Checking Sorted Arrays

## 🧠 What is Linear Recursion?

Linear recursion is a type of recursion where a function makes **only one recursive call during each execution**.

For example:

```java
void print(int n) {
    if (n == 0)
        return;

    print(n - 1);
    System.out.println(n);
}
```

Here, each function call makes only one more recursive call.

## 📂 Practice Structure

The repository can be organized like this:

```text
Linear-Recursion-Practice/
│
├── IntegerProblems/
│   ├── Print1ToN.java
│   ├── PrintNTo1.java
│   ├── Factorial.java
│   ├── SumNaturalNumbers.java
│   ├── SumOfDigits.java
│   ├── CountDigits.java
│   └── ReverseNumber.java
│
├── ArrayProblems/
│   ├── PrintArray.java
│   ├── ReverseArray.java
│   ├── SumArray.java
│   ├── MaximumElement.java
│   ├── MinimumElement.java
│   ├── CountOccurrences.java
│   └── CheckSorted.java
│
├── StringProblems/
│   ├── PrintCharacters.java
│   ├── CountVowels.java
│   ├── CountCharacterOccurrences.java
│   ├── ReverseString.java
│   ├── Palindrome.java
│   └── CountUppercase.java
│
└── README.md
```

## 📝 Sample Problems

### Factorial

**Input:**

```text
5
```

**Output:**

```text
120
```

### Sum of Digits

**Input:**

```text
5234
```

**Output:**

```text
14
```

### Reverse a String

**Input:**

```text
Hello
```

**Output:**

```text
olleH
```

### Check Palindrome

**Input:**

```text
madam
```

**Output:**

```text
Palindrome
```

These examples are based on the sample test cases provided in the practice set.

## 💻 Language

The solutions can be implemented using:

* Java
* Recursion
* Arrays
* Strings

## 🚀 Learning Outcome

After completing these 20 problems, I am able to:

* Understand how recursion works.
* Identify and write appropriate base cases.
* Make recursive calls correctly.
* Solve basic number problems recursively.
* Traverse arrays recursively.
* Process strings recursively.
* Apply recursion to searching and counting problems.
* Understand common recursion patterns.

## 📌 Practice Goal

The goal is not only to get the correct output, but to understand **how the problem becomes smaller with every recursive call** and how the function eventually reaches its base case.

---

### ⭐ Practice. Understand. Recursively Solve.

This repository is created for practicing and strengthening **Linear Recursion concepts** through progressively varied problems.
