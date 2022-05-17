public class Main {
    public static void main(String[] args) {

        Consultas.getProductLines();
        System.out.println();
        Consultas.CategoriaMasVendida();
        System.out.println();
        Transacciones.insertarPedido();

    }
}
