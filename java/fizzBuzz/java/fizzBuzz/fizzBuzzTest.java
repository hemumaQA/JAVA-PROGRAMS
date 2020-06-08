package fizzBuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class fizzBuzzTest {
  @Test
  public void resultEqualsFizz() {
	  Assert.assertEquals("Fizz",FizzBuzz.getResult(3));
  }
  @Test
  
  public void resultEqualsBuzz() {
	  Assert.assertEquals("Buzz",FizzBuzz.getResult(5));
  }
  @Test
  
  public void resultEqualsFizzBuzz() {
	  Assert.assertEquals("FizzBuzz",FizzBuzz.getResult(30));
  }
  @Test
  
  public void resultEquals() {
	  Assert.assertEquals(" ",FizzBuzz.getResult(0));
  }
}
