/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.util.ArrayList;
import ordenamiento.Burbuja;
import ordenamiento.BurbujaOptimizada;

/**
 *
 * @author Cri
 */
public class TSP {
    double matrizPrueba[][];
    int ciudadInicio;
    
    public TSP(double[][] matrizPrueba, int ciudadInicio) {
        this.matrizPrueba = matrizPrueba;
        this.ciudadInicio = ciudadInicio;
    }
    
    public void limpiarMatriz(int n, double auxiliar[][], ArrayList<Ciudad> ciudad){
        int c = 0;
        
        System.out.println();
        System.out.println("Matriz Original: ");
        for (int x = 0; x < n; x++) {
            System.out.println();
            for (int y = 0; y < n-1; y++) {
                System.out.print(auxiliar[x][y]+", ");
            }
            
        }
        
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (x != y){
                    auxiliar[x][c] = matrizPrueba[x][y];
                    Ciudad e = new Ciudad();
                    e.setDistancia(auxiliar[x][c]);
                    e.setIndice(y);
                    ciudad.add(e);
                    c++;
                    System.out.println();
                }
            }
            c = 0;
        }
        System.out.println();
        System.out.println("Matriz sin 0: ");
        for (int x = 0; x < n; x++) {
            System.out.println();
            for (int y = 0; y < n-1; y++) {
                System.out.print(auxiliar[x][y]+", ");
            }
            
        }
        
        System.out.println();
        System.out.println("Matriz de Ciudades: ");
        for (int x = 0; x < ciudad.size(); x++) {
            System.out.print("Indice: "+ciudad.get(x).getIndice());
            System.out.print(" Distancia: "+ciudad.get(x).getDistancia());
            System.out.println();
        }
    }
    
    public int[] generarMejorRuta(int n, double auxiliar[][], BurbujaOptimizada bO, ArrayList<Ciudad> ciudad){
        double ordenar[] = new double[n-1];
        boolean visitado[] = new boolean[n];
        int ruta[] = new int[n];
        int indiceAux;
        double c = 0;
        double temporal;
        int cRuta = 0;
        int ciudadTemporal = 0;
        
        ruta[cRuta] = ciudadInicio;
        cRuta++;
        visitado[ciudadInicio] = true;
        
            
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (i == 0){
                    ordenar[j] = auxiliar[ciudadInicio][j]; 
                    ciudadTemporal = ciudadInicio;
                }else{
                    ordenar[j] = auxiliar[i][j];
                    
                }
            }
            bO.ordenar(ordenar);
            temporal = ordenar[0];
            
            for(indiceAux = ciudadTemporal*(ordenar.length); indiceAux < ciudad.size() ; indiceAux++){
                System.out.println();
                if ((temporal == ciudad.get(indiceAux).getDistancia()) && (visitado[ciudad.get(indiceAux).getIndice()] == false)){
                    
                    
                    ruta[cRuta] = ciudad.get(indiceAux).getIndice();
                    cRuta++;
                    visitado[ciudad.get(indiceAux).getIndice()] = true;
                    
                    
                    System.out.println();
                    break;
                }
                    ciudadTemporal = 0;
            }
            }          
        return ruta;
    }
}
