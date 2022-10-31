
package FactorialDemo;

import java.util.Scanner;


public class FactorialDemo {
    public static void main(String[]args)
    {
    
    //variable diclaration area
        
      int num,i,fact=1;
      
      //take user input
      
      Scanner input=new Scanner(System.in);
      System.out.print("Enter Any Positive Number :");
      
      //variable num holds user given input
      
      num=input.nextInt();
      
      for(i=num;i>=1;i--)
      {
      fact=fact*i;
      
      }
      
      
     System.out.println("Number "+num+" factorial is :"+fact);
      
      
      
    
    
    
    
    
    }
    
}
