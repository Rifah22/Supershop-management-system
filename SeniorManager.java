package supershopmanagementsystem;
public class SeniorManager extends Manager {
String collaboration;
    public SeniorManager() {
        super(null, null, 0, 0, 0,12);
    }
    void canHireEmployee()
    {
        if(getJob_experience()>4 )
        {
            System.out.println("Senior officer can hire these employees");
        }
    }
    void canHireEmployee(String performance)
    {
       if(getJob_experience()>4 && performance.equalsIgnoreCase("good"))
       {
           System.out.println("Senior officer can also hire these types of employees");
       }
    }
    
 {
     
 }
}