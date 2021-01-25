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
public class FibonacciRecursivo {
    int tamano;
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public FibonacciRecursivo(){
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0;
    }
    
    public FibonacciRecursivo(int tamano){
        this.tamano = tamano;
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0;
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
        System.out.println("Fibonacci recursivo de tamano "+tamano+" :");
        for (int i = 0; i < tamano; i++) {
            System.out.print(fibonacci(i)+", ");
        }
        System.out.println();
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    int fibonacci(int x){
        if (x>1){
            return fibonacci(x-1)+fibonacci(x-2);
        }else if (x==1){
            return 1;
        }else if (x==0){
            return 0;
        }else{
            System.out.println("Debes ingrear un numero igual o mayor a 1");
            return -1;
        }
    }
}
