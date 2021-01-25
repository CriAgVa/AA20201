/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.util.Random;

/**
 *
 * @author Cri
 */
public class MatrizAleatoria {
    int n;
    int limite;

    public MatrizAleatoria(int n, int limite) {
        this.n = n;
        this.limite = limite;
    }
    
    public double[][] generarMatriz(){
        double matriz[][] = new double[n][n];
        double aux;
        Random r = new Random();
        
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (x == y){
                    matriz[x][y] = 0;
                }else{
                    aux = r.nextDouble();
                    matriz[x][y] = aux;
                    matriz[y][x] = aux;
                }
            }
        }
        return matriz;
    }
}
