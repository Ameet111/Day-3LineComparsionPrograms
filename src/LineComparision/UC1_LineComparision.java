package LineComparision;

import java.util.Scanner;

public class UC1_LineComparision {
	  public static void main(String [] args){
		   
			 //Variables
				 int x1,x2,y1,y2;
				 double length;
				 
				 Scanner sc = new Scanner(System.in);
			     System.out.println("Enter the value of x1 : ");
			     x1=sc.nextInt();
			    
			     System.out.println("Enter the value of x2 : ");
			     x2=sc.nextInt();
			
			     System.out.println("Enter the value of y1 : ");
			     y1=sc.nextInt();
			    
			     System.out.println("Enter the value of y2 : ");
			     y2=sc.nextInt();
			     
			     length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			    System.out.println(length);
		} 

}
