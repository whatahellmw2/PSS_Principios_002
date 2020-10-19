/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP.AdequacaoAoPrincipio;

import DIP.ViolacaoDoPrincipio.*;

/**
 *
 * @author Thiago
 */
public class Teste {
    public static void main(String args[]){
        System.out.println("COM principio DIP\n");
        IDispositivo led = new Lampada();
        IDispositivo thermaltalke = new FonteComputador();
        
        Interruptor interruptor= new Interruptor(led);
        
        interruptor.Acionar();
        led.imprimeEstado();
        interruptor.Acionar();//interruptor sabe ligar apenas lampada
        led.imprimeEstado();
        
        Interruptor interruptor2= new Interruptor(thermaltalke);
        
        interruptor2.Acionar();
        thermaltalke.imprimeEstado();
        interruptor2.Acionar();//interruptor sabe ligar apenas lampada
        thermaltalke.imprimeEstado();
    }
    
}
