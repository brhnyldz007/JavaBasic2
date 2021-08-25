package com.neotech.lesson12;

public class Tak1 {
	public static void main(String[] args) {
		
		String[][] prefixies = new String[][] 
				{
			{"Mr","Mrs","Ms","Miss"},
			{"Smith","Jordan","Jackson","Obama"}
		};
		
	    for(int i = 0; i < prefixies.length;i++) 
	    {
	    	for(int j =0;j<prefixies[i].length;j++) 
	    	{
	    		if(prefixies[i][j].equals("Smith")) 
	    		{
	    			System.out.print(prefixies[0][1] + " " + prefixies[i][j]+ ", ");
	    		}
	    		else if(prefixies[i][j].equals("Obama")) 
	    		{
	    			System.out.print(prefixies[0][0] + " " + prefixies[i][j]);
	    		}
	    		else if(prefixies[i][j].equals("Jackson")) 
	    		{
	    			System.out.print(prefixies[0][2] + " " + prefixies[i][j] + ", ");
	    		}
	    		else if(prefixies[i][j].equals("Jordan")) 
	    		{
	    			System.out.print(prefixies[0][3] + " " + prefixies[i][j] + ", ");
	    		}
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("============== Task 1 ===============");
	    System.out.println();
	    
	    String[][] names = new String[][] 
	    {
	    	{"Burhan","Ivonne","Mila","Arzu"},
	    	{"A", "B" ,"C", "D"}
	    };
	    for(int i = 0; i < names.length;i++) 
	    {
	    	for(int j =0;j<names[i].length;j++) 
	    	{
	    		if(names[i][j].equals("A")) 
	    		{
	    			System.out.print(names[0][0] + " " + names[i][j]+ ", ");
	    		}
	    		else if(names[i][j].equals("B")) 
	    		{
	    			System.out.print(names[0][1] + " " + names[i][j] + ", ");
	    		}
	    		else if(names[i][j].equals("C")) 
	    		{
	    			System.out.print(names[0][2] + " " + names[i][j] + ", ");
	    		}
	    		else if(names[i][j].equals("D")) 
	    		{
	    			System.out.print(names[0][3] + " " + names[i][j]);
	    		}
	    	}
	    	System.out.println();
	    }
	    
	    
	}

}
