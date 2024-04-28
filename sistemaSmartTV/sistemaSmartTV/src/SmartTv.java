public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        System.out.println("Ligando TV...");
        ligada = true;
    }

    public void desligar() {
        System.out.println("Desligando TV...");
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println(volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println(volume);
    }

    public void subirCanal() {
        canal++;
        System.out.println(canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println(canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }
}