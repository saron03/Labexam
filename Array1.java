public class Array1 {
	public static void main(String[] args) {
		        int[] array = {3, 7, 1, 9, 4,5};
		        
		        int indexToDelete = 2;
		        int[] modifiedArray = deleteElement(array, indexToDelete);
		        System.out.print("Modified Array is: ");
		            for (int num : modifiedArray) {
		                System.out.print(num + " ");
		            }
	}
	public static int[] deleteElement(int[] array, int index) {
		        if (index < 0 || index >= array.length) {
		            System.out.println("Invalid index.");
		            return array;
		        }
		        int[] modifiedArray = new int[array.length - 1];
		        for (int i = 0, j = 0; i < array.length; i++) {
		            if (i != index) {
		                modifiedArray[j++] = array[i];
		            }
		        }
		        return modifiedArray;
		    }
	}
