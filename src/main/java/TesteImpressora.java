
public class TesteImpressora {
    public static void main (String [] args){
        
        Impressora impressora = new Impressora();
        
        float a = 4.17f;
        float b = 5.14f;
        String a1 = "teste 1";
        String b1 = "teste 2";
        String c1 = "teste 3";
        int x = 4;
        int y = 5;
        
        
        impressora.exibir(a);
        impressora.exibir(a, b);
        impressora.exibir(a1, b);
        impressora.exibir(a, b1);
        impressora.exibir(a1, b1, c1);
        impressora.exibir(x, y, c1);
    }
}
