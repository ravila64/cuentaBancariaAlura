public class CuentaBancaria {
    public static void main(String[] args) {
        String nombre = "Rene Avila A";
        String tipoCuenta="Corriente";
        double saldo = 1599.99;

        System.out.println("************************");
        System.out.println("\nNombre del cliente "+nombre);
        System.out.println("Tipo de cuenta "+tipoCuenta);
        System.out.println("Saldo US$"+saldo);

        String menu = """
           ** Seleccion opción **
           1.- Saldo de cuenta
           2.- Retirar
           3.- Consignar
           9.- Salir     
                """;
        System.out.println(menu);
    }
}
