public class ArraysChallenge5 {
   public static void main(String[] args) {
       int[] array = new int[50];

       for (int i = 0; i < array.length; i++) {
           if(i % 2 == 0){
               System.out.print(i + " ");
           }
           else if(i % 11 == 0){
               System.out.print(i+ " ");
           }
       }
   }
}

