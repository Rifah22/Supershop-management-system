package supershopmanagementsystem;

import java.util.ArrayList;

public class Admin extends AllEmployessInfo{
double bonus;
String language_skill;
    public Admin(String e_name, String e_id, int age, int gender,int service_period) {
        super(e_name,e_id,age,gender,service_period);
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
   public void canShowAdvertisinSalsemen_junior_manager_info(ArrayList<AdvertisingSalsemen>alist,ArrayList<JuniorManager>jlist)
   {
       for(AdvertisingSalsemen a:alist)
       {
           System.out.println(a.e_id);
       }
       for(JuniorManager j:jlist)
       {
           System.out.println(j);
       }
       
   }
@Override
    void leave(int day)
    {
        if(day<=20){
            System.out.println("Your leave accepted and you will not be fined");
        }
        else{
            System.out.println("you will be fined each days income for absence more than 15 days");
            double daily_income;
            daily_income=(salary/30);
            int extra_days=day-25;
            double fine=extra_days*daily_income;
            current_balance -= fine;
        }
        
    } 
 
}