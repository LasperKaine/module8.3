# Quick Start Guide - Lambda Assignments

## 📋 Assignment Tasks

### ✅ Task 1: Sorting and Filtering (3 points)
**File:** `Task1SortingFiltering.java`

**What it does:**
1. Creates a list of 8 Person objects with different ages and cities
2. Sorts them by age (ascending) using lambda expressions
3. Filters to keep only people from "New York"

**Run it:**
```powershell
cd src\main\java
javac org\example\module83\Person.java org\example\module83\Task1SortingFiltering.java
java org.example.module83.Task1SortingFiltering
```

**Expected Output:**
- Original list of 8 people
- Sorted list by age (22 to 40)
- Filtered list with only 4 people from New York

---

### ✅ Task 2: Collection Operations (3 points)
**File:** `Task2CollectionOperations.java`

**What it does:**
1. Creates a list: [10, 5, 8, 20, 15, 3, 12]
2. Filters out even numbers → [5, 15, 3]
3. Doubles odd numbers → [10, 30, 6]
4. Sums all numbers using lambda → 73

**Run it:**
```powershell
cd src\main\java
javac org\example\module83\Task2CollectionOperations.java
java org.example.module83.Task2CollectionOperations
```

**Expected Output:**
- Original list
- Filtered odd numbers
- Doubled values
- Sum calculations (73)
- Complete workflow demonstration

---

## 🎓 Bonus: Lambda Demo
**File:** `LambdaDemo.java`

Comprehensive examples of lambda concepts from the course material:
- Basic lambda with Runnable
- Functional interfaces
- Consumer and Predicate
- Method references
- Higher-order functions

**Run it:**
```powershell
cd src\main\java
javac org\example\module83\LambdaDemo.java
java org.example.module83.LambdaDemo
```

---

## 📁 Project Structure

```
module8.3/
├── src/main/java/org/example/module83/
│   ├── Person.java                      ← Task 1 model
│   ├── Task1SortingFiltering.java       ← TASK 1 (3 pts)
│   ├── Task2CollectionOperations.java   ← TASK 2 (3 pts)
│   └── LambdaDemo.java                  ← Bonus demos
├── LAMBDA_ASSIGNMENTS.md                ← Full documentation
├── PROJECT_SUMMARY.md                   ← Technical summary
└── QUICK_START.md                       ← This file
```

---

## 🔑 Key Lambda Concepts Used

| Concept | Task 1 | Task 2 | Where Used |
|---------|--------|--------|------------|
| Lambda with Comparator | ✓ | | `.sort((p1, p2) -> ...)` |
| Predicate (removeIf) | ✓ | ✓ | `.removeIf(p -> ...)` |
| Consumer (forEach) | ✓ | ✓ | `.forEach(n -> ...)` |
| UnaryOperator (replaceAll) | | ✓ | `.replaceAll(n -> n * 2)` |
| Type inference | ✓ | ✓ | Auto-detect parameter types |
| Single expression lambda | ✓ | ✓ | `n -> n * 2` |
| Block lambda | ✓ | | `() -> { statements; }` |

---

## ✨ Lambda Syntax Quick Reference

```java
// Single parameter (no parentheses needed)
n -> n * 2

// Multiple parameters
(a, b) -> a + b

// With explicit types
(int a, int b) -> a + b

// With block
(a, b) -> {
    int result = a + b;
    return result;
}

// No parameters
() -> System.out.println("Hello")
```

---

## 🎯 Grading Checklist

- [x] Task 1: Person class created
- [x] Task 1: List of Person objects created
- [x] Task 1: Sort by age with lambda
- [x] Task 1: Filter by city with lambda
- [x] Task 1: Compiles and runs correctly
- [x] Task 2: Integer list created
- [x] Task 2: Filter even numbers with lambda
- [x] Task 2: Double odd numbers with lambda
- [x] Task 2: Sum numbers with lambda
- [x] Task 2: Compiles and runs correctly

**Total: 6 points**

---

## 🚀 Quick Test

Run both tasks at once:
```powershell
cd src\main\java
javac org\example\module83\*.java 2>$null
java org.example.module83.Task1SortingFiltering
Write-Host "`n========================================`n"
java org.example.module83.Task2CollectionOperations
```

---

## 📚 References

- Java Lambda Tutorial: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
- Functional Interfaces: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
- Course Material: Lambda Calculus section in Module 8.3

---

## ❓ Troubleshooting

**Problem:** `javac: command not found`
- Solution: Make sure Java JDK is installed and in your PATH

**Problem:** Files won't compile
- Solution: Make sure you're in `src\main\java` directory
- Check file paths match exactly

**Problem:** Can't run the program
- Solution: Compile first with `javac`, then run with `java`
- Use the full class name: `org.example.module83.TaskName`

---

**Created:** March 9, 2026
**Module:** 8.3 - Lambda Expressions
**Status:** ✅ Complete and Tested

