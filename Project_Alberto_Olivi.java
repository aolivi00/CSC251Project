/*
   AlbertoProject class Demo
*/

import java.util.*; 
import java.io.*;

public class Project_Alberto_Olivi
{
   public static void main(String[] args)
   {
      try
      {
         File file = new File("PolicyInformation.txt");
         
         Scanner inputFile = new Scanner(file);
         
         String providerName = "", policyFirstName = "", policyLastName = "", smoking = "", lineData = "";
         int policyNumber = 0, policyAge = 0, smokers = 0, nonSmokers = 0;
         double policyHeight = 0.0, policyWeight = 0.0;
         
         ArrayList<Policy> policy = new ArrayList<Policy>();
         
         while(inputFile.hasNext())       
         {
            lineData = inputFile.nextLine();
            policyNumber = Integer.parseInt(lineData);
            
            providerName = inputFile.nextLine();
            
            policyFirstName = inputFile.nextLine();
            
            policyLastName = inputFile.nextLine();
            
            lineData = inputFile.nextLine();
            policyAge = Integer.parseInt(lineData);
            
            smoking = inputFile.nextLine();
            
            lineData = inputFile.nextLine();
            policyHeight = Double.parseDouble(lineData);
            
            lineData = inputFile.nextLine();
            policyWeight = Double.parseDouble(lineData);
            
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
            }
            
            Policy newpolicy = new Policy(policyNumber, providerName, policyFirstName, policyLastName, policyAge, smoking, policyHeight, policyWeight);
            
            policy.add(newpolicy);
         }
         
         inputFile.close();
         
         for (int i = 0; i < policy.size(); i++)
         {
            System.out.printf("\nPolicy Number: " + policy.get(i).getNumber());
            System.out.printf("\nProvider Name: " + policy.get(i).getName());
            System.out.printf("\nPolicyholder's First Name: " + policy.get(i).getFirstName());
            System.out.printf("\nPolicyholder's Last Name: " + policy.get(i).getLastName());
            System.out.printf("\nPolicyholder's Age: " + policy.get(i).getAge());
            System.out.printf("\nPolicyholder's Smoking Status (smoker/non-smoker): " + policy.get(i).getSmoker());
            System.out.printf("\nPolicyholder's Height: " + policy.get(i).getHeight() + " inches");
            System.out.printf("\nPolicyholder's Weight: " + policy.get(i).getWeight() + " pounds");
            System.out.printf("\nPolicyholder's BMI: %,.2f", policy.get(i).getBMI());
            System.out.printf("\nPolicy Price: $%,.2f", policy.get(i).getPolicyPrice());
            System.out.println();
            
            if ((policy.get(i).getSmoker()).equals("smoker"))
            {
               smokers++;
            }
            else
            {
               nonSmokers++;
            }
         }
         
         System.out.println("\nThe number of policies with a smoker is: " + smokers);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
      }
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }                   
   }
}