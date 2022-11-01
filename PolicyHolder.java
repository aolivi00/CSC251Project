public class PolicyHolder
{
   private String policyFirstName; 
   private String policyLastName;
   private String smoking;
   private int policyAge = 0; 
   private double policyHeight = 0;
   private double policyWeight = 0;
   
   public PolicyHolder(String first, String last, int age, String smoke, double height, double weight)
   {
      policyFirstName = first;
      policyLastName = last;
      smoking = smoke;
      policyAge = age;
      policyHeight = height;
      policyWeight = weight;
   }

   //Setters


   /**
      The setFirstName 
      @param first First name
   */
   public void setFirstName(String first)
   {
      policyFirstName = first;
   }

   /**
      The setLastName 
      @param last Last name
   */
   public void setLastName(String last)
   {
       policyLastName = last;
   }

   /**
      The setAge 
      @param age Age
   */
   public void setAge(int age)
   {
      policyAge = age;
   }
   
   /**
      The setSmoker 
      @param smoke Smoking status
   */
   public void setSmoker(String smoke)
   {
      smoking = smoke;
   }

   /**
      The setHeight 
      @param height Height
   */
   public void setHeight(double height)
   {
      policyHeight = height;
   }

   /**
      The setWeight 
      @param weight Weight
   */
   public void setWeight(double weight)
   {
      policyWeight = weight;
   }



   //Getters



   /**
      The getBMI 
      @return BMI
   */
    public double getBMI()
    {
        return (policyWeight * 703) /(policyHeight * policyHeight);
    }

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
      The getFirstName 
      @return First Name
   */
   public String getFirstName()
   {
      return policyFirstName;
   }

   /**
      The getLastName 
      @return Last Name
   */
   public String getLastName()
   {
      return policyLastName;
   }

   /**
      The getAge 
      @return Age
   */
   public int getAge()
   {
      return policyAge;
   }
   
   /**
      The getSmoker 
      @return Smoking status
   */
   public String getSmoker()
   {
      return smoking;
   }

   /**
      The getHeight 
      @return Height
   */
   public double getHeight()
   {
      return policyHeight;
   }

   /**
      The getWeight 
      @return Weight
   */
   public double getWeight()
   {
      return policyWeight;
   }

}