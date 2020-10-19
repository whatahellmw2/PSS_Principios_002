/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Teste {
    public static void main(String args[]){
        System.out.println("SEM principio DIP\n");
        Lampada led = new Lampada();
        Interruptor interruptor= new Interruptor(led);
        interruptor.Acionar();
        led.imprimeEstado();
        interruptor.Acionar();//interruptor sabe ligar apenas lampada
        led.imprimeEstado();
    }
    
}
