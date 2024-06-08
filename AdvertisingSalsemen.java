package supershopmanagementsystem;

import java.util.ArrayList;

public class AdvertisingSalsemen extends Salesman{
String s_id;

    public AdvertisingSalsemen(String s_id, String e_name, String e_id, int age, int gender, int service_period) {
        super(e_name, e_id, age, gender, service_period);
        this.s_id = s_id;
    }
   
   public void canSell(ArrayList<ProductInfo>plist)
    {
        for(ProductInfo p: plist)
        {
            if(p.getP_name().equalsIgnoreCase("Tv")&&p.getP_name().equalsIgnoreCase("radio") &&p.getP_name().equalsIgnoreCase("mobile"))
            {
                System.out.println("This salesmen can sell");
            }
            else
            {
                System.out.println("Except these products this salesmen can't sell's any product ");
            }
        }
    }
   public void canWebBannerAdvertising()
   {
       if(age>20)
       {
           System.out.println("These advertising salsemen can webBannerAdvertised");
       }
   }
  
}