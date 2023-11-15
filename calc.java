import javax.swing.JOptionPane;

public class calc{
    public static void main(String[] args){
        String nome;
        int num1,num2,resultado;
       // Double divi = Double.ValueOf(resultado);
        String operacao;

        JOptionPane.showMessageDialog(null,"Calculadora");
        nome = JOptionPane.showInputDialog("Insira o seu nome:");

        operacao = JOptionPane.showInputDialog(null,"As opções disponíveis são: "
        + "\n1: soma"
        + "\n2: subtração"
        + "\n3: multiplicação"
        + "\n4: divisao"
        + "\nDigite a operacao desejada:");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número"));
        //JOptionPane.showMessageDialog(null,"A opcao");
        switch(operacao){
            case "1":
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null,"Opção escolhida: 1: soma");
                JOptionPane.showMessageDialog(null,"Resultado"+num1+" somado "+num2+" igual a"+resultado );
                break;
            case "2":
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null,"Opção escolhida: 2: subtracao");
                JOptionPane.showMessageDialog(null,"Resultado"+num1+" subtraido "+num2+" igual a "+resultado );
                break;
            case "3":
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null,"Opção escolhida: 3: multiplicação");
                JOptionPane.showMessageDialog(null,"Resultado"+num1+" vezes "+num2+" igual a "+resultado );
                break;
/*            case "4":
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null,"Opção escolhida: 4: divisao");
                JOptionPane.showMessageDialog(null,"Resultado"+num1+" dividido "+num2+" igual a "+resultado);
                break; */
            default:
                JOptionPane.showMessageDialog(null,"Opção Inválida");
                break;
    }
}
}
