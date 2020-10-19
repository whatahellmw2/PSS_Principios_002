/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRP.ViolacaoDoPrincipio;

/**
 *
 * @author Thiago
 */
public class Teste {
    public static void main(String args[]){
        System.out.println("SEM princicio CRP\n");
        Funcionario manu= new Programador("manu", "5247",3000 );
        Funcionario cleber = new Faxineiro("cleber", "2214", 1500);
        
        manu.calculaBonus();
        cleber.calculaBonus();
        
        manu.imprimeFuncionario();
        cleber.imprimeFuncionario();
    }
}
