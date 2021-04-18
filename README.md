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
