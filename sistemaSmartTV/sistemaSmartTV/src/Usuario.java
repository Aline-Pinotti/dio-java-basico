public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv(); // instanciando uma classe

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(5);

        smartTv.desligar();
        
    }
}
