# Concepts of Constructor Declarations, Parameterised Constructors, and Defaults

## Constructors

Constructors are special methods in a class that are executed when an object of that class is created. The main purpose of a constructor is to initialise the object. In Java, the constructor name must be the same as the class name.

- Constructor Declaration

    ```java
    public class MyClass {
        // Default constructor
        public MyClass() {
            // Object initialisation logic
        }
    }
    ```

## Parameterised Constructors

Parameterised constructors allow us to initialise an object with a value given at object creation.

- Parameterised Constructor Declaration

    ```java
    public class Person {
        String name;
        int age;

        // Parameterised constructor
        public Person(String n, int a) {
            name = n;
            age = a;
        }
    }
    ```

## Default Constructor

A default constructor is a constructor that has no parameters. If no constructor is declared in a class, Java automatically provides a default constructor.

- Default Constructor Declaration

    ```java
    public class MyClass {
        // Default constructor
        public MyClass() {
            // Object initialisation logic
        }
    }
    ```

## Comparative Study between Constructor and Function

| |Constructor| Function|
|---|---|---|
|Name | Same as class name |As per declared name|
|Return Value | Does not return value (void) |Can return value according to type|
|Invocation |Automatic invocation during object creation |Manual through function name|
|Initialisation | Used for object initialisation |Used for execution of certain logic|

## Concept of Constructor Overloading in Java

Constructor overloading allows us to declare multiple constructors with the same name in a class, but with different parameters.

- Example of Constructor Overloading

    ```java
    public class Rectangle {
        int length;
        int width;

        // Constructor without parameters
        public Rectangle() {
            length = 0;
            width = 0;
        }

        // Constructor with two parameters
        public Rectangle(int l, int w) {
            length = l;
            width = w;
        }

        // Constructor with one parameter (square)
        public Rectangle(int side) {
            length = side;
            width = side;
        }
    }
    ```

With the concept of constructor overloading, we can create objects in various ways as needed without having to create different constructor names.

## Code explanation

The code in 'Series.java' is a Java program that uses the constructor concept to initialise objects of the `Series` class. The following is an explanation of the code based on the constructor concept:

1. The `Series` class has three instance variables, `n`, `x`, and `k` that represent the number of terms (n), x values, and power values (k) of the series, and one variable `series_number` that indicates the type of series to be calculated.

2. There are three constructors in the `Series` class:
   - The first constructor (`Series(int number_of_terms)`) is used to initialise the object with the number of terms (n) of the series.
   - The second constructor (`Series(int number_of_terms, int value_of_x)`) is used to initialise an object with the number of terms (n) and the value x of the series.
   - The third constructor (`Series(int number_of_terms, int value_of_x, int power)`) is used to initialise an object with the number of terms (n), value of x, and power value (k) of the sequence.

3. The `calculate()` method is used to calculate the value of each sequence based on the values initialised using the constructor. This method returns the value of the sum of the series.

4. In the `main` method, the programme reads the user input for the number of terms (n), x-value, and power value (k). Then, three `Series` objects will be initialised using constructors corresponding to the given inputs.

5. Once the objects are initialised, the `calculate()` method is called for each `Series` object to calculate the sum of each series.

6. The result of the calculation will then be printed to the screen.

Using the concept of constructors, the code makes it possible to create `Series` objects in different ways depending on the type of series to be calculated (declared by the `series_number` variable) and the parameters given during object creation.
