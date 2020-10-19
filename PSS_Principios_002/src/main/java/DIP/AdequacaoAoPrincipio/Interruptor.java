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
public class Interruptor {
    private IDispositivo dispositivo;
    
    public Interruptor(IDispositivo dispositivo){
        this.dispositivo=dispositivo;
    }
    public void Acionar(){
        if(this.dispositivo.isLigado()){
            this.dispositivo.Desligar();
        }else{
            this.dispositivo.Ligar();
        }
    }
}
