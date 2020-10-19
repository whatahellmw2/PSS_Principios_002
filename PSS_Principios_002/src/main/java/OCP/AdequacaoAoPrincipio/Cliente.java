/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCP.AdequacaoAoPrincipio;

/**
 *
 * @author Thiago
 */
public class Cliente implements IUsuario {
     private String nome;
    
    private boolean[] direitos; 

    public Cliente(String nome) {
        this.nome = nome;        
    }
     @Override
     public void setDireitos() {
       boolean[] aux = {false,true,false};
       this.direitos=aux;
    }
     @Override
    public void imprimeUsuario(){
        System.out.println("\nnome: "+this.nome);
        System.out.print("Direitos:");
        for(int i=0;i<3;i++){
            System.out.print(" "+direitos[i]);
        }
    }
}
