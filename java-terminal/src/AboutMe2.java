import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Qual é sua profissão? ");
        String profissao = scanner.next();

        System.out.println("Em qual empresa você trabalha? ");
        String empresa = scanner.next();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é de " + altura + "cm ");
        System.out.println("Trabalho como " + profissao + " na empresa " + empresa + ".");
    }
}
