public class bubblesortAlphabet {
	public static void main(String[] args) {
		char[] array = {'w', 's', 'f', 'r'};
		bubbleSort(array);
		System.out.println("Sorted array:");
		for (char c : array) {
			System.out.print(c + " ");
		}
	}
	public static void bubbleSort(char[] array) {
		int n = array.length;
		for (int i = n-1; i >=0; i--) {
		            for (int j = 0; j < i; j++) {
		            	if (array[j] > array[j+1]) {
		            		char temp = array[j];
		                    array[j] = array[j+1];
		                    array[j+1] = temp;
		                }
		            }
		 }
   }
}
