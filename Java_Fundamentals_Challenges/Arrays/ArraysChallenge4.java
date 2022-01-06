public class ArraysChallenge4 {
   public static void main(String[] args) {
       int[] array = new int[50];

       System.out.println("\nOriginal array:");
       for (int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.random() * 100);
           System.out.print(array[i] + " ");
       }
       System.out.println("\nIncremented each value by 1 array:");
       for (int i = 0; i < array.length; i++) {
           array[i] = array[i] + 1;
           System.out.print(array[i] + " ");
       }
       System.out.println();
   }
}
