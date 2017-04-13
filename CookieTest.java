import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;


public class CookieTest {


      

   /** A test that always fails. **/
   @Test public void gettersTest() {
      Cookie c = new Cookie("Chips Deligh", "Chocolate Chip", 12, 
                               "flour", "sugar", "dark chocolate chips",
                               "butter", "baking soda", "salt");
      Assert.assertEquals("Chips Delight", c.getName());
      Assert.assertEquals("Chocolate Chip", c.getFlavor());
      Assert.assertEquals(12, c.getQuantity(), 0.01);
      String ingredients = c.getIngredients()[1];
      Assert.assertEquals("sugar", ingredients);
      
   }
     
   @Test public void setterTest() {
      Cookie c = new Cookie("Chips Deligh", "Chocolate Chip", 12, 
                               "flour", "sugar", "dark chocolate chips",
                               "butter", "baking soda", "salt");
      c.setName("Chips");
      c.setFlaovr("Chocolate");
      c.setQuantity(13);
      Assert.assertEquals("Chips", c.getName());
      Assert.assertEquals("Chocolate", c.getFlavor());
      Assert.assertEquals(13, c.getQuantity());
      String[] test = {"1", "2", "3", "4", "5", "6",
                        "7", "8", "9", "10", "11"};
      c.setIngredients(test);
      Assert.assertEquals("2", c.getIngredients()[1]);
      
   }
      
   @Test public void countTest() {
      Cookie c = new Cookie("Chips Deligh", "Chocolate Chip", 12, 
                               "flour", "sugar", "dark chocolate chips",
                               "butter", "baking soda", "salt");
      c.resetCount();
      Cookie c = new Cookie("Chips Deligh", "Chocolate Chip", 12, 
                               "flour", "sugar", "dark chocolate chips",
                               "butter", "baking soda", "salt");
      Assert.assertEquals(1, c1.getCount());
           
   }
         
   @Test public void toStringTest() {
      Cookie c = new Cookie("Chips Deligh", "Chocolate Chip", 12, 
                               "flour", "sugar", "dark chocolate chips",
                               "butter", "baking soda", "salt");
      Assert.assertEquals("Cookie: Chips Delight - Chocolate Chip   "
                               + "Quantity: 12   "  
                               + "Price: $4.20"
                               + "\n(Ingredients: flour,sugar, "
                               + "dark chocolate chips, "
                               + "butter, baking soda, "
                               + "\nsalt)", c.toString());
   }
        
   @Test public void priceTest() {
      Cookie c = new Cookie("Chips Deligh", "Chocolate Chip", 12, 
                               "flour", "sugar", "dark chocolate chips",
                               "butter", "baking soda", "salt");
      Assert.assertEquals(4.20, c.price(), 0.01);
           
   }
        
   @Test public void after() {
      BakedItem.resetCount();
           
   }
        
     
     
}
     

                               
                            
 


