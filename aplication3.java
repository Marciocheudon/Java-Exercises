import java.util.Scanner;

public class aplication3 {
    
    
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Informe o depósito: ");
        double deposito = dados.nextDouble();

        
        System.out.print("Informe a porcentagem de juros: ");
        double juros = dados.nextDouble();

        double rendimento = deposito * juros/100;
        double valorTotal = deposito + rendimento;

        System.out.println("Rendimento: "+rendimento);
        System.out.print("Valor Total: "+valorTotal);
    }
    
}

