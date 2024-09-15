# Java Beginner

## Introduction
Java is an object-oriented programming language known for its reliability and ease of use across various platforms. This documentation will cover the basics of Java, including basic syntax, variables, data types, operators, control flow, and an introduction to OOP (Object-Oriented Programming).

## 1. Hello World
The first program that programmers usually write when learning a new programming language is "Hello, World!". Here is a simple example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Explanation
- `public class HelloWorld`: Declares a class named `HelloWorld`.
- `public static void main(String[] args)`: The `main` method is the entry point of the program.
- `System.out.println("Hello, World!");`: Prints "Hello, World!" to the console.

## 2. Variables
Variables are used to store data. Java has several primitive data types:

Syntax:<br>
<em>type variableName = value;</em>

```java
String name = "Petter";
```

Change the value
```java
int num = 100;
num = 200;  // num is now 200
```

## 3. Data Types
Variables are used to store data. Java has several primitive data types:

```java
int num = 5;               // Integer (whole number)
float floatNum = 9.87f;    // Floating point number
char character = 'A';      // Character
boolean bool = true;
```

### Data Types
- `byte` : Byte numbers from -128 to 127.
- `short` : short numbers from -32,768 to 32,767.
- `int`: Integer numbers from -2,147,483,648 to 2,147,483,647.
- `long` : long numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- `float` : float numbers. Sufficient for storing 6 to 7 decimal digits
- `double`: Decimal numbers. Sufficient for storing 15 decimal digits.
- `char`: Single character.
- `boolean`: True or false value.


## 4. Operators
Java supports various operators used to perform operations on variables.

### Example
```java
int a = 10;
int b = 5;
int sum = a + b;    // Addition operator
int diff = a - b;   // Subtraction operator
int prod = a * b;   // Multiplication operator
int quot = a / b;   // Division operator
int mod = a % b;    // Modulus operator (remainder)
```

## 5. Casting
Type casting in Java is the process of converting a variable from one data type to another.

There are two main types of type casting in Java:

- Widening Casting (Implicit): Automatically done by Java, converting a smaller type to a larger type size.
- Narrowing Casting (Explicit): Manually done by the programmer, converting a larger type to a smaller size type.

Example
```java
int num = 100;
double myDoub = 1000.0; // widening casting

double doub = num;
int muNym = (int)myDoub; // narrowing casting
```

## 6. Data Type Non Primitive
Non-primitive data types, also known as reference types, are types that are created by the programmer and not defined by Java itself
```java
Integer integerNumber = 100;
Long longNumber = 10000L;
Short shortNumber = 1000;
Float floatNumber = 1000F;
Double doubleNumber = 100.0;
Byte byteNumber = 10;
Boolean bool = true;
```

## 7. Operators
Operators are special symbols in Java that perform operations on variables and values. Java provides a rich set of operators to manipulate data, and they can be classified into different categories based on the functionality they provide.

Type of Operator
1. Arithmetic Operators
2. Unary Operators
3. Assignment Operators
4. Relational Operators
5. Logical Operators

### Arithmetic Operators
| Operator | Description	     | Example   |
| :------- | :-----------------: | :------   |
| `+`      | Addition 	         | `a + b`   |
| `-`      | Subtraction	     | `a - b`   |
| `*`      | Multiplication      |	`a * b`  |
| `/`	   | Division	         | `a / b`   |
| `%`      | Modulus (Remainder) |	`a % b`  |

Example :
```java
int a = 10;
int b = 5;
System.out.println(a + b); // Outputs: 15
System.out.println(a - b); // Outputs: 5
System.out.println(a * b); // Outputs: 50
System.out.println(a / b); // Outputs: 2
System.out.println(a % b); // Outputs: 0
```

### Unary Operators

|Operator |                  Description	           | Example|
| :------ | :----------------------------------------: | :------------- |
|   `+`	  |          Unary plus (promotes)	           |      `+a`      |
|   `-`	  |          Unary minus (negates)	           |      `-a`      |
|   `++`  |	          Increment (pre/post)	           | `++a` or `a++` |
|   `--`  |	          Decrement (pre/post)	           | `--a` or `a--` |
|   `!`	  | Logical complement (negates boolean value) |	  `!a`      |

Example :
```java
int a = 5;
System.out.println(++a); // Outputs: 6 (pre-increment)
System.out.println(a--); // Outputs: 6 (post-decrement)
System.out.println(a);   // Outputs: 5
boolean flag = true;
System.out.println(!flag); // Outputs: false
```

### Assignment Operator
| Operator |	 Description     |	Example                             |
| :------- | :----------------:  | :----------------------------------- |
|   `=`    | Simple assignment   | `a = b`                              |
|   `+=`   | Add and assign	     | `a += b` (equivalent to `a = a + b`) |
|   `-=`   | Subtract and assign | `a -= b` (equivalent to `a = a - b`) |
|   `*=`   | Multiply and assign | `a *= b` (equivalent to `a = a * b`) |
|   `/=`   | Divide and assign	 | `a /= b` (equivalent to `a = a / b`) |
|   `%=`   | Modulus and assign	 | `a %= b` (equivalent to `a = a % b`) |

Example :
```java
int a = 10;
a += 5;
System.out.println(a); // Outputs: 15
```

