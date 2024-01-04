package com.jspider;

public class CommandLineArgument {

	public static void main(String[] args) {
		if(args.length!=3)
				System.out.println("Invalid");
	    else{
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[2]);
		if(args[1].equals("+")) 
			System.out.println(m+n);
		if(args[1].equals("-"))
			System.out.println(n-m);
		if(args[1].equals("X"))
			System.out.println(m*n);
		if(args[1].equals("/"))
			System.out.println(n/m);
		if(args[1].equals("%"))
            System.out.println(n%m);
		}
		
		
	}

}
