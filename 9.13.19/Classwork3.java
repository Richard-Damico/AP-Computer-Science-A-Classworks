import java.util.Scanner;
public class Classwork3

{
   public static void main(String[] args)
   {
       /** Objective #1: Write an application to accept a side length for a prism,
        * and output the volume of a cube.
        *
        * Precondition: The user enters a number for the side length, and not a special character or letter
        * Postcondition: The program outputs a volume if the user enters a positive number. If the user
        *       does not enter a positive number, the program responds with "Invalid Input"
        */
    
       Scanner
       scan = new Scanner(System.in);
       
       System.out.println("Please enter the side length of your cube:");
       double s = scan.nextDouble();
       
       if (s > 0)
        { 
            double volume = Math.pow(s,3);
            System.out.println("Volume: " + volume);
        }
        
        
        else 
            System.out.println("Invalid Entry");
            
            
            
            
    

            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       /** Objective #2: Write an application to solve a quadratic equation, which accepts a, b and c
        * from a user, and outputs one of the solutions to the equation.
        */      
    
       System.out.println("Enter a");
       double a = scan.nextDouble();
       
       System.out.println("Enter b");
       double b = scan.nextDouble();
       
       System.out.println("Enter c");
       double c = scan.nextDouble();
       
       double disc = b*b - 4*a*c;
       if (disc < 0)
               System.out.println("no real solutions");
       else if  (disc == 0)
            System.out.println("One solution");
       else 
            System.out.println("Two Solutions");
       
       
       
       
        	
       
       
       
       
       
       
       
       
       
       
    
  
    
    }
}
