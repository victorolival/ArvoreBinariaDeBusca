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
public class Node {
    
    private Integer valor;
    private Node esq;
    private Node dir;
    
    public Node () {
        valor = null;
        esq = null;
        dir = null;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Node getEsq() {
        return esq;
    }

    public void setEsq(Node esq) {
        this.esq = esq;
    }

    public Node getDir() {
        return dir;
    }

    public void setDir(Node dir) {
        this.dir = dir;
    }
    
    
            
    
}
