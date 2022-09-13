/*
   AlbertoProject class Demo
*/

import java.util.Scanner; //for scanner object

public class Project_Alberto_Olivi
{
   public static void main(String[] args)
   {
      String providerName, policyFirstName, policyLastName, smoking; 
      int policyNumber = 0;
      int policyAge = 0; 
      double policyHeight = 0;
      double policyWeight = 0; 
      
      //scanner object to store input
      Scanner keyboard = new Scanner(System.in);      
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      //
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      //
      System.out.print("Please enter the Policyholder's First Name: ");
      policyFirstName = keyboard.nextLine();
      
      //
      System.out.print("Please enter the Policyholder's Last Name: ");
      policyLastName = keyboard.nextLine();
      
      //
      System.out.print("Please enter the Policyholder's Age: ");
      policyAge = keyboard.nextInt();
      keyboard.nextLine();
      //
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smoking = keyboard.nextLine();
      
      //
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      policyHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      policyWeight = keyboard.nextDouble();
      
      //object to store stock info
      Policy policy1 = new Policy(policyNumber, providerName, policyFirstName, policyLastName, policyAge, smoking, policyHeight, policyWeight);

      
      //print-out
      System.out.println();
      
      System.out.printf("Policy Number: " + policy1.getNumber());
      System.out.printf("\nProvider Name: " + policy1.getName());
      System.out.printf("\nPolicyholder’s First Name: " + policy1.getFirstName());
      System.out.printf("\nPolicyholder’s Last Name: " + policy1.getLastName());
      System.out.printf("\nPolicyholder’s Age: " + policy1.getAge());
      System.out.printf("\nPolicyholder’s Smoking Status: " + smoking);
      System.out.printf("\nPolicyholder’s Height: " + policy1.getHeight() + " inches");
      System.out.printf("\nPolicyholder’s Weight: " + policy1.getWeight() + " pounds");
      System.out.printf("\nPolicyholder’s BMI: %,.2f", policy1.getBMI());
      System.out.printf("\nPolicy Price: $%,.2f", policy1.getPolicyPrice());
                         
   }
}