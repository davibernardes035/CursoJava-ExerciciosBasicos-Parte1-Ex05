import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codpeca1, numpeca1, codpeca2, numpeca2;
        double valorUnitario1, valorUnitario2, resultado;

        codpeca1 = sc.nextInt();
        numpeca1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();


        codpeca2 = sc.nextInt();
        numpeca2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        resultado = (numpeca1 * valorUnitario1) + (numpeca2 * valorUnitario2);

        System.out.println("VALOR A PAGAR: R$ "+ resultado);

        sc.close();
    }
}