public class ResultadoEscolar2 {
    // Condicional Encadeada

    public static void main(String[] args) {
        double nota = 10.0;

        if(nota >= 7)
            System.out.println("O aluno está aprovado!");
        
        else if(nota >= 5 && nota < 7)
            System.out.println("O aluno fará recuperação.");
        
        else
            System.out.println("O aluno está reprovado!");
    }
}
