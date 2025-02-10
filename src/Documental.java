public class Documental implements Reproducible{
    private String tema;
    public Documental (String tema){
        this.tema = tema;
    }

    @Override
    public void reproducir() {
        System.out.println("reproduciendo documental!");

    }

    @Override
    public void pausar() {
        System.out.println("pausa");

    }

    @Override
    public void detener() {

        System.out.println("documental detenido!");

    }
}
