package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        for(int i = 0; i < arr.length - 1; i++) {

            int smallest = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}