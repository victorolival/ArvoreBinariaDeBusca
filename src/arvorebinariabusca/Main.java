/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinariabusca;

/**
 *
 * @author fabio.tpereiro
 */
public class Main {
    
    public static void main (String [] args) {
        
        ABB arvore = new ABB ();
        arvore.inserirValor(7);
        arvore.inserirValor(4);
        arvore.inserirValor(5);
        arvore.inserirValor(2);
        arvore.inserirValor(6);
        arvore.inserirValor(10);
        arvore.inserirValor(8);
        arvore.inserirValor(11);
        arvore.inserirValor(12);
        arvore.inserirValor(9);
        
        
        
        arvore.print();
        arvore.printEmOrdem();
        System.out.println ();
        System.out.println(arvore.getMax());
        System.out.println(arvore.getSoma ());
        
        arvore.removeValor(4);
        arvore.print();
        
        arvore.removeValor(7);
        arvore.print();
        
        arvore.removeValor(10);
        arvore.print();
    
    }
    
    
    
}
