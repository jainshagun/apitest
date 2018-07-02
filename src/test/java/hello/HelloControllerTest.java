package hello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloControllerTest {
	
   String message = "Hello World!";	
   home messageUtil = new home();

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}
