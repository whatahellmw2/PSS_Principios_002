/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Papagaio implements IAve {
    @Override
    public void voar(){
        System.out.println("Estou Voando\n");
    }
    @Override
    public void nadar(){
        System.out.println("Não sei nadar");
    }
}
