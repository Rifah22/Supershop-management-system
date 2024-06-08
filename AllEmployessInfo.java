package supershopmanagementsystem;
public abstract class AllEmployessInfo  {
    String e_name;
    String e_id;
    int age;
    int gender;
    double salary;
    
  
   private int service_period;
    double current_balance;

    public AllEmployessInfo(String e_name, String e_id, int age, int gender,int service_period) {
        this.e_name = e_name;
        this.e_id = e_id;
        this.age = age;
        this.gender = gender;
    }
    void deposit(int amount)
    {
       current_balance+=amount; 
    }
    void withdraw(int amount)
    {
        current_balance-=amount;
    }

    public int getService_period() {
        return service_period;
    }
     void leave(int day)
    {
        if(day<=25){
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

   
    
    
    public abstract void bonus();
    
}