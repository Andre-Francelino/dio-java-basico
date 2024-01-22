public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal (int novoCanal){
        if(ligada == true) {
            canal = novoCanal;
        } else {
            System.out.println("A TV está desligada. Impossivel mudar de canal!");
        }
        
    }

    public void aumentarCanal(){
        if(ligada == true) {
            canal++;
        } else {
            System.out.println("A TV está desligada. Impossivel aumentar canal!");
        }
    }

    public void diminuirCanal(){
        if(ligada == true) {
            canal--;
        } else {
            System.out.println("A TV está desligada. Impossivel diminuir canal!");
        }
    }

    public void aumentarVolume(){
        if (ligada == true) {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        } else {
            System.out.println("A TV está desligada. Impossivel aumentar o volume!");
        }
    }

    public void diminuirVolume(){
        if(ligada == true) {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        } else {
            System.out.println("A TV está desligada. Impossivel diminuir o volume!");
        }
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
    
}
