public class Main {
    public static void main(String[] args) {

        Pedido P1 = new Pedido(1234567);
        Pedido.agregarProducto("fish",10.00,1);
        Pedido.agregarProducto("gaseosa",5.00,2);
        Pedido.agregarProducto("carne",25.00,4);

        pedido.mostrarDetalles();



    }
}
