/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSP.ViolacaoDoPrincipio;

import jdk.jfr.Frequency;

/**
 *
 * @author Thiago
 */
public class FreteGratis extends Frete{
    private double distancia;
    private double peso; 
    private double valor;

    public FreteGratis(double distancia, double peso) {        
        super(distancia, peso);
    }
    
    @Override
    public void calcularFrete(){
        System.out.println("Frete é gratis");
    }


    
}
