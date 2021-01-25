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
public class FibonacciIterativo {
    int n1;
    int n2;
    int tamano;
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public FibonacciIterativo(){
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0;
    }
    
    public FibonacciIterativo(int tamano){
        n1 = 0;
        n2 = 1;
        this.tamano=tamano;
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0;
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

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }
    
    public void fibonacci(){
        this.tInicio = System.currentTimeMillis();
        switch(tamano){
            case (0):
                System.out.println("Fibonacci iterativo de tamano "+tamano+" :");
                
                break;
            case (1):
                System.out.println("Fibonacci iterativo de tamano "+tamano+" :");
                System.out.print(n1+", ");
                
                break;
            case (2):
                System.out.println("Fibonacci iterativo de tamano "+tamano+" :");
                System.out.print(n1+", ");
                System.out.print(n2+", ");
                
                break;
            default:
                System.out.println("Fibonacci iterativo de tamano "+tamano+" :");
                System.out.print(n1+", ");
                System.out.print(n2+", ");

                for (int i = 0; i < tamano-2; i++) {
                    n2 = n1 + n2;
                    n1 = n2 - n1;
                    System.out.print(n2+", ");
                }

                
                
                break;
        }
        
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
}
