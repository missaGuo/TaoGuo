/**
 * BakeItem program.
 *
 * Project9
 * @author Tao Guo
 * @version 4/13/2017
 */



public class Cookie extends BakedItem {
    
    /**
     * base rate.
     */
    
   public static final double BASE_RATE = 0.35;
    
    /**
    * @param nameIn to name;
    * @param flavorIn to flavor;
    * @param quantityIn to quantity;
    * @param ingredientsIn to ingredients;
    */

   public Cookie(String nameIn, String flavorIn, int quantityIn,
                  String ... ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
       
   }
    /**
     * @return price.
     */
   public double price() {
      return BASE_RATE * quantity;
      
   }
    
}