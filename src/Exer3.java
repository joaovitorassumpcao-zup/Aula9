import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int sus = 0, count = 0;

        System.out.println("Responda com S ou N:");
        while (count != perguntas.size()) {
            System.out.println(perguntas.get(count));
            resposta = scanner.next();

            if (Objects.equals(resposta, "S")) {
                sus += 1;
            } else if (!Objects.equals(resposta, "N")){
                System.out.println("Resposta Inválida!");
                return;
            }
            count++;
        }

        if (sus >= 5) {
            System.out.println("Assasino.");
        } else if (sus > 2) {
            System.out.println("Cúmplice.");
        } else if (sus == 2) {
            System.out.println("Suspeita.");
        } else {
            System.out.println("Inocente.");
        }
    }
}
