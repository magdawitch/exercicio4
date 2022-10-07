import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //1: Pedir 4 notas Bimestrais

        Scanner sc = new Scanner (System.in);

        System.out.print("Entre com a primeira nota: ");

        double n1 = sc.nextDouble();

        System.out.print("Entre com a segunda nota: ");

        double n2 = sc.nextDouble();

        System.out.print("Entre com a terceira nota: ");

        double n3 = sc.nextDouble();

        System.out.print("Entre com a quarta nota: ");

        double n4 = sc.nextDouble();
        
        sc.close();

        //2: Apresente a média das notas

        double média = (n1 + n2 + n3 + n4)/4;

        System.out.println("A média das quatro notas é: "+ média);
        
        










    }
}
