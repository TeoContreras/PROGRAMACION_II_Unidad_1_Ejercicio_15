public class main {
    public static void main(String[] args) {
        TanqueAgua tanque = new TanqueAgua(1000, 300);

        tanque.llenar(500);
        tanque.consumir(200);

        System.out.println("Porcentaje de llenado: " + tanque.obtenerPorcentajeLlenado() + "%");
    }
}
