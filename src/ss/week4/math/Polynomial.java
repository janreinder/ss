package ss.week4.math;

public class Polynomial implements Function, Integrandable {
    private double[] term;
    
    public Polynomial(double[] input){
        term = new double[input.length];
        System.arraycopy(input, 0, term, 0, input.length);
    }
    
    public double apply(double input) {
        double result = 0;
        for(int i = 0; i < this.term.length; i++) {
            double exp = i;
            result += term[i]*Math.pow(input, exp); 
            
        }
        return result;
    }
    
    public Function derivative() {
        double[] result = new double[(this.term.length - 1)];
        for(int i = 0; i < result.length; i++) {
            result[i] = this.term[i+1] * ((double)i + 1); 
        }
        
        return new Polynomial(result);
        
    }
    
    public String toString(){
        String result = Double.toString(this.term[0]) + " + ";
        for(int i = 1; i < this.term.length; i++) {
            double exp = i;
            result = result + Double.toString(this.term[i]) + "x" + "^" + Double.toString(exp);
            if(i != this.term.length -1){
                result = result + " + ";
            }            
        }
        return result;
    }
    
    public Function integrand(){
        double[] result = new double[(this.term.length + 1)];
        result[0] = 0;
        for(int i = 0; i < this.term.length; i++) {
            double multiplier = i;
            result[i+1] = this.term[i] / (multiplier + 1); 
        }
        return new Polynomial(result);    
    }
}

