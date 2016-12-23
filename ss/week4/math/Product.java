package ss.week4.math;

public class Product implements Function {
	private Function f1, f2;
	
	public Product(Function fun1, Function fun2) {
		this.f1 = fun1;
		this.f2 = fun2;
	}
	
	public double apply(double value) {
		return this.f1.apply(value) * this.f2.apply(value);		
	}
	
	public Function derivative() {
		return new Sum(
					new Product(this.f1.derivative(), this.f2),
					new Product(this.f1, this.f2.derivative())
					);
	}
	
	public String toString() {
		return this.f1.toString() + " * " + this.f2.toString();
	}
}

