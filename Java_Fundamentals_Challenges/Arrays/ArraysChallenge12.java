public class ArraysChallenge12 {
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

       System.out.println("Odd numbers and Divisible by 8");
       while (i < loop.length) {
           while (j < loop[i].length) {
               int odd = loop[i][j] % 2;
               int divisible = loop[i][j] % 8;

               switch (odd){
                   case 1:
                       System.out.print(loop[i][j] + " ");
                       break;
                   default:
                       switch (divisible){
                           case 0:
                               System.out.print(loop[i][j] + " ");
                               break;
                       }
               }
               j++;
           }
           j = 0;
           System.out.println();
           i++;
       }
   }
}
