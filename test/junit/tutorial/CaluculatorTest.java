package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class CaluculatorTest {

	@Test
	public void multiplyで3と4の乗算結果が取得できる() {
		Caluculator calc = new Caluculator(); 
		int expected = 12; 
		int actual = calc.multiply(3, 4); 
		assertThat(actual, is(expected));
	}
	
	@Test
	public void mulitiplyで5と7の乗算結果が取得できる() {
		Caluculator calc = new Caluculator();
		assertThat(35, is(calc.multiply(5, 7)));
	}
	
	@Test
	public void divideで3と2の除算結果が取得できる() {
		Caluculator calc = new Caluculator();
		assertThat(1.5f, is(calc.divide(3, 2)));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void divideで5と0のときIllegalArgumentExceptionを送出する() {
		Caluculator calc = new Caluculator();
		calc.divide(5, 0);
	}

}
