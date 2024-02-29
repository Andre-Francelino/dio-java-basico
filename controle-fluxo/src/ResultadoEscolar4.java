public class ResultadoEscolar4 {
    // Operador Ternário (Estrutura Encadeada)
    // Refatoração

    public static void main(String[] args) {
        double nota = 6.5;

        String resultado =  nota >= 7 ? "Aluno está Aprovado!" : nota >= 5 && nota < 7 ? "Aluno está em Recuperação!" : "Aluno está Reprovado :(";

        System.out.println(resultado);

    }
}
