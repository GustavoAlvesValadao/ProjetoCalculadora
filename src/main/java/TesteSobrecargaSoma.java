public class TesteSobrecargaSoma {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int x = 1, y = 2, z = 3;
        String s1 = "50", s2 = "60";
        float f1 = 56.7f, f2 = 1.7f;

        // Soma de números reais       
        System.out.println(calculadora.soma(f1, f2));
        
        // Soma de números inteiro e sting       
        System.out.println(calculadora.soma(s1, x));
        
        // Soma de string com string        
        System.out.println(calculadora.soma(s1, s2));
        
        // Soma de três numeros inteiros
        System.out.println(calculadora.soma(x, y, z));

    }

}
