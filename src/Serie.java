public class Serie implements Reproducible{
    private int cantidad ;
    public Serie (int cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public void reproducir() {
        System.out.println("reproduciendo serie!");

    }

    @Override
    public void pausar() {
        System.out.println("pausando serie!");

    }

    @Override
    public void detener() {

        System.out.println("deteniendo serie");

    }
}
