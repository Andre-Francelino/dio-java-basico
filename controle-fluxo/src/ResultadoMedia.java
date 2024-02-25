import java.util.Locale;
import java.util.Scanner;

public class ResultadoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo. Vamos verificar sua situação de acordo com suas notas!");
        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println();

        sc.close();

        double media = (nota1 + nota2 + nota3)/3;

        if(media >= 7){
            System.out.println("Parabéns! Você está aprovado. Sua média foi de " +  String.format("%.2f", media));
            System.out.println("Boas Férias!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Opa! Você está em recuperação.");
            double notaRestante = 10 - media;
            System.out.println("Sua média foi de " + String.format("%.2f", media) + " e é necessário " + String.format("%.2f", notaRestante) + " para ser aprovado na reposição. Continue estudando!");
        } else {
            System.out.println("Infelizmente Você não conseguiu. Sua média foi de " + String.format("%.2f", media));
            System.out.println("Você está reprovado! :( ");
        }
    }
}
