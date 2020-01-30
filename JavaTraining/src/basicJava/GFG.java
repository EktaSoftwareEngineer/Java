package basicJava;


/*Constructors in Java
Constructors are used to initialize the object’s state. Like methods, a constructor also contains collection of statements(i.e. instructions) that are executed at time of Object creation.

Need of Constructor
Think of a Box. If we talk about a box class then it will have some class variables (say length, breadth, and height). But when it comes to creating its object(i.e Box will now exist in computer’s memory), then can a box be there with no value defined for its dimensions. The answer is no.
So constructors are used to assign values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).

When is a Constructor called ?
Each time an object is created using new() keyword at least one constructor (it could be default constructor) is invoked to assign initial values to the data members of the same class.



 

A constructor is invoked at the time of object or instance creation. For Example:

class Geek
{   
  .......

  // A Constructor
  new Geek() {}

  .......
}

// We can create an object of the above class
// using the below statement. This statement
// calls above constructor.
Geek obj = new Geek(); 
Rules for writing Constructor:

Constructor(s) of a class must has same name as the class name in which it resides.
A constructor in Java can not be abstract, final, static and Synchronized.
Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.

Types of constructor

There are two type of constructor in Java:

No-argument constructor: A constructor that has no parameter is known as default constructor. If we don’t define a constructor in a class, then compiler creates default constructor(with no arguments) for the class. And if we write a constructor with arguments or no-arguments then the compiler does not create a default constructor.
Default constructor provides the default values to the object like 0, null, etc. depending on the type.

filter_none
edit
play_arrow

brightness_4
// Java Program to illustrate calling a 
// no-argument constructor 
 * 
 * */
 
import java.io.*; 
  
class Geek1 
{ 
    int num; 
    String name; 
  
    // this would be invoked while an object 
    // of that class is created. 
    Geek1() 
    { 
        System.out.println("Constructor called"); 
    } 
} 
  
class GFG 
{ 
    public static void main (String[] args) 
    { 
        // this would invoke default constructor. 
        Geek1 geek1 = new Geek1(); 
  
        // Default constructor provides the default 
        // values to the object like 0, null 
        System.out.println(geek1.name); 
        System.out.println(geek1.num); 
    } 
}