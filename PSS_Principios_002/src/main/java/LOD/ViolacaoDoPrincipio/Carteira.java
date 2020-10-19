/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOD.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Carteira {
    private double valor;

    public Carteira(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
    public void subtraiValor(double valor){
        this.valor=this.valor-valor;
    }
}
