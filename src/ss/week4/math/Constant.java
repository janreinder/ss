package ss.week4.math;
//constant Function
public class Constant implements Function, Integrandable {
	//value of the constant
	private double value;
	
	//@ ensures this.apply(1.00) == val;
	public Constant(double val) {
		this.value = val;
	} 
	
	
	//@ ensures \result == this.apply(1.00);
	public double apply(double input) {
		return this.value;
	}
	
	
	//@ ensures \result.apply() == 0 yolofail do it jml;
	public Function derivative() {
		return new Constant(0);
	}
	
	
	public Function integrand() {
	    return new LinearProduct(new Exponent(1), this);
	}
	 
	//returns the function in text
	public String toString() {
		return Double.toString(this.value);
	}
}
