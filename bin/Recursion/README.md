# Introduction

Recursion is a concept in programming where a function calls itself. In the Java programming language, recursion is often used to solve problems that can be broken down into smaller subproblems.

## Basic Recursion Concepts

1. The Function Call Itself:

   - Recursion involves a function calling itself. This allows solving problems in a structured manner.

2. Base Condition:

   - Every recursive function must have a base condition that stops the recursive call. Without a base condition, recursion will continue until it reaches the system limit and causes stack overflow.

## Recursive Function Examples

Factorial:

```java
Copy code
public static int factorial(int n) {
    if (n <= 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

```

- This function calculates the factorial of a number by utilising the recursive property.
  Fibonacci sequence:

```java
Copy code
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

```

- This function generates values in the Fibonacci sequence using recursion.
Digit Summation:

```java
Copy code
public static int sumDigits(int n) {
    if (n == 0) {
        return 0;
    } else {
        return n %10 + sumDigits(n / 10);
    }
}

```

- This function counts the number of digits in a number.

## Recursion Steps

1. Identify Sub-problems:
   - Identify a problem that can be solved into smaller subproblems.
  
2. Define Base Conditions:
   - Define the conditions that, if met, will stop the recursion.

3. Recursive Calculation:
   - Calculate the result by calling the function itself for smaller subproblems.

4. Combine Subproblem Results:
   - Combine the results of the subproblems to get the final solution.

## Advantages and Disadvantages of Recursion

1. Advantages:

   - Code can be cleaner and easier to understand in some cases.
   - Enables problem solving that is recursive in nature.

2. Disadvantage:

   - Requires additional memory allocation as each function call gets a new stack frame.
   - Some recursion implementations can be less efficient than iterative approaches.

## Conclusion

Recursion is a powerful tool in programming to handle problems that can be solved in a structured way. A good understanding of base conditions and recursion steps is essential to prevent recursion failures and maintain programme efficiency.

## Public static vs Private static

1. Public static
   - public: The method or variable can be accessed from anywhere, either from the class itself, from a class in the same package, or from a class in another package.
   - static: The method or variable is associated with the class, not with an object instance. This means that you can call a method or access a variable without creating an object of the class.
2 Private static
   - private: A method or variable can only be accessed from within the class itself. It cannot be accessed from other classes, even if the other classes are in the same package.
   - static: The method or variable is associated with the class, not with an object instance. This means that you can call a method or access a variable without creating an object of the class.
