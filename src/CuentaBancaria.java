public class CuentaBancaria {
    public static void main(String[] args) {
        String nombre = "Rene Avila A";
        String tipoCuenta="Corriente";
        double saldo = 1599.99;

        System.out.println("************************");
        System.out.println("Nombre del cliente "+nombre);
        System.out.println("Tipo de cuenta "+tipoCuenta);
        System.out.println("Saldo US$"+saldo);
        System.out.println("************************");
        String menu = """
           **       MENU      **
           1.- Saldo de cuenta
           2.- Retirar
           3.- Consignar
           9.- Salir     
                """;
        System.out.println(menu);
        System.out.print("Seleccione opcion -->");
    }
}
