import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nSalário por hora: ");
        float salarioHora = scanner.nextFloat();

        System.out.print("Horas trabalhadas no mês: ");
        int horasMes = scanner.nextInt();

        float salarioMesBruto = salarioHora * horasMes;
        float impostoRenda;

        if (salarioMesBruto > 2500) {
            impostoRenda = (float) (salarioMesBruto * 0.20);
        } else if (salarioMesBruto > 1500) {
            impostoRenda = (float) (salarioMesBruto * 0.10);
        } else if (salarioMesBruto > 900) {
            impostoRenda = (float) (salarioMesBruto * 0.05);
        } else {
            impostoRenda = 0;
        }

        float impostoINSS = (float) (salarioMesBruto * 0.10);
        float impostoFGTS = (float) (salarioMesBruto * 0.11);
        float salarioLiquido = (salarioMesBruto - impostoRenda) - impostoINSS;
        float totalDescontos = impostoFGTS + impostoINSS + impostoRenda;

        System.out.printf("Salário Bruto: (%.2f * %d)     : R$ %.2f%n", salarioHora, horasMes, salarioMesBruto);
        System.out.printf(" (-) IR (5%%)                    : R$ %.2f%n", impostoRenda);
        System.out.printf(" (-) INSS (10%%)                 : R$ %.2f%n", impostoINSS);
        System.out.printf("FGTS (11%%)                      : R$ %.2f%n", impostoFGTS);
        System.out.printf("Total de descontos              : R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Liquido                 : R$ %.2f%n", salarioLiquido);

    }
}
