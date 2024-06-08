package supershopmanagementsystem;

import java.util.ArrayList;

public class Manager extends AllEmployessInfo{
double bonus;

private int  job_experience;
    public Manager(String e_name, String e_id, int age, int gender,int service_period,int job_experiences) {
        super(e_name,e_id,age,gender,service_period);
        this.job_experience=job_experiences;
    }

    public int getJob_experience() {
        return job_experience;
    }
    
@Override
    public void bonus()
    {
     
        if(getService_period()>12)
        {
           bonus=salary*.5;
           current_balance+=bonus;
        }
        else
        {
            System.out.println("You will get no bonus");
        }
    }
      void canCalculateOrderQuantity(ArrayList<ProductInfo>plist)
   {
       for(ProductInfo p: plist)
       {
           p.economic_order_quantiy=Math.sqrt((2*p.calculate_demand_per_year()*p.getOrdering_cost())/p.getCarrying_cost());
       }
   }
    void communicateWithPeople(String languageSkill)
    {
        if(languageSkill.equalsIgnoreCase("Outstanding"))
        {
            salary+=salary*.3;
            current_balance+=salary;
        }
    }
}