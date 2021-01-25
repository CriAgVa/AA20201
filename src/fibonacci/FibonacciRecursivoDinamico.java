/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Cri
 */
public class FibonacciRecursivoDinamico {
    int tamano;
    int[] contenedor;
    int posicionClave;
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public FibonacciRecursivoDinamico(){
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0;
    }
    
    public FibonacciRecursivoDinamico(int tamano){
        this.tamano = tamano;
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0;
        this.contenedor = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            this.contenedor[i] = 0;    
        }
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public long gettTotal() {
        return tTotal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettFinal() {
        return tFinal;
    }
    
    public void mostrarSerie(){
        this.tInicio = System.currentTimeMillis();
        System.out.println("Fibonacci recursivo dinamico de tamano "+tamano+" :");
        int[] aux = new int[tamano];
        aux = guardarArreglo();
        
        for (int i = 0; i < tamano; i++) {
            System.out.print(aux[i]+", ");
        }
        System.out.println();
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public int fibonacci(int x){
        int aux, aux_1, aux_2;
        if (x > 1){
            aux_1 = x-1;
            aux_2 = x-2;
            
            if(comprobarRepeticion(aux_1) == true){
                aux_1 = contenedor[posicionClave];
            }else{
                aux_1 = fibonacci(aux_1);
            }
            
            if (comprobarRepeticion(aux_2) == true){
                aux_2 = contenedor[posicionClave];
            }else{
                aux_2 = fibonacci(aux_2);
            }
            
            return aux = aux_1 + aux_2;
        }else if (x == 1){
            return 1;
        }else if (x == 0){
            return 0;
        }else{
            System.out.println("Debes ingrear un numero igual o mayor a 1");
            return -1;
        }
    }
    
    public int[] guardarArreglo(){
        this.tInicio = System.currentTimeMillis();
        for (int i = 0; i < tamano; i++){
            switch (i){
                case (0):
                    contenedor[0] = 0;
                    
                    break;
                case (1):
                    contenedor[1] = 1;
                    
                    break;
                case (2):
                    contenedor[2] = 1;
                    
                    break;
                default:
                    contenedor[i] = fibonacci(i);
                    
                    break;
            }
            
        }
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
        
        return contenedor;
    }
    
    public boolean comprobarRepeticion(int x){
        boolean prueba = false;
        
            if (contenedor[x] != 0){
                prueba = true;
                posicionClave = x;
            }else{
                prueba = false;
            }
        
        
        return prueba;
    }
}