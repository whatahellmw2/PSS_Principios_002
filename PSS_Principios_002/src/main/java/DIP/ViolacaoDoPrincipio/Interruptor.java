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
public class Interruptor {
    private Lampada lampada;
    
    public Interruptor(Lampada lampada){
        this.lampada=lampada;
    }
    public void Acionar(){
        if(this.lampada.isLigado()){
            this.lampada.Desligar();
        }else{
            this.lampada.Ligar();
        }
    }
}
