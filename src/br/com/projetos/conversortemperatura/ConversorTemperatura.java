/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetos.conversortemperatura;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Escolha a escala (C)Celsius ou (F) Fahrenheit: ");
        String escalaTemperatura = scan.next().toLowerCase();

        System.out.println("Digite a temperatura: ");
        double numTemperatura = scan.nextDouble();

        if (escalaTemperatura.equals("c")) {

            double fahrenheit = (numTemperatura * 9 / 5) + 32;

            System.out.println("A conversao de " + numTemperatura + "ºC equivale a " + df.format(fahrenheit)  + "ºF");

        } else if (escalaTemperatura.equals("f")) {

            Double celsius = (numTemperatura - 32) * 5 / 9;
            System.out.println("A conversao de " + numTemperatura + "ºF equivale a " + df.format(celsius) + "ºC");
        }

    }

}
