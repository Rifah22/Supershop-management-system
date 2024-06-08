package supershopmanagementsystem;

import java.util.ArrayList;

public class AllProductSalesmen extends Salesman{
String a_age;

    public AllProductSalesmen(String a_age, String e_name, String e_id, int age, int gender, int service_period) {
        super(e_name, e_id, age, gender, service_period);
        this.a_age = a_age;
    }
   
 public  void canSell(ArrayList<ProductInfo>plist)
   {
       for(ProductInfo p:plist)
       {
           if(!p.getP_name().equalsIgnoreCase("tv") &&!p.getP_name().equalsIgnoreCase("radio")&& !p.getP_name().equalsIgnoreCase("mobile"))
           {
               System.out.println("This salsemen can sell product");
           }
           else
           {
               System.out.println("This salessmen can't sell these product because these products can only sell advertising salesmen");
           }
       }
   }
 public void canCommunicateWithManager()
 {
     System.out.println("Can communicate with manager");
 }
}