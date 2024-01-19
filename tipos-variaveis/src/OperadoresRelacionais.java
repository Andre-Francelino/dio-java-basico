public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("número um é IGUAL à numero dois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("número um é DIFERENTE de número dois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("número um é MAIOR que número dois? " + simNao);
        
        simNao = numero1 < numero2;
        System.out.println("número um é MENOR que número dois? " + simNao);

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira!");
        }
    }
}
