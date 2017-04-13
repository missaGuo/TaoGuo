import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;


public class WeddingCakeTest {


      

   /** A test that always fails. **/
   @Test public void getTiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
                                      "flour", "sugar", "buttermilk", 
                                      "coffee",
                                          "eggs", "butter", "baking soda", 
                                          "baking powder", "salt");
      Assert.assertEquals(3, c3.getTiers());
   }
    
   @Test public void setTiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
                                       "flour", "sugar", "buttermilk", 
                                       "coffee",
                                          "eggs", "butter", "baking soda", 
                                          "baking powder", "salt");
      c3.setTiers(10);
      Assert.assertEquals(10, c3.getTiers());
   }
       
   @Test public void priceTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
                                          "flour", "sugar", "buttermilk", 
                                          "coffee",
                                          "eggs", "butter", "baking soda", 
                                          "baking powder", "salt");  
      Assert.assertEquals(135, c3.price(), 0.01);
         
   }                                                                
}