### Relational Operator
| Operator | Description	          | Example  |
| :------- | :---------------------:  | :------  |
| `==`     | Equal to	              | `a == b` |
| `!=`     | Not equal to	          | `a != b` |
| `>`	   | Greater than	          | `a > b`  |
| `<`	   | Less than	              | `a < b`  |
| `>=`	   | Greater than or equal to |	`a >= b` |
| `<=`	   | Less than or equal to    | `a <= b` |

Example :
```java
int a = 10;
int b = 5;
System.out.println(a > b); // Outputs: true
System.out.println(a == b); // Outputs: false
```

### Logical Operator
|Operator |	Description	|Example     |
| :-----  | :-------:   | :------    |
| `&&`	  | Logical AND	| `a && b`   |
| `\|\|`  | Logical OR  | `a \|\| b` |
| `!`	  | Logical NOT	| `!a`       |

Example :
```java
boolean a = true;
boolean b = false;
System.out.println(a && b); // Outputs: false
System.out.println(a || b); // Outputs: true
System.out.println(!a);     // Outputs: false
```

## 8. Array
An array in Java is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created, and after creation, its length is fixed

Declaration
```
dataType[] arrayName;
```

initialization
```java
int[] numbers = {1, 2, 3, 4, 5};
```

Accessing array element
```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[2]); // Outputs: 30
```

Array length
```java
String[] cars = {"Toyota", "Honda", "Ford"};
System.out.println(cars.length); // Outputs: 3
```

Multidimentional array<br>
Java allows you to create arrays of arrays, known as multidimensional arrays. The most commonly used multidimensional arrays are 2D arrays.
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println(matrix[1][1]); // Outputs: 5
```
## 9. If Statement
The if statement in Java is used to make decisions in the code. It allows you to execute a block of code only if a specified condition is true.

<b>If Statement</b><br>
Syntax 
```java
if (condition) {
    // Code to be executed if the condition is true
}
```

How It Works<br>
- The condition inside the parentheses is evaluated.
- If the condition is true, the code block inside the {} braces is executed.
- If the condition is false, the code block is skipped.

Example :
```java
int number = 10;

// Check if the number is greater than 5
if (number > 5) {
    System.out.println("The number is greater than 5.");
}
```
<b>Else Statement</b><br>
Syntax
```java
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
```

Example :
```java
int number = 3;

if (number > 5) {
    System.out.println("The number is greater than 5.");
} else {
    System.out.println("The number is not greater than 5.");
}
```

<b>else if statement</b><br>
Syntax
```java
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if all conditions are false
}
```

Example :
```java
int number = 7;

if (number > 10) {
    System.out.println("The number is greater than 10.");
} else if (number > 5) {
    System.out.println("The number is greater than 5 but less than or equal to 10.");
} else {
    System.out.println("The number is 5 or less.");
}
```

## 10. Switch Statement
The switch statement in Java is a control flow statement that allows you to execute one block of code out of many, based on the value of a variable or expression.

Syntax
```java
switch (expression) {
    case value1:
        // Code to be executed if expression == value1
        break;
    case value2:
        // Code to be executed if expression == value2
        break;
    // You can have any number of case statements
    default:
        // Code to be executed if none of the cases match
}
```

Example :
```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
    case 7:
        dayName = "Sunday";
        break;
    default:
        dayName = "Invalid day";
        break;
}

System.out.println(dayName); // output is Wednesday
```

## 11. For Loop
The for loop in Java is a control flow statement that allows you to repeat a block of code a specific number of times.

Syntax
```java
for (initialization; condition; update) {
    // Code to be executed on each iteration
}
```

Example :
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

### Explanation
- `int i = 0` Initializes the loop variable i to 0.
- `i < 5` The loop continues as long as i is less than 5.
- `i++` Increments i by 1 after each iteration.

## 12. While Loop
The while and do-while loops in Java are control flow statements that allow repeated execution of a block of code as long as a given condition is true. They are particularly useful when the number of iterations is not known beforehand.

### While loop
Syntax
```java
while (condition) {
    // Code to be executed
}
```
Example :
```java
int count = 1;

while (count <= 5) {
    System.out.println("Count: " + count);
    count++;
}
```

### Explanation
- `int count = 1` Initializes the loop control variable.
- `count <= 5` The loop continues as long as count is less than or equal to 5.
- `count++` Increments the loop control variable by 1 after each iteration.

### Do While Loop
Syntax
```java
do {
    // Code to be executed
} while (condition);
```

Example :
```java
int count = 1;

do {
    System.out.println("Count: " + count);
    count++;
} while (count <= 5);
```

## 13. Method
Methods in Java are blocks of code designed to perform a specific task. They allow you to write reusable code, improving the modularity and readability of your program. Methods can take input in the form of parameters, perform actions, and optionally return a value.

Syntax
```java
returnType methodName(parameters) {
    // Method body
}
```

Example :
```java
public static void printGreeting() {
    System.out.println("Hello, welcome to Java programming!");
}
```

### Method with Parameters
Methods can take parameters to provide input values. These parameters act as variables inside the method.

Example : 
```java
public static void greetUser(String name) {
    System.out.println("Hello, " + name + "!");
}
```

### Method with Return Value
Methods can return a value to the caller using the return statement. The type of the return value must match the method's declared return type.

Example :
```java
public static int addNumbers(int a, int b) {
    return a + b;
}
```