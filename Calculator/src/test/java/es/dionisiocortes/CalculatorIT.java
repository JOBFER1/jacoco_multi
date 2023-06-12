package es.dionisiocortes;

//import es.dionisiocortes.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorIT {
	private final Calculator sut = new Calculator();

	@Test
	public void sum_and_multiply_should_return_the_correct_value() {
		assertEquals(25, sut.sumAndMultiply(2,3,5,1));
	}
}