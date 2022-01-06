public class ArraysChallenge11 {
   public static void main(String[] args) {
       int[][] loop = new int[100][30];

       System.out.println("Original Array Values:");
       for (int i = 0; i < loop.length; i++) {
           for (int j = 0; j < loop[j].length; j++) {
               loop[i][j] = (int) (Math.random() * 100);
               System.out.print(loop[i][j] + " ");
           }
           System.out.println();
       }
       System.out.println("\nEven numbers and Divisible by 11");
       for (int i = 0; i < loop.length ; i++) {
           for (int j = 0; j < loop[j].length; j++) {
               if(loop[i][j] % 2 != 0){
                   System.out.print(loop[i][j] + " ");
               }
               else if (loop[i][j] % 8 == 0){
                   System.out.print(loop[i][j] + " ");
               }
           }
           System.out.println();
       }
   }
}
