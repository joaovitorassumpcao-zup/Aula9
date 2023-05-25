import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float preco;

        System.out.print("Litros vendidos: ");
        int litros = scanner.nextInt();

        System.out.print("Tipo de combustível (A = alcool | G = gasolina) : ");
        String comb = scanner.next();

        switch (comb) {
            case "A":
                preco = (float) (litros * 1.90);
                if (litros > 20) {
                    preco *= 0.95;
                    System.out.printf("Valor a ser pago:   R$ %.2f (5%% off)",preco);
                } else {
                    preco *= 0.97;
                    System.out.printf("Valor a ser pago:   R$ %.2f (3%% off)",preco);
                }
                break;
            case "G":
                preco = (float) (litros * 2.50);
                if (litros > 20) {
                    preco *= 0.96;
                    System.out.printf("Valor a ser pago:   R$ %.2f (4%% off)",preco);
                } else {
                    preco *= 0.94;
                    System.out.printf("Valor a ser pago:   R$ %.2f (6%% off)",preco);
                }
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
