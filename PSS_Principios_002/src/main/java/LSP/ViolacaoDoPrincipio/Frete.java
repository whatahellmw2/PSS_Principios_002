/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Frete {
    private double distancia;
    private double peso; 
    private double valor;

    public Frete(double distancia, double peso) {
        this.distancia = distancia;
        this.peso = peso;
    }
    
    
    public void calcularFrete(){
        
        this.valor=this.peso*this.distancia*0.5;
    }

    public double getValor() {
        return valor;
    }
    
}
