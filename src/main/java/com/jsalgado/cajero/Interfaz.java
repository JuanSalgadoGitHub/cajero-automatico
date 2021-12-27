package com.jsalgado.cajero;
import java.util.Scanner;
public class Interfaz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca su identificación");
        String id = entrada.nextLine();
        System.out.println("Por favor introduzca su contraseña");
        String password = entrada.nextLine();
CajeroAutomatico cajero = new CajeroAutomatico(id, password);



        int ops;
        do {
            System.out.println("______________**************______________");
            System.out.println("\nElija una de las siguientes opciones: \n");
            System.out.println("    Escriba 1 para consultar su saldo.");
            System.out.println("    Escriba 2 para ingresar dinero.");
            System.out.println("    Escriba 3 para sacar dinero.");
            System.out.println("    Escriba 4 para consultar sus últimos movimientos");
            System.out.println("    Escriba 5 para consultar las condiciones legales");
            System.out.println("    Escriba cualquier otro número para salir.");
            ops = entrada.nextInt();
            switch (ops) {
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarSaldo();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                case 5:
                    cajero.mostrarCondicionesLegales();
                    break;
                default:
                    cajero.salir();
            }
        }while (ops == 1 || ops == 2 || ops == 3 || ops == 4 || ops==5) ;

    }
}
