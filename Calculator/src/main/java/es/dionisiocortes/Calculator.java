package es.dionisiocortes;

public class Calculator {
	public Calculator() {
	}

	public int sumAndMultiply(final int sum1, final int sum2, final int mul1, final int mul2) {
		
		AdditionAndSubtraction sum = new AdditionAndSubtraction();
		int suma = sum.addition(sum1, sum2);
		
		MultiplicationAndDivision mul = new MultiplicationAndDivision();
		int multi = mul.multiplication(mul1, mul2);
		
		return mul.multiplication(suma, multi);
	}
}