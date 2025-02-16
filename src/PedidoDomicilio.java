public class PedidoDomicilio implements Pedido {
    private Repartidor repartidor;
    public PedidoDomicilio (Repartidor repartidor){
        this.repartidor=repartidor;
    }
    @Override
    public void preparar() {
        System.out.println("Preparando pedido para domicilio...");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido listo para reparto.");
        repartidor.repartir();
    }
}
