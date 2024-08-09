package com.code.java;

public class ReverseString {

	public static void main(String[] args) {

//Reverse String code
		//1. Using a StringBuilder or StringBuffer:
		
		String one = "Capgemini India";
		StringBuffer ulati = new StringBuffer(one).reverse();
		String ulati1 = new StringBuffer(one).reverse().toString();
		String ulati2 = new StringBuilder(one).reverse().toString();
		
		System.out.println("Reversed  "+ulati);
		System.out.println("Reversed1 "+ulati1);
		System.out.println("Reversed2 "+ulati2);
		
		
		//2. Using a loop
		
		String original = "naman";
		String reversed = reverseString(original);
		System.out.println("Reversed3 "+reversed);
		
		//3. Using recursion:
		
		
//Palindrome code
		//1. 
		if(original.equals(reversed)) {
			System.out.println("String is palindrome");
		}else
		System.out.println("String is not palindrome");
	}

	public static String reverseString(String a) {
		char[] charArray = a.toCharArray(); //Convert string to character array
        String result = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        return result;
	}
	
	
	
}
