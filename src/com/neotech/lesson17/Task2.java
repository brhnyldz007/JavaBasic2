package com.neotech.lesson17;

public class Task2 {

	
	public static void main(String[] args) {
		
	
		System.out.println("=== Task 1 =====");
		//charAt
		System.out.println();
		String str = "Sunday";
		char day = ' ';
	    int size = str.length();
	    
	    for(int i = size-1;i>=0;i--) {
	    	day = str.charAt(i);
	    	System.out.print(day);
	    }
	    System.out.println();
	    
	    
	    //toCharArray
	   char[] str1 = str.toCharArray();
	   
	   for(int i = str1.length-1;i>=0;i--) {
		   System.out.print(str1[i]);
	   }
	   System.out.println();
	   
	   
	   //StringBuffer
	   StringBuffer str3 = new StringBuffer(str);
	   str3.reverse();
	   System.out.println(str3);
	   
	   System.out.println();
	   System.out.println("===== Task 2 =======");
	   System.out.println();
	   
	   String str2 = "Today is Tuesday and we have a Java Class";
	   String[] str6 = str2.split(" ");
	   String str7 = "";
	   
	   for(int i =0;i<str6.length;i++) {
		   String str8 = str6[i];
		   String str9 = "";
		   for(int j=str8.length()-1;j>=0;j--) {
			   str9 = str9 + str8.charAt(j); 
		   }
		   str7 = str7 +str9 + " ";
	   }
	    System.out.println(str7);
		
	}

}
