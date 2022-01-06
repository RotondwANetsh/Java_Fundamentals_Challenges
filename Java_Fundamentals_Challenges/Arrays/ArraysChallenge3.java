public class ArraysChallenge3 {
   public static void main(String[] args) {
       int[] array = new int[50];
       int i = 0,  j = 0;

       System.out.println("\nOriginal array:");
       while (i < array.length){
           array[i] = (int) (Math.random() * 100);
           System.out.print(array[i] + " ");
           i++;
       }
       System.out.println("\n\nEven numbers and divisible by 11 only values");
       while (j < array.length) {

           int even = array[j] % 2;
           int divisible = array[j] % 11;

           switch (even){
               case 0:
                   System.out.print(array[j] + " ");
                   break;
           }
           switch (divisible){
               case 0:
                   System.out.print(array[j] + " ");
                   break;
           }
           j++;
       }
   }
}
