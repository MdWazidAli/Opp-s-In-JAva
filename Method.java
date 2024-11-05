public class Method {
    public static void main(String[] args) {
      int[] a = {12, 21, 2321, 7234};
        sumOfArray(a);

        int[] b= {1, 2, 3, 4, 5};
        sumOfArray(b);

        String res = upperFun("vipul");
        System.out.println(res);

        System.out.println(sum(3,8));
    }


    public static void sumOfArray(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        System.out.println(res);
    }



    private static String upperFun(String str){
      return str.trim().toUpperCase();
    }



    private static int sum(int a, int b) {
        return a + b;
    }


}
