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
