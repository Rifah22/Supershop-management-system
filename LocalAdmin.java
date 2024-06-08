package supershopmanagementsystem;

import java.util.ArrayList;

public class LocalAdmin extends Admin {
String l_language;
    public LocalAdmin() {
        super(null, null, 0, 0, 0);
    }
    void bookKeeping()
    {
        System.out.println("can be calculated financial transaction of this super shop");
    }
    void typingSkill(int speed)
    {
        if(speed>=50)
        {
            System.out.println("He can be selected for extra bonuss");
        }
    }
    
    
}