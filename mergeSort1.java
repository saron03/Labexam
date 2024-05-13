import java.util.Scanner;
public class mergeSort1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the list:");
        int lengthofArray = input.nextInt();
        int[] array = new int[lengthofArray];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < lengthofArray; i++) {
            array[i] = input.nextInt();
        }
        mergeSort(array);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Enter a number to be searched: ");
        int searchedNumber = input.nextInt();
        int count = 0;
        for (int num : array) {
            if (num == searchedNumber) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(searchedNumber + " appears " + count + " times in the array.");
        } else {
            System.out.println(searchedNumber + " is not present in the array.");
        }
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        // Merge
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftH, int[] rightH) {
        int leftSize = leftH.length;
        int rightSize = rightH.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftH[i] <= rightH[j]) {
                inputArray[k] = leftH[i];
                i++;
            } else {
                inputArray[k] = rightH[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputArray[k] = leftH[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightH[j];
            j++;
            k++;
        }
    }
}
