
package activity1;

import java.util.Scanner;


public class ACTIVITY1 {

   
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
        System.out.println("Enter your last name: ");
        String Lastname = scan.nextLine();
        
        System.out.println("Enter your first name: ");
        String Firstname = scan.nextLine();
        
        System.out.println("Enter your middle initial: ");
        String Middleinitial = scan.nextLine();
        
        System.out.println("Enter your age: ");
        String Age = scan.nextLine();
        
        System.out.println("Enter your Gender: ");
        String Gender = scan.nextLine();
        
        System.out.println("Enter your birthdate: ");
        String Birthdate = scan.nextLine();
        
        
        System.out.println("Last Name:" + Lastname);
        System.out.println("First Name:" + Firstname);
        System.out.println("Middle Initial:" + Middleinitial);
        System.out.println("Age:" + Age);
        System.out.println("Gender:" + Gender);
        System.out.println("Birthdate:" + Birthdate);
        
        
        
       
    }
    
}
