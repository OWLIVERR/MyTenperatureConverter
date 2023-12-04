import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius : ");
        float c = sc.nextFloat();
        
        
        float f = c * (9.0f/5.0f) + 32;
        
        System.out.println("The temperature is "+f+" degree Fahrenheit.");
      

         Scanner input = new Scanner(System.in); 
         System.out.print("Enter a temperature in Fahrenheit: "); 
      	 double fahrenheit = input.nextDouble(); 
         input.close(); 
         double celsius = (fahrenheit - 32) * 5 / 9; 
         System.out.println(fahrenheit + " F is equivalent to " + celsius + " C");  

    }
    
} 
