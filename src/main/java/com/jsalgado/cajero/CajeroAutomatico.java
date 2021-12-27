package com.jsalgado.cajero;

import com.jsalgado.banco.CuentaAhorro;
import com.jsalgado.banco.CuentaBancaria;
import com.jsalgado.mock.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
private CuentaBancaria cuentaBancariaActual;
protected CajeroAutomatico(String id, String password){
    //Aquí iría la "Conexión con la bd", pero es una simulación
    double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
    cuentaBancariaActual = new CuentaAhorro("Nombre cualquiera", cantidadAleatoria);
}
    protected void mostrarSaldo(){
    System.out.println("Su saldo es "+cuentaBancariaActual.obtenerSaldo());
    }

    protected void ingresarSaldo(){
        System.out.println("¿Cuánto dinero desea ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextFloat();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    protected void sacarDinero(){
        System.out.println("¿Cuánto dinero desea sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextFloat();
        cuentaBancariaActual.sacarDinero(cantidad);
    }
    protected void consultarUltimosMovimientos(){
GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("¿Cuántos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "euro");
        mostrarMovimientos(movimientos);
    }

    private void mostrarMovimientos(ArrayList<String> movimientos){
    for (String movimiento: movimientos){
        System.out.println(movimiento);
    }
    }
protected void mostrarCondicionesLegales(){
    cuentaBancariaActual.informarSobreCondicionesLegales();
}
    protected void salir(){
        System.out.println("Muchas gracias por utilizar nuestros servicios..." +
                "\nTenga buen día... ");
    }
}