
public class Calculadora {

    public int soma(int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }

    public int soma(String a, String b) {
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int resultado = n1 + n2;
        return resultado;
    }

    public float soma(float a, float b) {
        float resultado;
        resultado = a + b;
        return resultado;
    }

    public int soma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        return resultado;
    }

    public int soma(String c, int a, int b) {

        int c1 = Integer.parseInt(c);
        int resultado;
        resultado = c1 + a + b;
        return resultado;
    }

    public int soma(String a, int b) {
        return Integer.parseInt(a) + b;
    }

    public int soma(int a, String b) {
        return Integer.parseInt(b) + a;
    }

    public int subtracao(int a, int b) {
        int resultado = a - b;
         return resultado;
        
    }
    public int multiplicacao(int a, int b) {
        int resultado = a * b;
         return resultado;
    }
    public int divisao(int a, int b) {
        int resultado = a / b;
         return resultado;
    }
}
