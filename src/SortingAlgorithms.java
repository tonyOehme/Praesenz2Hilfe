import java.util.Arrays;

public class SortingAlgorithms {
    public static int[] merge(int[] one, int[] two) {

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


        while(twoPointer < two.length){
            sorted[sortedPointer++] = two[twoPointer++];
        }

        while(onePointer < one.length){
            sorted[sortedPointer++] = one[onePointer++];
        }

        return sorted;

    }

    public static int[] mergeSort(int[] arrayToSort) {;

        if(arrayToSort.length < 2){
            return arrayToSort;
        }

        int middle = arrayToSort.length / 2;

        int[] rightHalf = mergeSort(Arrays.copyOfRange(arrayToSort, 0, middle));
        int[] leftHalf = mergeSort(Arrays.copyOfRange(arrayToSort, middle, arrayToSort.length));

        return merge(rightHalf, leftHalf);
    }


}
