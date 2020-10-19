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
public class Lampada {
    private boolean Ligado;
    public void Ligar(){
        this.Ligado=true;
    }
    public void Desligar(){
        this.Ligado=false;
    }

    public boolean isLigado() {
        return this.Ligado;
    }
    public void imprimeEstado(){
        System.out.println("A lampada está ligada? "+this.Ligado);
    }
}
