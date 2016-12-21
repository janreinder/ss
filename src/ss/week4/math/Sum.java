package ss.week4.math;

public class Sum implements Function, Integrandable {
	private Function f1, f2;
	
	public Sum(Function fun1, Function fun2) {
		this.f1 = fun1;
		this.f2 = fun2;
	}
	
	public double apply(double value) {
		return this.f1.apply(value) + this.f2.apply(value);		
	}
	
	public Function derivative() {
		return new Sum(this.f1.derivative(), this.f2.derivative());
	}
	
	public String toString() {
		return this.f1.toString() + " + " + this.f2.toString();
	}
	
	public Function integrand(){
	    return new Sum( ((Integrandable)this.f1).integrand(), ((Integrandable)this.f2).integrand());
	}
}
