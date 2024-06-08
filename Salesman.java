package supershopmanagementsystem;

import java.util.ArrayList;

public  abstract class Salesman extends AllEmployessInfo{
double bonus;
    public Salesman(String e_name, String e_id, int age, int gender,int service_period) {
        super(e_name,e_id,age,gender,service_period);
    }
@Override
    public void bonus()
    {
     
        if(getService_period()>12)
        {
           bonus=salary*.5;
           current_balance+=bonus;
        }
        else
        {
            System.out.println("You will get no bonus");
        }
    }
    public abstract void canSell(ArrayList<ProductInfo>alist);
    void canCalculateTotalSells_per_year(ArrayList<ProductInfo>Plist,ArrayList<ForeignAdmin>flist,ArrayList<JuniorManager>jlist,int quantity)
    {
       double total_sell_cost=0;
        for(ProductInfo p:Plist)
        {
            p.total_product_sell_per_year=(p.num_of_product*365);
            total_sell_cost=((p.total_product_sell_per_year)*p.getPrice());
        }
        for(ForeignAdmin f:flist)
        {
            f.canShowTotalsaleCalculationPerYear(total_sell_cost);
        }
        for(JuniorManager J:jlist)
        {
           J.canshowSells_per_year(total_sell_cost);
        }
    }
    void calculateTotalBill(ArrayList<ProductInfo>plist)
    
    {
        double total_bill=0;
        for(ProductInfo P:plist)
        {
       total_bill=P.num_of_product*P.getPrice();
        
        }
       
        
    }
    
}