public class CaixaEletronico3 {
    // Condicional Composta

    /*
        Quando há duas ou mais instruções em uma condicional 
        é necessário adcionar um bloco utilizando chaves { }
    */ 

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 25.5;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo: " + saldo);
        } else
            System.out.println("Saldo Insuficiente.");
    }
}
