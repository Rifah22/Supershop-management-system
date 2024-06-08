package supershopmanagementsystem;

import java.util.ArrayList;

public class Customer {
    String name;
    String id;
    int age;
    String gender;
    String contact_no;
    double total_bill=0;

    public Customer(String name, String id, int age, String gender,String contact_no) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.contact_no=contact_no;
    }
   void canShowAllProductInfo(ArrayList<ProductInfo>plist)
   {
      for(ProductInfo p: plist)
      {
          System.out.println(p.p_id+p.getP_name());
      }
   }
   void canDemonstrateTheirCreditCard(String multiple_credit)
   {
       if(multiple_credit.equalsIgnoreCase("no"))
       {
           System.out.println("accepted");
       }
       else
       {
           System.out.println("no");
       }
   }
   
   
   
  
   
   
    
}