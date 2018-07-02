package hello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloControllerTest {
	
   String message = "Hello World!";	
   HelloController messageUtil = new HelloController();

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}
