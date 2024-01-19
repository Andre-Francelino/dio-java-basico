public class OperadoresRelacionaisDois {
    public static void main(String[] args) {

        String nomeBanda1 = "RESGATE";
        String nomeBanda2 = "RESGATE";
        String nomeBandaObjeto = new String("RESGATE");

        System.out.println(nomeBanda1 == nomeBanda2);
        System.out.println(nomeBanda1 == nomeBandaObjeto);
        System.out.println(nomeBanda2 == nomeBandaObjeto);

        // Para comparar o conteudo de dois objetos é necessário usar o método equals
        // ambos objetos estão em locais diferentes na memória
        System.out.println(nomeBanda1.equals(nomeBandaObjeto));
        System.out.println(nomeBanda2.equals(nomeBandaObjeto));

    }
}
