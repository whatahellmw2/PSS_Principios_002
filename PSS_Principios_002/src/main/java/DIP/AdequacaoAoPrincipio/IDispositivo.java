/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP.AdequacaoAoPrincipio;

/**
 *
 * @author Thiago
 */
public interface IDispositivo {
    public void Ligar();
    public void Desligar();

    public boolean isLigado();
    public void imprimeEstado();
}
