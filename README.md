# Project-Based-Learning

# Assignment 1:
1) Implement a menu-driven Java program (like fib or factorial) t o implement these input methods in java (command line args, Scanner, BufferedReader, DataInputStream, Console )
2) Implement a simple menu driven calculator in java to implement add, sub, mul, div, sqrt, power, mean, variance. Implement a separate Calculator class to include all related function inside that class. (for mean calculation : program reads numbers from the keyboard, summing them in the process until the user enters the string “end”. It then stops input & displays the avg. of numbers) Find the GCD of two integers. By definition, GCD(a, b) is the greatest factor that divides both a and b. Assume that a and b are positive integers, and a≥b, the Euclid algorithm is based on these two properties: GCD(a, 0) = a GCD(a, b) = GCD(b, a mod b), where (a mod b) denotes the remainder of a divides by b.


# Assignment 2:
Implement any four programs to understand basic concepts of operators, arrays in Java
1. W.a.p that declares two arrays named ‘even’ and ‘odd’. Accept numbers from the user
and move them to respective arrays depending on whether they are even or odd.
Write a Java program to convert an array to ArrayList.
2. Write a Java program to get the difference between the largest and smallest values in an
array of integers. The length of the array must be 1 and above.
3. Given an array of integers. Find a peak element in it. An array element is peak if it is
NOT smaller than its neighbors. For corner elements, we need to consider only one
neighbor. For example, for input array {5, 10, 20, 15}, 20 is the only peak element. For
input array {10, 20, 15, 2, 23, 90, 67}, there are two peak elements: 20 and 90. Note that
we need to return any one peak element


# Assignment 3:
1. Write a menu-driven Java Program to study the concepts of classes, array of objects, instance
members, constructors in java.
Assignment description: Create a Student class describing attributes of a student like prn, name, DoB,
marks etc. DoB is created as a separate class and each Student will have a DoB.
Write a suitable constructors ( parameterized , default)
Create an array /ArrayList of objects of Student class and perform operations like:
Add students, Display, Search (by prn, by name, by position), Update/Edit and Delete.
For each student, compute the total marks ranging from 0 to 100. Then compute and print the number of
students who have obtained marks in the range:
81 – 100 ‘A’
61 – 80 ‘B+’
41- 60 ‘B’
0 – 40 ‘C’
<40 ‘F’
Display a sorted list of students, sorted based on total marks. (Hint: Use the Comparator & Iterator class
in java). The entire program should be written in Object Oriented Programming style.

2. Write a Java Program to implement Vector class and its methods for the following :
The Employee information you must track is as follows:
▪ ID
▪ Name
▪ Sex
▪ Job Title
▪ Organization they work for
Implement following using vector
i) Add employee
ii) Delete Employee
iii) Compare two employees (by salary)
iv) Search employee (By Id, Name)
v) Sort (by Names, Use Comparator)
Also have a method to keep a count of number of instances created for the Employee class.
(Use: static)

# Assignment 4:
Write a menu-driven Java Program for the following:
There are 52 cards in a deck, each of which belongs to one of four suits and one of 13 ranks. Represent a deck of cards as an array of Objects (*you may use the ArrayList class)
•	Use integers to encode the ranks and suits (1 pt)
•	Have suitable default & parameterized constructors (2 pt)
•	all data members to have private access (1 pt)
•	The class ‘Card’ to have following methods: (4 pt)
•	createDeck() , printCard(), printDeck (), sameCard(), compareCard(), sortCard() , findCard() which searches through an array of Cards to see whether it contains a certain card 
•	dealCards() function :  to print 5 random cards from the existing deck . (1 pt)
•	Illustrate the use of Garbage Collection in java by including suitable code (1 pt)

# Assignment 5:
Part 1:
Implement the generic Shapes class as an abstract class so that we can extend concrete classes like circle, triangle, rectangle class from it. The details of shape and other classes is given in diagram. Write a concrete subclass Rectangle, Circle and Square. In another class, write a main method to define a Rectangle and a Triangle 

Part 2:
Program to implement multilevel inheritance. Create class Account with cust_name and account_number as instance variables and write getdata and putData()  methods which will take customer name and account number and will display the same using putData method. Create another class savingAcc that extends class Account with min_balance and sav_bal as instance variables and getdata() and putData() method to take instance variables as well as call base class methods in respective getData and putData methods. Create another class accdetail with deposits and withdrawal as instance variables, getdata() and putData() method to take instance variables as well as call base class methods in respective getData and putData methods.Create separate class accountInfo which will create object of accdetail and its respective methods to get and display information.

# Assignment 6:
Part 1:
Program to implement the following Multiple Inheritance. An implementation of Exam class that uses Student class using interface to calculate percentage of marks in 2 subjects.

Part 2:
An implementation of IntStack (integer stack) that uses fixed storage as well as "growable" using interface. Create a user defined package “pkg_Stack” where the interface is stored. The other two complete classes will need to import the package ‘pkg_Stack’ and then use it.

# Assignment 7:
Part 1:
Assignment description: A rational number is a number in the form of  where   and  are integers and . Rational numbers can be added, subtracted, multiplied, and divided. Write a Java application that will be able to add, subtract, multiply, divide, compare, convert to floating point, and find absolute value for rational numbers. 
Your program should be written in Object Oriented Programming style. The program should accept two rational numbers from the user using any method and output results of operations to console. Your program should solve operations efficiently and be able to recover from bad inputs. Use exception handling mechanism so as not to crash the program.

Part 2:
Write a Java Program to find the factorial of ‘n’ integers (as command line arguments CLA). Write your own exception “MyExcep” to validate integer values to be in certain range.

Sample call: java ExceptionDemo 8 – 6 14 abcd 5

1.	Static main method invokes another method “factorial()”
2.	CLA which are strings but interpreted as integer values.
3.	The user-defined exception class MyExcep should have proper constructors / overridden toString() method to display exception message along with the wrong input number that had generated the exception.
4.	NumberFormatException and Your Exception class MyExcep( n<0 and n>12 )


# Assignment 8:
Create a Java Program for MySQL database connectivity. Perform following operations 
1.	Create a table Employee with fields empno (int),ename(string),department(string) ,job(string) and salary(float).
2.	Add five employees to the Employee table at the time of table creation
EMPNO:8369, Ename:Smith, job:Manager, department:IT,Sal:80000.00
EMPNO:8654, Ename:Momin, job:Salesman, department:Sales ,Sal:12050.00
EMPNO:8839, Ename: Amir, department: Sales, job: President ,Sal:150000.00
EMPNO:8934, Ename:Mita, department:HR ,job:Clerk, Sal:23000.00
EMPNO:8900, Ename:Jatin, department:HR job:Clerk, Sal:25050.00
3.	Add new employee using Java program.
4.	Display all employees.
5.	Search a particular employee by using Name.
6.	Update employee salary using empno.
7.	Delete employee using empno.
8.	Exit

Empno will be PRIMARY KEY
