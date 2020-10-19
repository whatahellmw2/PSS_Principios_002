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
public class Lampada implements IDispositivo{
    private boolean Ligado;
    @Override
    public void Ligar(){
        this.Ligado=true;
    }
    @Override
    public void Desligar(){
        this.Ligado=false;
    }

    @Override
    public boolean isLigado() {
        return this.Ligado;
    }
    @Override
    public void imprimeEstado(){
        System.out.println("A lampada está ligada? "+this.Ligado);
    }
}
