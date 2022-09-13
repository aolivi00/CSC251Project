public class Policy
{
   private String providerName;
   private String policyFirstName; 
   private String policyLastName;
   private String smoking;
   private int policyNumber = 0;
   private int policyAge = 0; 
   private double policyHeight = 0;
   private double policyWeight = 0; 


   public Policy(int number, String name, String first, String last, int age, String smoke, double height, double weight)
   {
      providerName = name;
      policyFirstName = first;
      policyLastName = last;
      smoking = smoke;
      policyNumber = number;
      policyAge = age;
      policyHeight = height;
      policyWeight = weight;
   }


    //get BMI
    public double getBMI()
    {
        return (policyWeight * 703) /(policyHeight * policyHeight);
    }

    //get policy price
    public double getPolicyPrice()
    {
        double base_price = 600;
        
        if (policyAge > 50){
            base_price +=75;
        }
        if (getSmoker() == true)
        {
            base_price +=100;
        }
        if (getBMI() > 35)
        {
            base_price += (getBMI() - 35) * 20.0;
        }

        return base_price;
    }
    
    
   public int getNumber()
   {
      return policyNumber;
   }
   
   public String getName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return policyFirstName;
   }

   public String getLastName()
   {
      return policyLastName;
   }
   
   public int getAge()
   {
      return policyAge;
   }
   
   public boolean getSmoker()
   {
      if (smoking.equals("smoker"))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   
   public double getHeight()
   {
      return policyHeight;
   }
   
   public double getWeight()
   {
      return policyWeight;
   }
}