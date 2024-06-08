package supershopmanagementsystem;

import java.util.ArrayList;

public class NonRegisteredCustomer extends Customer implements Buy{
     String membership;
    public NonRegisteredCustomer(String name, String id, int age, String gender,String contact_no) {
        super(name,id,age,gender,contact_no);
    }
    @Override
    public void buy(ArrayList<ProductInfo>plist,int quantity)
    {
        for(ProductInfo p:plist)
        {
            double bill;
            if(p.getStock()>=quantity)
            {
               
                System.out.println("You can buy with discount");
                bill=(quantity*p.getPrice());
                total_bill+=bill;
                
                
            }
            else
            {
                System.out.println("You can't buy any product");
            }
        }
    }
    public void cannot_keep_due()
    {
        if(membership.equals("no") &&membership.equals("yes"))
        {
            System.out.println("They can't keep due");
        }
    }
    
  
  
    
}