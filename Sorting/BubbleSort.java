package Sorting;

public class BubbleSort
 {
    public static void main(String[] args){
        int[] arr = {5, 1, 4, 2, 8};

        // bubblesort

        //  increasing order 

        // time-complexity  = O(n^2) and space-complexity = O(1)
        for(int i =0; i<arr.length; i++){ // n-1 times 
            for(int j =0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){ // for decreasing order change > to <
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // print sorted array
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }



    }

    
}
