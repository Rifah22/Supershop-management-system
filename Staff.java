package supershopmanagementsystem;
public class Staff extends AllEmployessInfo{
double bonus;
    public Staff(String e_name, String e_id, int age, int gender,int service_period) {
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
    public void bonus(String performance)
    {
         if(getService_period()>12 && performance.equals("good"))
        {
           bonus=salary*.5;
           current_balance+=bonus;
        }
        else
        {
            System.out.println("You will get no bonus");
        }
    }
    {
        
    }
   
}