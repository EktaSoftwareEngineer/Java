package basicJava;
	/*Parameterized Constructor: A constructor that has parameters is known as parameterized constructor. 
	 * If we want to initialize fields of the class with your own values, then use a parameterized
	  constructor.filter_none edit play_arrow brightness_4
	// Java Program to illustrate calling of 
	// parameterized constructor. */
	import java.io.*; 
	  
	 class Geek {
	    // data members of the class. 
	    String name; 
	    int id; 
	    // constructor would initialize data members  with the values of passed arguments while 
	    // object of that class created. 
	    Geek(String name, int id) 
	    { 
	        this.name = name; 
	        this.id = id; 
	    } 
	 } 
	
	class ParameterisedConstructor { 
	    public static void main (String[] args){ 
	        // this would invoke the parameterized constructor. 
	    	Geek geek1 = new Geek("adam", 1); 
	        System.out.println("GeekName :" + geek1.name + 
	                           " and GeekId :" + geek1.id); 
	    } 
	}
	 
