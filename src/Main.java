
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Usuario u = new Usuario();
        Reproducible pel = new Pelicula(120);
        u.agregarFavoritos(pel);
        u.reproducir(0);
    }
}