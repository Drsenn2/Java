public class NineInts {
    public static void main (String args[]) {
        // Write your code here
        int[] numbers = {10, 15, 19, 23, 26, 29, 31, 34, 38};
      int x;
      for (x = 0; x < numbers.length; x++)
         System.out.print(numbers[x] + " ");
      System.out.println();
      for (x= numbers.length-1; x>= 0; x--)
        System.out.print(numbers[x] + " ");
    System.out.println();

    }
}
