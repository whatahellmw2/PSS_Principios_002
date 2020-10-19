/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SRP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class PassagemAerea {
    private String Destino;
    private double Valor;

    public PassagemAerea(String Destino, double Valor) {
        this.Destino = Destino;
        this.Valor = Valor;
    }

    public String getDestino() {
        return Destino;
    }

    public double getValor() {
        return Valor;
    }
    
}
