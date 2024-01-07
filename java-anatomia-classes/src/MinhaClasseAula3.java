public class MinhaClasseAula3 {
    public static void main(String[] args) {
    
    // Declaração de variáveis:
    // Tipo nomeBemDefinido = Atribuição/Valor
        String nome = "John";
        String sobrenome = "Winchester";
        int anoFabricacao = 2023;
        boolean verdadeira = true;
        anoFabricacao = 2024;

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    // Declaração de métodos:
    // Tipo de retorno NomeObejetivoNoInfinitivo Parametro(s)
    public static String nomeCompleto (String nome, String sobrenome) {
        return "Resultado do método: " + nome.concat(" ").concat(sobrenome);
    }
}
