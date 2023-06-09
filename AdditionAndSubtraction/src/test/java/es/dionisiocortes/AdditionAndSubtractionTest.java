package es.dionisiocortes;

import es.dionisiocortes.AdditionAndSubtraction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionAndSubtractionTest {
	private final AdditionAndSubtraction sut = new AdditionAndSubtraction();

	@Test
	public void addition_should_add_two_numbers() {
		assertEquals(4, sut.addition(2, 2));
	}

	@Test
	public void subtraction_should_subtract_second_number_from_first_number() {
		assertEquals(6, sut.subtraction(8, 2));
	}
}