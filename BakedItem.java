import java.text.DecimalFormat;
/**
 * BakeItem program.
 *
 * Project9
 * @author Tao Guo
 * @version 4/13/2017
 */

public abstract class BakedItem extends BakeryPart1 {
   protected String name;
   protected String flavor;
   protected String[] ingredients;
   protected int quantity;
   protected static int count = 0;
   /**
    * @param nameIn to name;
    * @param flavorIn to flavor;
    * @param quantityIn to quantity;
    * @param ingredientsIn to ingredients;
    */
   public BakedItem(String nameIn, String flavorIn, int quantityIn,
                     String ... ingredientsIn) {
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      count++;
            
      
   }
   /**
    * @return name.
    */
   public String getName() {
      return name;
      
   }
   /**
    * @param nameIn to name.
    */
   public void setName(String nameIn) {
      this.name = nameIn;
   
   }
   /**
    * @return flavor.
    */
   public String getFlavor() {
      return flavor;
      
   }
   /**
    * @param flavorIn to flavor.
    */
   public void setFlavor(String flavorIn) {
      this.flavor = flavorIn;
      
   }
   /**
    * @return quantity.
    */
   public int getQuantity() {
      return quantity;
      
   }
   /**
    * @param quantityIn to quantity.
    */
   public void setQuantity(int quantityIn) {
      this.quantity = quantityIn;
      
   }
   /** 
    * @return ingredients.
    */
   public String[] getIngredients() {
      return ingredients;
      
   }
   /**
    * @param ingredientsIn to ingredients.
    */
   public void setIngredients(String ... ingredientsIn) {
      this.ingredients = ingredientsIn;
      
   }
   /**
    * @return count.
    */
   public int getCount() {
      return count;
      
   }
   /** 
    * @reset count is equal to 0.
    */
   public static void resetCount() {
      BackedItem.count = 0;
      
   }
   /**
    * @return result.
    */
   public final String toString() {
      String ing = "";
      for (int i = 0; i < ingredients.length; i++) {
         if (i % 5 == 0 && i > 0) {
            ing += "\n" + ingredients[i] + ", ";
            continue;
         }
         ing += ingredients[i] + ", ";
      
      }
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      String result = this.getClass().toString().subString(6)
                      + ": " + name + " - " + flavor + "   Quantity: "
                      + quantity + "   Price: " + fmt.format(price())
                      + "\n" + "(Ingredients: " + ing + ")";
      result = result.replace(", )", ")");
      return result;
      
   }
   /**
    * Abstract method for derived class to override.
    * @return price as a double.
    */
   public abstract double price();
 
}
   
   
        
   
