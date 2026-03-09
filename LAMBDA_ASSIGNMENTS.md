# Lambda Assignments - Module 8.3

This project contains two Lambda expression assignments for practicing functional programming concepts in Java.

## Assignment Overview

### Task 1: Sorting and Filtering using Lambda (3 points)
**File:** `Task1SortingFiltering.java`

This program demonstrates sorting and filtering a list of Person objects using lambda expressions and the Comparator interface without using the Stream API.

**Key Concepts:**
- Lambda expressions with Comparator interface
- Sorting collections using lambda
- Filtering collections using `removeIf()` with lambda predicates
- forEach with lambda expressions

**Steps Implemented:**
1. Create a list of Person objects with various names, ages, and cities
2. Sort the list by age in ascending order using lambda expressions
3. Filter the sorted list to keep only people from "New York"

### Task 2: Collection Operations with Lambdas (3 points)
**File:** `Task2CollectionOperations.java`

This program demonstrates basic operations on a collection of integers using lambda expressions without using the Stream API.

**Key Concepts:**
- Lambda expressions with collection operations
- Filtering using `removeIf()`
- Transforming data using `replaceAll()`
- Aggregation using `forEach()`

**Steps Implemented:**
1. Create a list of integers: [10, 5, 8, 20, 15, 3, 12]
2. Filter even numbers (keep only odd numbers)
3. Double the value of odd numbers using `replaceAll()`
4. Calculate the sum of all numbers using lambda expressions

## Project Structure

```
src/main/java/org/example/module83/
├── Person.java                      # Person class for Task 1
├── Task1SortingFiltering.java       # Task 1 implementation
├── Task2CollectionOperations.java   # Task 2 implementation
├── HelloApplication.java            # JavaFX application (original)
├── HelloController.java             # JavaFX controller (original)
└── Launcher.java                    # JavaFX launcher (original)
```

## How to Run

### Option 1: Using IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Navigate to either `Task1SortingFiltering.java` or `Task2CollectionOperations.java`
3. Right-click on the file and select "Run"

### Option 2: Using Command Line (javac/java)

**For Task 1:**
```powershell
cd src\main\java
javac org\example\module83\Person.java org\example\module83\Task1SortingFiltering.java
java org.example.module83.Task1SortingFiltering
```

**For Task 2:**
```powershell
cd src\main\java
javac org\example\module83\Task2CollectionOperations.java
java org.example.module83.Task2CollectionOperations
```

### Option 3: Using Maven (if JAVA_HOME is configured)
```powershell
mvnw.cmd compile exec:java -Dexec.mainClass="org.example.module83.Task1SortingFiltering"
mvnw.cmd compile exec:java -Dexec.mainClass="org.example.module83.Task2CollectionOperations"
```

## Expected Output

### Task 1 Output:
```
Original list:
Person{name='Alice', age=30, city='New York'}
Person{name='Bob', age=25, city='Los Angeles'}
...

Sorted by age (ascending):
Person{name='Henry', age=22, city='New York'}
Person{name='Bob', age=25, city='Los Angeles'}
...

Filtered (only from New York):
Person{name='Henry', age=22, city='New York'}
Person{name='Alice', age=30, city='New York'}
...
```

### Task 2 Output:
```
Original list:
[10, 5, 8, 20, 15, 3, 12]

Filtered (odd numbers only):
[5, 15, 3]

Doubled odd numbers:
[10, 30, 6]

Sum of all numbers in original list:
Using for-each loop: 73
Using lambda forEach: 73

--- Complete workflow ---
1. Original: [10, 5, 8, 20, 15, 3, 12]
2. After filtering even numbers: [5, 15, 3]
3. After doubling odd numbers: [10, 30, 6]
4. Sum of doubled odd numbers: 46
```

## Learning Objectives

By completing these assignments, you will:
- Understand how to use lambda expressions in Java
- Learn to work with functional interfaces like Comparator, Predicate, and Consumer
- Practice sorting and filtering collections without Stream API
- Use collection methods like `removeIf()`, `replaceAll()`, and `forEach()`
- Understand the difference between traditional loops and lambda expressions
- Learn type inference in lambda expressions

## Grading

- Task 1 completed: 3 points
- Task 2 completed: 3 points
- **Total: 6 points**

## Key Lambda Concepts Demonstrated

1. **Lambda Syntax:** `(parameters) -> expression` or `(parameters) -> { statements }`
2. **Functional Interfaces:** Comparator, Predicate, Consumer
3. **Type Inference:** Lambda parameters don't need explicit type declaration
4. **Method References:** Alternative to lambda (commented in code)
5. **Effectively Final Variables:** Variables used in lambda must be final or effectively final

## Additional Notes

- Both tasks avoid using the Stream API to focus on fundamental lambda concepts
- The code includes alternative approaches and comments for educational purposes
- Each task demonstrates multiple lambda use cases in a single program
- The implementations follow Java best practices and coding standards

## References

- Java Lambda Expressions: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
- Functional Interfaces: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
- Lambda Calculus: Davis, M., "Computability and Unsolvability", Dover, 1982

