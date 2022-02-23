import java.util.Scanner;

public class aplication1 {

    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        System.out.print("Informe o salário: ");
        double salario = dados.nextDouble();

        System.out.print("Informe o percentual de aumento: ");
        double pA = dados.nextDouble();

        double aumento = salario * pA/100;
        double novoSalario = salario + aumento;
        
        System.out.print("Esse é o seu novo salário: " +novoSalario);    
    }
    
    
}
