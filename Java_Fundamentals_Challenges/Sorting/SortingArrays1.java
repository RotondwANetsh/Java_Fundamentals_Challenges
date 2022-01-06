ublic class Main {
   public static void main(String[] args) {
       int[] array = new int[50];

       array[19] = 60;
       array[20] = 61;

       for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
       }
   }
}
