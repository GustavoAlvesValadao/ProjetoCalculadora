
public class CalculadoraCientifica {

    public double raiz(int a1) {
        return Math.sqrt(a1);

    }

    public double raiz(double x) {
        return Math.sqrt(x);

    }

    public double raiz(String c) {
        double c1 = Double.parseDouble(c);
        return Math.sqrt(c1);
    }

    public double potencia(byte a, byte b) {
        return Math.pow(a, b);
    }

    public double potencia(String s1, String s2) {
        double s11 = Double.parseDouble(s1);
        double s12 = Double.parseDouble(s2);
        return Math.pow(s11, s12);
    }

    public double potencia(int a, double b1) {
        return Math.pow(a, b1);
    }
}
