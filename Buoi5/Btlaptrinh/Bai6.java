import java.io.*;
import java.util.*;

public class Bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);
    }

    public static int partion(int [] arr ,int l , int r  ){
        int pivot = arr[r];
        int i = l-1;
        int j = 0 ;
        for ( j =0 ; j< arr.length ; j++){
            if ( arr[i] <= pivot){
                i+=1;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
            
        }
        i+=1;
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;

        return i;

    }

    public static void quickSort(int [] arr , int l , int r ){
        if ( l< r ){
            int p = partion(arr, l, r);

            printArray(arr);


            quickSort(arr,l,p-1);
            quickSort(arr, p+1, r);


        }

    }
    public static void printArray(int [] arr ){
        for ( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : " "));
        }
        System.out.println();
        }
}