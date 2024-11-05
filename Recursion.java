public class Recursion {
    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNumber(6));

        System.out.println(factorial(5));




    }
    public static int sumOfNNaturalNumber(int n) {
        if (n == 1) {
            return 1;
        }
     return n + sumOfNNaturalNumber(n - 1);
    }


   public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
   }

}
