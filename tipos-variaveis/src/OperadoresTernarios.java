public class OperadoresTernarios {
    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 6;

        // Sem utilzar o Operador Ternário
        String resultadoSemTernario = "";

        if (a==b)
            resultadoSemTernario = "verdadeiro";
        else
            resultadoSemTernario = "falso";

        
        // Utilizando o Operador Ternário
        String resultadoComTernario = a==b ? "verdadeiro" : "falso";
        /*
            lembrando que no operador ternário 
                a primeira expressão sempre é do tipo booleana .
        */

        System.out.println(resultadoSemTernario);
        System.out.println(resultadoComTernario);
    }
}
