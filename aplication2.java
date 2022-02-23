import java.util.Scanner;

public class aplication2 {

    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);
        
        System.out.print("Informe o salário Base: ");
        double salarioBase = dados.nextDouble();
        
        System.out.print("Informe a porcentagem de gratificação: ");
        double porGrat = dados.nextDouble();
        
        System.out.print("Informe a porcentagem de imposto: ");
        double imposto = dados.nextDouble();
       
        
        double gratificacao = salarioBase * porGrat/100;
        double impostoTotal = salarioBase * imposto/100;
        double salalarioReceber =  salarioBase + (gratificacao - impostoTotal);
          
        System.out.print("O salário a receber é: "+salalarioReceber);
    }
    
    
}