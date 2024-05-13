import java.util.Scanner;
public class repeated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the list:");
        int lengthofArray = input.nextInt();
        int[] array = new int[lengthofArray];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < lengthofArray; i++) {
            array[i] = input.nextInt();
        }
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
}