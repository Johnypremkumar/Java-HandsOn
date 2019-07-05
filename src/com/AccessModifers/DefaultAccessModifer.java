package com.AccessModifers;
public class DefaultAccessModifer {
	   public static void main(String args[]){
		   Default_Modifier_Addition obj = new Default_Modifier_Addition();
	        /* It will throw error because we are trying to access
	         * the default method in another package
	         */
		obj.addTwoNumbers(10, 21);
		System.out.println(obj.addTwoNumbers(10, 21));
	   }
	}
