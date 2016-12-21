package ss.week4.math;

public class LinearProduct extends Product implements Function, Integrandable {
	private Function f1, c1;
	public LinearProduct(Function fun1, Function fun2) {
		super(fun1, fun2);
		if(fun1 instanceof Constant) {
			this.f1 = fun2;
			this.c1 = fun1;
		}
		else if(fun2 instanceof Constant) {
			this.f1 = fun1;
			this.c1 = fun2;
		}		
	}
	
	
	//@ensures (f1 instanceof Constant && f2 instanceof Constant) ==> \result.apply(1) == 0;
	//@ensures (f1 instanceof Constant && f2 instanceof Constant) ==> \result 
	public Function derivative() 
	{
		return new LinearProduct(this.f1.derivative(), this.c1);
	}
	
	public Function integrand(){
	    return new LinearProduct(c1, ((Integrandable)this.f1).integrand());
	}
}
