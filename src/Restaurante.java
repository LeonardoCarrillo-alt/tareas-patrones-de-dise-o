public class Restaurante {
    public void gestionarPedido(Pedido pedido){
        pedido.preparar();
        pedido.entregar();
    }
}
