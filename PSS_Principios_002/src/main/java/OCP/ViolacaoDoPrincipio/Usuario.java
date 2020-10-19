/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Usuario {
    private String nome;
    private String tipo;
    private boolean[] direitos; 

    public Usuario(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setDireitos(boolean[] direitos) {
        this.direitos = direitos;
    }
    public void imprimeUsuario(){
        System.out.println("\nnome: "+this.nome);
        System.out.print("Direitos:");
        for(int i=0;i<3;i++){
            System.out.print(" "+direitos[i]);
        }
    }
}
