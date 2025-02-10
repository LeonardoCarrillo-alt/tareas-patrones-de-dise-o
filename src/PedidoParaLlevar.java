public class PedidoParaLlevar implements Pedido{
    @Override
    public void preparar() {
        System.out.println("Preparando pedido para llevar...");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido para llevar listo para ser recogido.");
    }
}
