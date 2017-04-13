/**
 * BakeItem program.
 *
 * Project9
 * @author Tao Guo
 * @version 4/13/2017
 */



public class WeddingCake extends Cake {
   private int tiers;
    
    /**
     * base rate.
     */
    
   public static final double BASE_RATE = 15.0;
    /**
    * @param nameIn to name;
    * @param flavorIn to flavor;
    * @param quantityIn to quantity;
    * @param layersIn to layers;
    * @param tiersIn to tiers;
    * @param ingredientsIn to ingredients;
    */

   public WeddingCake(String nameIn, String flavorIn, int quantityIn,
                   int layersIn, int tiersIn, String ... ingredientsIn) {
      super(nameIn, flavorIn, quantityin, layersIn, ingredientsIn);
      tiers = tiersIn;
   
   }
   /**
    * @return tiers.
    */
   public int getTiers() {
      return tiers;
      
   }
   /**
    * @param tiersIn to tiers.
    */
   public void setTiers(int tiersIn) {
      tiers = tiersIn;
      
   }
   /**
    * @return price.
    */
   public double price() {
      return (BASE_RATE * layers * tiers) * quantity;
   }
   
}
   
   
   
   
