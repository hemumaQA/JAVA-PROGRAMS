package fizzBuzz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class fizzBuzzTest {
  @Test
  public void resultEqualsFizz() {
	  Assert.assertEquals("Fizz",FizzBuzz.getResult(3));
  }
  
  public void resultEqualsBuzz() {
	  Assert.assertEquals("Buzz",FizzBuzz.getResult(5));
  }
  
  public void resultEqualsFizzBuzz() {
	  Assert.assertEquals("FizzBuzz",FizzBuzz.getResult(15));
  }
  
  public void resultEquals() {
	  Assert.assertEquals(" ",FizzBuzz.getResult(1));
  }
}
