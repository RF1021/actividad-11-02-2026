public class Main {
    public static void main(String[] args) {
        Producto c1 = new Producto("100","filete de atun",25000);
        Producto c2 = new Producto("1149","vino blanco",30000);
        Pedido p1 = new Pedido("45693");
        p1.agregar(c1);
        p1.agregar(c2);
        p1.mostrar_canasta();

    }
}