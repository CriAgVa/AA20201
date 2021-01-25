/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

/**
 *
 * @author Cri
 */
public class Ciudad {
    int indice;
    double distancia;

    public Ciudad() {
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getIndice() {
        return indice;
    }
    
    
}
