package com.corejava;

import java.time.DayOfWeek;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Continue Statement in Java
		
		//Modulo Operator (%): The modulo operator returns the remainder of the division of one number by another. 
		//The Java continue statement is used to skip the current iteration of a loop and move on to the next one. 
		//This means that any code following the continue statement within the loop will not be executed.
		
		for (int i = 0; i < 10; i++) {
		    if (i % 2 == 1) {
		        continue; //will skip 1,3,5,7,9
		    }
		    //System.out.println(i);
		}
		
		//2. Using Java Continue with Nested Loop
		//Java continue statement can also be used with nested loops. When a continue statement is encountered within a nested 
		//loop, it will only skip the current iteration of the innermost loop. 
		
    	//following code uses nested loops and the continue statement to print a multiplication table:
		for (int i = 1; i <= 10; i++) {
		    for (int j = 1; j <= 10; j++) {
		        if (j == 5) {
		            continue;
		        }
		        System.out.print(i * j + " ");
		    }
		    System.out.println();//Going for next line after j=10
		}
		
		//3. Using Labelled Continue Statement
		//allow us to skip an iteration of a specific loop, even if it’s nested within other loops. To use a labelled continue 
		//statement, we first need to assign a label to the loop, and then use that label in the continue statement.
		outer: for (int i = 1; i <= 10; i++) {
		    for (int j = 1; j <= 10; j++) {
		        if (j == 5) {
		            continue outer;
		        }
		        System.out.print(i * j + " ");
		    }
		    System.out.println();
		}
		
	}

}
