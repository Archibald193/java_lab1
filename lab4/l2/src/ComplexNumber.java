public class ComplexNumber {
    private double real;
    private double i;

    public ComplexNumber(double real, double i) {
        this.real = real;
        this.i = i;
    }

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }

    public double geti() {
        return i;
    }
    public void seti(double i) {
        this.i = i;
    }
    
    public ComplexNumber multiply(ComplexNumber other) {
        double resReal = this.real * other.getReal() - this.i * other.geti();
        double resI = this.real * other.geti() + this.i * other.getReal();
        
        return new ComplexNumber(resReal, resI);
    }
    
    public ComplexNumber power(int power) {
        if (power < 0) {
            System.out.println("power < 0");
            return null;
        }
        if (power == 0) {
            return new ComplexNumber(1, 0);
        }
        
        ComplexNumber res = new ComplexNumber(this.real, this.i);
        
        for (int i = 1; i < power; i++) {
            res = res.multiply(this);
        }
        return res;
    }
    
    @Override
    public String toString() {
        if (i == 0) {
            return String.valueOf(real);
        }
        if (real == 0) {
            return i + "i";
        }
        if (i < 0) {
            return real + " - " + (-i) + "i";
        }
        return real + " + " + i + "i";
    }
}