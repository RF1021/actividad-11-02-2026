import java.util.ArrayList;

public class Pedido {
    private int idPedido;
    private ArrayList<Producto> productos;

    public Pedido(int idpedido, ArrayList<Producto> productos) {
        this.idPedido = idpedido;
        this.productos = productos;
    }

    public int getIdpedido() {
        return idPedido;
    }

    public void setIdpedido(int idpedido) {
        this.idPedido = idpedido;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(String nombre, Double precio, int cantidad) {
        Producto producto = new Producto(nombre, precio, cantidad);
        productos.add(producto);
    }

    public void mostrarDetalles() {
        System.out.println(this.toString());

        for (Producto p : productos) {
            System.out.println(p.toString());
        }
    }
    @Override
    public String toString() {
        return "detalles de pedido" + "idpedido=" + idPedido + ", productos=" + productos + '}';
    }


}
