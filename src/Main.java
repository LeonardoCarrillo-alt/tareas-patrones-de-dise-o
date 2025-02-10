// restaurante
public class Main {
    public static void main(String[] args) {
        System.out.printf("Restaurante!!");
        Restaurante rest = new Restaurante();
        Pedido pedido1 = new PedidoParaLlevar();
        Pedido pedido2 = new PedidoEnMesa();
        Pedido pedido3 = new PedidoDomicilio(new Ciclista());
        Pedido pedido4 = new PedidoDomicilio(new Motorizado());
        System.out.println("\ngestionando pedidos:");

        rest.gestionarPedido(pedido1);
        rest.gestionarPedido(pedido2);
        rest.gestionarPedido(pedido3);
        rest.gestionarPedido(pedido4);
    }
}