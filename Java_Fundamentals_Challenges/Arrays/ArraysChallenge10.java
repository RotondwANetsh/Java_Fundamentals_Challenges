public class ArraysChallenge10 {
   public static void main(String[] args) {
       int[][] loop = new int[100][30];

       for (int i = 0; i < loop.length; i++) {
           for (int j = 0; j < loop[j].length; j++) {
               loop[i][j] = (int) (Math.random() * 100);
               System.out.print(loop[i][j] + " ");
           }
           System.out.println();
       }
       System.out.println("Incremented values by 1:");
       for (int i = 0; i < loop.length ; i++) {
           for (int j = 0; j < loop[j].length; j++) {
               loop[i][j] = loop[i][j] + 1;
               System.out.print(loop[i][j] + " ");
           }
           System.out.println();
       }
   }
}
