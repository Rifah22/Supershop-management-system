package supershopmanagementsystem;

import java.util.ArrayList;

public class RegisteredCustomer extends Customer implements Buy {
private String email;
String membership;
    public RegisteredCustomer(String name, String id, int age, String gender,String contact_no,String email) {
        super(name,id,age,gender,contact_no);
        this.email=email;
    }
@Override
  public void buy(ArrayList<ProductInfo>plist,int quantity)
    {
         System.out.println("You can buy with discount");
        for(ProductInfo p:plist)
        {
            double bill;
            if(p.getStock()>=quantity)
            {
               
               
                bill=(quantity*.1*p.getPrice());
                total_bill+=bill;
                System.out.println("bill is"+total_bill);
                
                
            }
            else
            {
                System.out.println("You can't buy any product");
            }
        }
        
    
}
  public void can_keep_due()
  {
      if(membership.equals("yes"))
      {
          System.out.println("These registerd customer can keep due in shop");
      }
          
  }
 
}