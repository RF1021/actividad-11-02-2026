import java.util.*;


public class Pedido {
    private String idpedido;
    private List<Producto> canasta = new ArrayList<>();

    public Pedido(String idpedido) {
        this.idpedido = idpedido;
    }

    public String getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(String idpedido) {
        this.idpedido = idpedido;
    }
    public List<Producto> getCanasta() {
        return canasta;
    }

    public void setCanasta(List<Producto> canasta) {
        this.canasta = canasta;
    }

    public void agregar (Producto producto){
        this.canasta.add(producto);
    }
    public void mostrar_canasta() {
        for (Object a : canasta) {
            System.out.println(a.toString());
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idpedido='" + idpedido + '\'' +
                ", canasta=" + canasta +
                '}';
    }
}
