import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;


public class PieTest {


      

   /** A test that always fails. **/
   @Test public void getCrustCostTest() {
      pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
                        "flour", "sugar", "apples", "cinnamon",
                        "butter", "baking soda", "salt");
   
      Assert.assertEquals(0, p1.getCrustCost(), 0.01);
   }
    
   @Test public void setCrustCostTest() {
      pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
                        "flour", "sugar", "apples", "cinnamon",
                        "butter", "baking soda", "salt");
      p1.setCrustCost(2.0);
      Assert.assertEquals(2, p1.getCrustCost(), 0.01);
         
   }
       
   @Test public void priceTest() {
      pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
                        "flour", "sugar", "apples", "cinnamon",
                        "butter", "baking soda", "salt");
      Assert.assertEquals(12, p1.price(), 0.01);
   }

}
