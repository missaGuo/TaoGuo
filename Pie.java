
/**
 * BakeItem program.
 *
 * Project9
 * @author Tao Guo
 * @version 4/13/2017
 */



public class Pie extends BakedItem {
   private double crustCost;
    
    /**
     * base rate.
     */
   public static final double BASE_RATE = 12.0;
    
    /**
    * @param nameIn to name;
    * @param flavorIn to flavor;
    * @param quantityIn to quantity;
    * @param crustIn to crust.
    * @param ingredientsIn to ingredients;
    */

   public Pie(String nameIn, String flavorIn, int quantityIn,
               double crustIn, String ... ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCoset = crustCostIn;
       
   }
   
    /**
     * @return crustCost.
     */
   public double getCrustCost() {
      return crustCost;
       
   }
    /**
     * @param crustCostIn to crustCost.
     */
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn;
       
   }
    /**
     * @return price.
     */
   public double price() {
      return (BASE_RATE + crustCost) * quantity;
       
   }
    
}