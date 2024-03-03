public class SistemaMedida {
    // Switch Case

    public static void main(String[] args) {
        String sigla = "A";

        switch (sigla) {
            case "P": {
                System.out.println("Tamanho PEQUENO");
                break;
            }
            case "M": {
                System.out.println("Tamanho MÉDIO");
                break;
            }
            case "G": {
                System.out.println("Tamanho GRANDE");
                break;
            }
            case "GG": {
                System.out.println("Tamanho GIGANTE");
                break;
            }
            default:
                System.out.println("Sigla invalida!");
                break;
        }
    }
}
