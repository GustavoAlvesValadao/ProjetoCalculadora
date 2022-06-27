
public class TesteCalculadoraCientifica {
    
    public static void main (String[] args){
        
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        
        int a1 = 25;
        double x = 20.0;
        double b1 = 3;
        String c1 = "40.0";
        byte a = 5;
        byte b = 2;
        String s11 = "2";
        String s12 = "3";
        
        
        System.out.println(calculadoraCientifica.raiz(a));
        System.out.println(calculadoraCientifica.raiz(x));
        System.out.println(calculadoraCientifica.raiz(c1));
        System.out.println(calculadoraCientifica.potencia(s11, s12));
        System.out.println(calculadoraCientifica.potencia(a, b));
        System.out.println(calculadoraCientifica.potencia(a, b1));
        
    }
}
