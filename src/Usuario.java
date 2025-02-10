import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private List<Reproducible> favoritos = new ArrayList<>() {
    };
    public void agregarFavoritos(Reproducible rep){

        favoritos.add(rep);

    }

    public void reproducir(int nroLista){
        favoritos.get(nroLista).reproducir();
    }
}
