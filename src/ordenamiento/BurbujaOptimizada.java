/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Cri
 */
public class BurbujaOptimizada {
    int indice;
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public BurbujaOptimizada() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0;
    }
  
    public void ordenar(double[] datos){
        this.tInicio = System.currentTimeMillis();
        ordenarDatos(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }
    
    private void ordenarDatos(double[] datos) { 
        for (int i = 1; i < datos.length-1; i++) {
            boolean is_sorted = true;
            
            for (int j= 0; j < datos.length-1; j++){
                if (datos[j] > datos[j+1]){
                    double temp = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = temp;
                    is_sorted = false;
                }
            }
            if (is_sorted){
                return;
            }
        }
    }       
}
