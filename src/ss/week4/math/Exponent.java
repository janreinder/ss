package ss.week4.math;

public class Exponent implements Function, Integrandable {
    private double exp;
    
    public Exponent(double exponent){
        this.exp = exponent;        
    }
    
    public double apply(double input) {
        return Math.pow(input, this.exp);        
    }
    
    public Function derivative() {
        return new LinearProduct(new Constant(exp), new Exponent(exp - 1));
    }
    
    public String toString() {
        return "x^" + Double.toString(exp); 
    }
    
    public Function integrand(){
        return new LinearProduct(new Constant(1/(exp + 1)), new Exponent(exp + 1));
    }
} 
