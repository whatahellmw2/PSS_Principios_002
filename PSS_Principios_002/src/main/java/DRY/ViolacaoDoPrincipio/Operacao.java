/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DRY.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Operacao {
    private String tipo;
    private double valor;

    public Operacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    

    @Override
    public String toString() {
        return "tipo: "+this.tipo+" valor: "+this.valor;
    }
    
}
