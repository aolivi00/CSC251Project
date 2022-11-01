public class Policy
{
   //Declaring the Fields
   private String providerName;
   private int policyNumber = 0;



   /**
      Constructor that accepts argument for each field
      @param number Policy number
      @param name Provider name
   */
   
   public Policy(int number, String name)
   {
      providerName = name;
      policyNumber = number;
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



   //Getters


   /**
      The getPolicyPrice 
      @return Policy price
   */
    public double getPolicyPrice()
    {
        double base_price = 600;
        
        if (policyAge > 50)
        {
            base_price +=75;
        }
        
        if (smoking.equals("smoker"))
        {
            base_price +=100;
        }
        
        if (getBMI() > 35)
        {
            base_price += (getBMI() - 35) * 20.0;
        }

        return base_price;
    }

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
}