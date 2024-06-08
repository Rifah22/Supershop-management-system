package supershopmanagementsystem;

import java.util.ArrayList;

public class JuniorManager extends Manager {
String desciveness;
    public JuniorManager() {
        super(null, null, 0, 0, 0,3);
    }
    
    @Override
    void communicateWithPeople(String languageSkill)
    {
        if(languageSkill.equalsIgnoreCase("not good"))
        {
            System.out.println("They can't not extra bonus with their salary");
        }
    }
    void canshowSells_per_year(double total_sell_cost)
    {
          
        System.out.println("The annual sale total is "+total_sell_cost);
        
    }

    
    
}