package supershopmanagementsystem;



public class ForeignAdmin extends Admin {
String f_region;
    public ForeignAdmin() {
        super(null, null, 0, 0, 0);
    }
    void communicationSkill()
    {
              if(language_skill.equals("good"))
              {
                  System.out.println("can be selected for bonus");
              }
    }
    void canShowTotalsaleCalculationPerYear(double total_sell_cost)
    {
        System.out.println("Total sell cost"+total_sell_cost);
    }
}