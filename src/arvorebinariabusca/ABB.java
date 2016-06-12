/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinariabusca;

/**
 *
 * @author victor.rolival
 */
public class ABB {
    
    private Node raiz;
    
    public void printEmOrdem () {
        percursoEmOrdem(raiz);
    }
    
    public ABB () {
        raiz = null;
    }
    
    public void inserirValor (Integer valor) {
        if (raiz == null) {
            raiz = new Node ();
            raiz.setValor(valor);
            return;
        }
        inserirValorAux(valor, raiz);
        
            
    }
    
    private void inserirValorAux (Integer valor, Node no) {
        if (valor < no.getValor()) {
            if (no.getEsq() == null) {
                Node filhoEsq = new Node();
                filhoEsq.setValor(valor);
                no.setEsq(filhoEsq);
                return;
            } else {
                inserirValorAux(valor,no.getEsq());
                return;
            }
        } else {
            if (no.getDir() == null) {
                Node filhoDir = new Node();
                filhoDir.setValor(valor);
                no.setDir(filhoDir);
                return;
            } else {
                inserirValorAux(valor,no.getDir());
                return;
            }
        }
    }

    
    public void print () {
        printAux(raiz, 0);
    }
    
    private void printAux (Node no, Integer nivel) {
        
        for (int i=0; i< nivel; i++) {
            System.out.print("\t");
        }
        if (no == null) {
            System.out.println("\\- NULO");
            return;
        }
        else 
            System.out.println("\\- " + no.getValor());        
        printAux(no.getEsq(), nivel+1);
        printAux(no.getDir(), nivel+1);
    }
    
    public void percursoEmOrdem (Node no) {
        if (no.getEsq()!=null)
            percursoEmOrdem(no.getEsq());
        System.out.print(no.getValor()+",");
        if (no.getDir()!=null)
            percursoEmOrdem(no.getDir());
    }
    
    
    public int getMax () {
        return getMaxAux(raiz, Integer.MIN_VALUE);
    }
    
    private int getMaxAux (Node no, Integer valor) {
        Integer v = valor;
        if (no.getValor()> v)
            v = no.getValor();
        if (no.getEsq()!= null) {
            Integer esq = getMaxAux(no.getEsq(), v);
            if (esq > v)
                v = esq;
        }
        if (no.getDir()!= null) {
            Integer dir = getMaxAux(no.getDir(), v);
            if (dir > v)
                v = dir;
        }
        return v;
        
    }
    
    public int getSoma () {
        return getSomaAux(raiz);
    }
    
    public int getSomaAux (Node no) {
        if (no == null)
            return 0;
        return no.getValor() + getSomaAux(no.getEsq()) + getSomaAux(no.getDir());
    }
    
    public void removeValor (int valor) {
        if (valor == raiz.getValor()){
            if (raiz.getEsq() != null){
                int aux = getMaxAux(raiz.getEsq(), Integer.MIN_VALUE);
                removeValorAux(aux, raiz);
                raiz.setValor(aux);
            }
        }
        else {
            removeValorAux(valor, raiz);
        }
    }
    
    public void removeValorAux (int valor, Node no){
        if (valor < no.getValor()) {
            if (no.getEsq().getValor() == valor){
                Node noaux = no.getEsq();
                if (noaux.getEsq() == null & noaux.getDir() == null){
                    no.setEsq(null);
                }
                else{
                    if(noaux.getEsq() == null){
                        no.setEsq(noaux.getDir());
                    }
                    else{
                        no.setEsq(noaux.getEsq());
                        if(no.getEsq().getDir() == null){
                            no.getEsq().setDir(noaux.getDir());
                        }
                        else{
                            no.getEsq().getDir().setDir(noaux.getDir());
                        }
                    }
                }  
            }
            else{
                removeValorAux(valor, no.getEsq());
            }
        }
        
        if (valor > no.getValor()) {
            if (no.getDir().getValor() == valor){
                Node noaux = no.getDir();
                if (noaux.getEsq() == null & noaux.getDir() == null){
                    no.setDir(null);
                }
                else{
                    if(noaux.getEsq() == null){
                        no.setDir(noaux.getDir());
                    }
                    else{
                        no.setDir(noaux.getEsq());
                        if(no.getDir().getDir() == null){
                            no.getDir().setDir(noaux.getDir());
                        }
                        else{
                            no.getDir().getDir().setDir(noaux.getDir());
                        }
                    }
                }  
            }
            else{
                removeValorAux(valor, no.getDir());
            }
        }
    }
            
         
    
}
