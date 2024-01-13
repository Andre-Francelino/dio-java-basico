public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        short x = 29000;
        int y = 45000;
        short soma = (short) (x + y);
        System.out.println(soma);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroNormal);
        System.out.println(numeroCurto);
        System.out.println(numeroCurto2);

        // constantes
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
