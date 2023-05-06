package hw4.src.mypolynomial;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) { //varargs
		this.coeffs = coeffs;
	}

	public double[] getCoeffs() {
		return coeffs;
	}

	public int getDegree() {
		return coeffs.length - 1;
	}

	public double evaluate(double x) {
        if (this.coeffs.length == 0) {
            System.out.println("Empty array!");
            return 0;
        }
        double result = 0;
        for (int i = this.coeffs.length - 1; i >= 0; i--) {
        	result = result * x + this.coeffs[i];
        }

        return result;
    }

	public MyPolynomial add(MyPolynomial another) {
		if (another == null) {
			return this;
		}
		
		if (this.coeffs.length < another.coeffs.length) {
			double[] temp = this.coeffs;
			this.coeffs = another.coeffs;
			another.coeffs = temp;
		}
		for (int i = 0; i < another.coeffs.length; i++) {
			this.coeffs[i] += another.coeffs[i];
			
		}

		return this;
	}

	public MyPolynomial multiply(MyPolynomial another) {
		if (another == null) {
			return this;
		}

		int totalLength = this.coeffs.length + another.coeffs.length - 1;
		double[] product = new double[totalLength];	

		for (int i = 0; i < this.coeffs.length; i++) {
			for (int j = 0; j < another.coeffs.length; j++) {
				product[i + j] += this.coeffs[i] * another.coeffs[j];
			} 
		}

		this.coeffs = product;

		return this;
	}

	public String toString() {
		String result = "";
		for (int i = coeffs.length - 1; i >= 0; i--) {
			result += Double.toString(coeffs[i]) + (i != 0 ? "*x^" + i + " + " : "");
		}
		return result;
	}

}
