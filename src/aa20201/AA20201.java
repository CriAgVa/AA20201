/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa20201;

import aa20201.data.Grafica;
import busquedas.BusquedaSecuencial;
import busquedas.Busquedas;
import busquedas.GeneradorDatos;
import fibonacci.FibonacciIterativo;
import fibonacci.FibonacciIterativoDinamico;
import fibonacci.FibonacciRecursivo;
import fibonacci.FibonacciRecursivoDinamico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ordenamiento.Burbuja;
import ordenamiento.BurbujaOptimizada;
import ordenamiento.InsertionSort;
import ordenamiento.MergeSort;
import ordenamiento.QuickSort;
import tsp.Ciudad;
import tsp.MatrizAleatoria;
import tsp.TSP;
/**
 *
 * @author working
 */
public class AA20201 {

    public static void main(String[] args) {
        int n = 4;
        int limite = 1000;
        double matriz[][] = new double[n][n];
        BurbujaOptimizada bO = new BurbujaOptimizada();
        ArrayList<Ciudad> a = new ArrayList();  
        MatrizAleatoria mA = new MatrizAleatoria(n, limite);
        
        matriz = mA.generarMatriz();
        
        TSP tsp = new TSP(matriz, 1);
        
        tsp.limpiarMatriz(n, matriz, a);
        
        int ruta[];
        ruta = tsp.generarMejorRuta(n, matriz, bO, a);
        
        for (int i = 0; i < ruta.length; i++) {
            System.out.println(ruta[i]);
            
        }
    }
    
}
