public class SortingArrays3 {
    public static void main(String[] args) {
        int[] array = new int[50];


        array[19] = 60;
        array[20] = 61;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
		System.out.println();
    }
}
