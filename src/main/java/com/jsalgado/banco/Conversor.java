package com.jsalgado.banco;

import java.math.BigDecimal;
import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double euros, tasa_cambio;
        System.out.println("Bienvenido al conversor de monedas.");
        System.out.println("Por favor, introduzca una cantidad de euros '€' para cambiarlos a dólar Americano '$'.");
        euros = entrada.nextInt();
        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
        tasa_cambio = 1.09;
        String tasa_cambioString = Double.toString(tasa_cambio);
        BigDecimal tasa_cambioBigDecimal = new BigDecimal(tasa_cambioString);
        BigDecimal ussBigDecimal = eurosBigDecimal.multiply(tasa_cambioBigDecimal);
        System.out.println(euros +" € equivalen a "+ussBigDecimal.toString()+" $.");
    }
}
