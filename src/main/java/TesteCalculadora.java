import javax.swing.JOptionPane;

public class TesteCalculadora {

    public static void main(String[] args) {
        // Construção da calculadora, criação do objeto
        Calculadora calculadora = new Calculadora();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão"));
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o primeiro valor"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o segundo valor"));

        int resultado;
        if (opcao == 1) {
            resultado = calculadora.soma(operando1, operando2);
        } else if (opcao == 2) {
            resultado = calculadora.subtracao(operando1, operando2);
        } else if (opcao == 3) {
            resultado = calculadora.multiplicacao(operando1, operando2);
        } else {
            resultado = calculadora.divisao(operando1, operando2);
        }
        JOptionPane.showMessageDialog(null,"Resultado é " + resultado);
    }
}

