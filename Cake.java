
/**
 * BakeItem program.
 *
 * Project9
 * @author Tao Guo
 * @version 4/13/2017
 */


public class Cake extends BakedItem {
   protected int layers;
    
   /**
    * base rate.
    */ 
    
   public static final double BASE_RATE = 8.0;
    /**
    * @param nameIn to name;
    * @param flavorIn to flavor;
    * @param quantityIn to quantity;
    * @param layersIn to layers;
    * @param ingredientsIn to ingredients;
    */

   public Cake(String nameIn, String flavorIn, int quantityIn,
                int layersIn, String ... ingredientsIn) {
       
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;
    
   }
    /**
     * @return layers.
     */
   public int getLayers() {
      return layers;
       
       
   }
    /**
     * @param layersIn to layers.
     */
   public void setLayers(int layersIn) {
      layers = layersIn;
       
   }
    /**
     * @return price.
     */
   public double price() {
      return (BASE_RATE * layers) * quantity;
    
   }
    
}