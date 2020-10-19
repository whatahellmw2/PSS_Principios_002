/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSP.AdequacaoAoPrincipio;

import LSP.ViolacaoDoPrincipio.*;
import jdk.jfr.Frequency;

/**
 *
 * @author Thiago
 */
public class FreteGratis{
    private double distancia;
    private double peso;    

    public FreteGratis(double distancia, double peso) {
        this.distancia = distancia;
        this.peso = peso;
    }

   
    
    
    public double calcularFrete(){
        System.out.println("Este frete é gratis");
        return 0;
    }


    
}
