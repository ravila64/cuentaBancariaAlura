import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        String nombre = "Rene Avila A";
        String tipoCuenta="Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        Scanner tecla = new Scanner(System.in);

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
        while(opcion != 9){
            System.out.println(menu);
            System.out.print("Seleccione opcion -->");
            opcion = tecla.nextInt();
            switch (opcion){
                case 1:{
                    System.out.println("Saldo actualizado: $" + saldo);
                    break;
                }
                case 2:{
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    int valorARetirar = tecla.nextInt();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: $" + saldo);
                    }
                    break;
                }
                case 3:{
                    System.out.println("¿Cuál es el valor a consignar?");
                    int deposito = tecla.nextInt();
                    if (deposito > 0) {
                        saldo = saldo + deposito;
                    }else{
                        System.out.println("El deposito no puede ser 0 o negativo");
                    }
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;
                }
                case 9:{
                    System.out.println("Sale del programa, fin de la transaccion");
                    break;
                }
                default:
                    System.out.println("Opcion Errada !!!");
            }
        }
    }
}
