public class ArraysChallenge2 {
   public static void main(String[] args) {
       int[] array = new int[50];

       System.out.println("\nOriginal array:");
       for (int i = 0; i < array.length; i++) {
           array[i] = (int) (Math.random() * 100);
           System.out.print(array[i] + " ");
       }
       System.out.println("\n\nEven numbers and divisible by 11 only values");
       for (int i = 0; i < array.length; i++) {
           if(array[i] % 2 == 0){
               System.out.print(array[i] + " ");
           }
           else if (array[i] % 11 == 0){
               System.out.print(array[i] + " ");
           }
       }
   }
}
