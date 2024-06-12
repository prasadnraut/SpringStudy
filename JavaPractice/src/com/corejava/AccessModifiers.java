package com.corejava;

class AccessModifiers extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Access modifiers are used to define scope for class, variable, methods or data members
		//It provides security to user depending on which modifier you use
		
		//1) Default 
		//here no keyword required. Also called as Package-Private
		//It is specified for class, method, constructor or data member
		//Scope is within the same package
		
		//2) Private
		//private keyword is specified
		//Scope/accessible only within the same class
		//Top-level classes(outer class) or interfaces can't be private.
		//Nested classes can be private(class inside class)
		
		//3)Protected
		//protected keyword is specified
		//Scope/accessible within same package or in different package through subclass(Inheritance)
		
		//3)Public
		//Public keyword is specified
		//Scope/accessible everywhere
//====================================================================
		// Java program to illustrate error while
		// Using class from different package with Private Modifier

			A obj = new A();
	        // Trying to access private method
	        // of another class-not possible
	        obj.display();
	     
	        //Accessing method through inheritance
	     B objb = new B();
	     objb.display();
	     
	}
	private class Z{
   	 
    }
}
		//Class A
		class A {
		     protected void display() //private gives error
		    {
		        System.out.println("GeeksforGeeks A");
		    }
		}
		
		//Class B
				class B {
				     protected void display() //private gives error
				    {
				        System.out.println("GeeksforGeeks B");
				    }
				}	
				
class First{
	First first = new First();
	
	void firstMethod(){
		System.out.println("firstMethod");
	}
}
class Second{
	
	void secondMethod(){
		System.out.println("secondMethod");
	}
}