public class PedidoEnMesa implements Pedido{
    @Override
    public void preparar() {
        System.out.println("Preparando pedido en mesa...");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido entregado en la mesa.");
    }
}
