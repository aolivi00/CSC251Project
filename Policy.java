public class Policy
{
   //Declaring the Fields
   private String providerName;
   private int policyNumber = 0;
   private PolicyHolder policyholder;
   private static int count = 0;



   /**
      Constructor that accepts argument for each field
      @param number Policy number
      @param name Provider name
   */
   
   public Policy(int number, String name, PolicyHolder holder)
   {
      providerName = name;
      policyNumber = number;
      policyholder = new PolicyHolder(holder);
      count++;
   }

   //Setters

   /**
      The setNumber 
      @param number Policy number
   */ 
   public void setNumber(int number)
   {
      policyNumber = number;
   }

   /**
      The setName 
      @param name Provider name
   */ 
   public void setName(String name)
   {
      providerName = name;
   }
   
   public void setPolicyHolder(PolicyHolder holder)
   {
      policyholder = new PolicyHolder(holder);
   }



   //Getters


   /**
      The getNumber 
      @return Policy Number
   */
   public int getNumber()
   {
      return policyNumber;
   }

   /**
      The getName 
      @return Name of the provider
   */ 
   public String getName()
   {
      return providerName;
   }
   
   public String getSmoking()
   {
      return policyholder.getSmoker();
   }
   
   public int getCount()
   {
      return count;
   }
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyholder); 
   }
   
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber + "\nProvider Name: " + providerName + policyholder.toString());
   }
}