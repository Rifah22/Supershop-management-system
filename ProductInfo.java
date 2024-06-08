package supershopmanagementsystem;
public  class ProductInfo {
    private String p_name;
    String p_id;
    private  double price;
    private  int stock;
    int num_of_product;
    double economic_order_quantiy;
    private double ordering_cost;
    private double carrying_cost;
    double discount;
    double total_product_sell_per_year;
    double price_to_earning_ratio;
    double stock_price;
    double earning_per_share;

    public ProductInfo(String p_name, String p_id, double price, int stock,int num_of_prodcut,double ordering_cost,double carrying_cost) {
        this.p_name = p_name;
        this.p_id = p_id;
        this.price = price;
        this.stock = stock;
        this.num_of_product=num_of_product;
        this.ordering_cost=ordering_cost;
        this.carrying_cost=carrying_cost;
    }
    void storeInfoforStock(double stock_price,double earning_per_share)
    {
       this.stock_price=stock_price;
       this.earning_per_share=earning_per_share;
    }
    int calculate_demand_per_year()
    {
        return 365*num_of_product;
    }
    
    

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public double getOrdering_cost() {
        return ordering_cost;
    }

    public double getCarrying_cost() {
        return carrying_cost;
    }

    public String getP_name() {
        return p_name;
    }
    

   
    

   
    
    
  
    
}