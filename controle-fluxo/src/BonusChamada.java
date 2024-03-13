import java.util.concurrent.ThreadLocalRandom;

public class BonusChamada {
    public static void main(String[] args) {
        double bonusLigacao = 30.0;

        while (bonusLigacao > 0) {
            Double valorChamada = valorAleatorio();

            if (valorChamada > bonusLigacao) {
                valorChamada = bonusLigacao;
            }

            System.out.println("Uma chamada no valor de R$ " + String.format("%.2f", valorChamada) + " foi encerrada.");
            bonusLigacao = bonusLigacao - valorChamada;
            System.out.println("Você ainda tem R$ " + String.format("%.2f", bonusLigacao) + " de bônus para ligar! \n") ;
        }

        System.out.println("Bônus: R$ " + String.format("%.2f", bonusLigacao));
        System.out.println("Você não tem mais bônus, efetue uma nova recarga e continue falando! :) \n");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(0.25, 5.0);
    }
}
