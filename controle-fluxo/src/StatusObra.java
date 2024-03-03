public class StatusObra {
    public static void main(String[] args) {
        String numObra = "0032400033";
        String statusObra = "";

        if (statusObra == "CONCLUIDA") {
            System.out.println("Obra " + numObra + " concluída 100%");
            System.out.println("Aplicar os passos no SIAGO de Apresentação de TCI e Conclusão Física.");
        }
        else if (statusObra == "ANDAMENTO") {
            System.out.println("Obra " + numObra + " parcialmente executada");
            System.out.println("Saber quais os serviços restantes e a quantidade de dias necessários para a conclusão final.");
        }
        else if (statusObra == "CANCELADA") {
            System.out.println("Obra " + numObra + " foi cancelada");
            System.out.println("Saber qual o motivo do cancelamento e reprogramar os serviços para uma nova data dentro do prazo.");
        }
        else {
            System.out.println("Obra " + numObra + " Indeferida.");
            System.out.println("Não será mais necessário a execução do projeto.");
        }
    }
}
