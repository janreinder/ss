package ss.week4.math;

public class Homework {
    public static void main(String[] args){
        LinearProduct f1 = new LinearProduct(new Constant(4), new Exponent(4));
        Function f2 = f1.integrand();
        Function f3 = f1.derivative();
        System.out.println("f(x) = " + f1 + ", f(8) =  " + f1.apply(8));
        System.out.println("f(x) = " + f2 + ", f(8) =  " + f2.apply(8));
        System.out.println("f(x) = " + f3 + ", f(8) =  " + f3.apply(8));
        
        
        double[] input = {3.0,7,2,1};
        Polynomial f4 = new Polynomial(input);
        Function f5 = f1.integrand();
        Function f6 = f1.derivative();
        System.out.println("f(x) = " + f4 + ", f(8) =  " + f4.apply(8));
        System.out.println("f(x) = " + f5 + ", f(8) =  " + f5.apply(8));
        System.out.println("f(x) = " + f6 + ", f(8) =  " + f6.apply(8));
        
    }
    
}
