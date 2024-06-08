package supershopmanagementsystem;

import java.util.ArrayList;

public class SuperShopManagementSystem {
    public static void main(String[] args) {
       ProductInfo p=new ProductInfo("oil","o-1",200,7,1200,50,10);
       ArrayList<ProductInfo>plist=new ArrayList<>();
       plist.add(p);
       RegisteredCustomer r=new RegisteredCustomer("prince","12",18,"male","019","prince@gmail.com");
       r.buy(plist, 2);
       NonRegisteredCustomer n=new NonRegisteredCustomer("Sayeef","34",12,"female","017");
       n.buy(plist, 4);
       AdvertisingSalsemen a=new AdvertisingSalsemen("s_i", "maheen","43", 44, 3, 12);
       ArrayList<AdvertisingSalsemen>alist=new ArrayList<>();
       alist.add(a);
       JuniorManager j=new JuniorManager();
       ArrayList<JuniorManager>jlist=new ArrayList<>();
       LocalAdmin l=new LocalAdmin();
       l.canShowAdvertisinSalsemen_junior_manager_info(alist, jlist);
       
       
    }
    
}