public class ArraysChallenge9 {
   public static void main(String[] args) {
       int[][] loop = new int[100][30];
       int i = 0, j = 0;

       while (i < loop.length) {
           while (j < loop[i].length) {
               loop[i][j] = (int) (Math.random() * 100);
               System.out.print(loop[i][j] + " ");
               j++;
           }
           j = 0;
           System.out.println();
           i++;
       }
       System.out.println();
       i = 0; j = 0;

       System.out.println("Even numbers and Divisible by 11");
       while (i < loop.length) {
           while (j < loop[i].length) {
               int even = loop[i][j] % 2;
               int divisible = loop[i][j] % 11;

               switch (even){
                   case 0:
                       System.out.print(loop[i][j] + " ");
                       break;
               }
               switch (divisible){
                   case 0:
                       System.out.print(loop[i][j] + " ");
                       break;
               }
               j++;
           }
           j = 0;
           System.out.println();
           i++;
       }
   }
}
