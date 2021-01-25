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
public class MergeSort {
    
    public long tInicio;
    public long tFinal;
    public long tTotal;
    
    public MergeSort() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
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
    
    public void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }for (int i = 0; i < n2; i++) {
            R[i] = arr[m+1+i];
        }
        int i=0, j=0;
        
        int k =l;
        
        while (i<n1 && j<n2) {            
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public int[] sort(int arr[], int l, int r){
        this.tInicio = System.currentTimeMillis();
        if(l<r){
            int m=(l+r)/2;
            
            sort(arr, l, m);
            sort(arr, m+1, r);
            
            merge(arr, l, m, r);
        }
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
        return arr;
    }
    
    public void printArray(int arr[]){
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
