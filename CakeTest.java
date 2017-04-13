import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;


public class CakeTest {


      

   /** A test that always fails. **/
   @Test public void getLayerTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
                            "flour", "sugar", "cocoa powder", "vanilla",
                            "eggs", "butter", "baking soda", "baking powder", 
                            "salt");
      Assert.assertEquals(1, c1.getLayers());
   }
    
   @Test public void setLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
                            "flour", "sugar", "cocoa powder", "vanilla",
                            "eggs", "butter", "baking soda", "baking powder", 
                            "salt");
      c1.setLayers(10);
      Assert.assertEquals(10, c1.getLayers());
         
   }
       
   @Test public void priceTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
                            "flour", "sugar", "cocoa powder", "vanilla",
                            "eggs", "butter", "baking soda", "baking powder", 
                            "salt");
      Assert.assertEquals(8, c1.price(), 0.01);
   }

     
}
