import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Olá mundo, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é de " + altura + " cm. \n");
        
            scanner.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("Opa! Acho que você digitou algo errado.");
            System.out.println("Os campos de idade e de altura precisam ser preenchidos com valores numéricos!");
            System.out.println("A idade e altura não podem ser texto"); 
            System.out.println("Lembre que a altura é um valor de casas decimais obedecendo o padrão americano, portanto deve ser separado por PONTO e não por VIRGULA.");
            System.out.println("Tente novamente...");
        }
    }
}
