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
            
            PolicyHolder myPolicyHolder = new PolicyHolder(policyFirstName, policyLastName, policyAge, smoking, policyHeight, policyWeight); 
            
            Policy newpolicy = new Policy(policyNumber, providerName, myPolicyHolder);
            
            policy.add(newpolicy);
         }
         
         inputFile.close();
         
         for (int i = 0; i < policy.size(); i++)
         {
            System.out.println(policy.get(i));
            System.out.println();
           
            if ((policy.get(i).getSmoking()).equals("smoker"))
            {
               smokers++;
            }
            else
            {
               nonSmokers++;
            }
         }
         System.out.println("There were " + policy.get(1).getCount() + " Policy objects created.");
         System.out.println("The number of policies with a smoker is: " + smokers);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
      }
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }                   
   }
}