import java.util.Scanner;

public class aplication4 {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        System.out.print("Informe o preço do automóvel: ");
        double precoFabrica = dados.nextDouble();

        System.out.print("Informe a porcentagem de lucro do Distribuidor: ");
        double percentualDistribuidor = dados.nextDouble();
        
        System.out.print("Informe a porcentagem de imposto: ");
        double percentualImposto = dados.nextDouble();

        double lucroDistribuidor = precoFabrica * percentualDistribuidor /100;

        double valorImposto =  precoFabrica * percentualImposto / 100;

        double precoFinal = precoFabrica + lucroDistribuidor + valorImposto;

        System.out.println("O lucro do distribuidor será de: "+lucroDistribuidor);
        System.out.println("O valor a ser pago de imposto será de: "+valorImposto);
        System.out.print("O preço total a ser pago é de: "+precoFinal);

    }
}
