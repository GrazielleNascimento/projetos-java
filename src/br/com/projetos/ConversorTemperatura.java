/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetos;

import java.util.Scanner;

/**
 *
 * @author grazi
 */
public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        System.out.println("Digite a temperatura em Celsius: ");
        
        double celsius = scan.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println( celsius + " ºC equivale a " +  fahrenheit + "ºF");
    }
    
}
