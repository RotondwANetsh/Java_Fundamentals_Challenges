public class ArraysChallenge1 {
   public static void main(String[] args) {
       int[] array = {61,72,83,94,55,56,57,58,59,100,111,121,130,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};

       System.out.println("Original array:");
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println("\nIncremented each value by 1 array:");
       for (int i = 0; i < array.length; i++) {
           array[i] = i + 1;
           System.out.print(array[i] + " ");
       }
       System.out.println();
   }
}
