package es.dionisiocortes;

//import es.dionisiocortes.MultiplicationAndDivision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationAndDivisionTest {
	private final MultiplicationAndDivision sut = new MultiplicationAndDivision();

	@Test
	public void multiplication_should_multiply_two_numbers() {
		assertEquals(32, sut.multiplication(8, 4));
	}

	@Test
	public void division_should_divide_first_number_with_the_second() {
		assertEquals(5, sut.division(40, 8));
	}
}