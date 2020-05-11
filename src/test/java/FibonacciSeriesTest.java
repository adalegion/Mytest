import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {

   @Test
   void fibonacci() {
      // : Given
      Integer input = 2;
      Integer expected = 3;

      // : When
      Integer actual = FibonacciSeries.fibonacci1(input);

      // : Then
      assertEquals (expected, actual);
   }

//   @Test
//   void fibonacciTest2() {
//      // : Given
//      Integer input = 2;
//      Integer expected = 4;
//
//      // : When
//      Integer actual = FibonacciSeries.fibonacci1(input);
//
//      // : Then
//      assertEquals (expected, actual);
//   }


}
