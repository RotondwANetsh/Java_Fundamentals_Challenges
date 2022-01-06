public class Main {
   public static void main(String[] args) {
       String line = "1,4,3,2,3,7,5,6,9";
       String[] num = line.split(",");
       int[] nums = new int[num.length];

       System.out.println("Original Array:");
       for (int i = 0; i < num.length; i++) {
           nums[i] = Integer.parseInt(num[i]);
           System.out.print(nums[i] + " ");
       }
       System.out.println("\nSorted Array in Ascending Order:");
       for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               int temp = 0;
               if(nums[i] > nums[j]){
                   temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
           }
           System.out.print(nums[i] + " ");
       }

       System.out.println("\nSorted Array in Descending Order:");
       for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               int temp = 0;
               if(nums[i] < nums[j]){
                   temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
           }
           System.out.print(nums[i] + " ");
       }
   }
}
