
public class Impressora {

    public void exibir(float a) {
        System.out.println(a);
    }

    public void exibir(float a, float b) {
        System.out.println(a + " , " + b);
    }

    public void exibir(float a, String b1) {
        //float b1 = Float.parseFloat(b);
        System.out.println(a + " , " + b1);

    }

    public void exibir(String a1, float b) {
        //float a1 = Float.parseFloat(a);
        System.out.println(a1 + " , " + b);

    }

    public void exibir(String a1, String b1, String c1) {
        System.out.println(a1 + " , " + b1 + " , " + c1);

    }

    public void exibir(int x, int y, String c1) {
        System.out.println(x + " , " + y + " , " + c1);

    }

}
