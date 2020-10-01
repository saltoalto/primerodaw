package first;

import java.util.Scanner;

public class Average {
	 public static void main(String[] args) {
		    double n1;//, n2, n3;
		    double n2;
		    double n3;
		    Scanner input = new Scanner(System.in);
		    // Assign a radius
		    
		    System.out.println("Input number 1: ");
		   n1 = input.nextDouble(); 
		   
		   System.out.println("Input number 2: ");
		   n2 = input.nextDouble(); 
		   
		   System.out.println("Input number 3: ");
		   n3 = input.nextDouble(); 
		    
		    // Compute area
		  double av = (n1+n2+n3)/3;
		    
		    // Display results
		    System.out.println("The average of  " + n1+ ", "+n2+", "+n3+ " is "+av);
		  
		  }
}
