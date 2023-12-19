import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] hahahihi = new int[]{4,5, 3,7, 3, 10, 3,11, 2,12, 1, 13};
        bubbleSort(hahahihi);
        System.out.println(Arrays.toString(hahahihi));
    }
    public static void bubbleSort(int[] array){ // runs in O(n^2) time
        //compares each element to its next and swaps it if left element greater than next
        //for each index
        for(int i = array.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j +1] = temp;
                }
            }
        }

    }
    public static int[] merge(int[] one, int[] two) { // runs in O(n * log n ) time

        int[] sorted = new int[one.length + two.length];

        int onePointer, twoPointer, sortedPointer;
        onePointer = twoPointer = sortedPointer = 0;

        while(onePointer < one.length && twoPointer < two.length){
            if(one[onePointer] <= two[twoPointer]){
                sorted[sortedPointer++] = one[onePointer++];
            } else {
                sorted[sortedPointer++] = two[twoPointer++];
            }
        }

        // onepointer == one.length but twoPointer does not
        while(twoPointer < two.length){
            sorted[sortedPointer++] = two[twoPointer++];
        }
        //same thing as above but reversed
        while(onePointer < one.length){
            sorted[sortedPointer++] = one[onePointer++];
        }

        return sorted;

    }

    public static int[] mergeSort(int[] arrayToSort) {;
        //sorting arrays with one or less elements is trivial
        if(arrayToSort.length < 2){
            return arrayToSort;
        }

        int middle = arrayToSort.length / 2;
        //sorts array by sorting two halves
        int[] rightHalf = mergeSort(Arrays.copyOfRange(arrayToSort, 0, middle));
        int[] leftHalf = mergeSort(Arrays.copyOfRange(arrayToSort, middle, arrayToSort.length));
        //merge two sorted halves
        return merge(rightHalf, leftHalf);
    }




}
