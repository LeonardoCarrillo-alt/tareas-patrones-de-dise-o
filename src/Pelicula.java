public class Pelicula implements Reproducible {
    private int duracion;
    public Pelicula (int duracion){
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("la pelicula se esta reproduciendo");

    }

    @Override
    public void pausar() {
        System.out.println("pausar pelicula");

    }

    @Override
    public void detener() {
        System.out.println("detener pelicula");

    }
}
