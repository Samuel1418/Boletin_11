/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Teampo {
 
    public void medirTempo(){
    long time_start, time_end; 
    String a;
    String b="A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica";
JOptionPane.showMessageDialog(null, "Introduzxa la siguiente frase");
JOptionPane.showMessageDialog(null, "A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica");
time_start = System.currentTimeMillis();
do{
    
 a= JOptionPane.showInputDialog(null, "A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica");
}while(b == null ? a != null : !b.equals(a));
    time_end = System.currentTimeMillis();
System.out.println("Tardaches "+ (( time_end - time_start )/1000) +" segundos en escribir a frase");
    }
}

