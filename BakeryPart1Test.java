import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;


public class BakeryPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
    
   /** A test that always fails. **/
   @Test public void mainTest() {
      BakeryPart1 bp1 = new BakeryPart1();
      BakedItem.resetCount();
      BakeryPart1.main(null);
      Assert.assertEquals("BakedItem.count shoud be 6.", 
                           6, BakedItem.getCount());
   }
}
