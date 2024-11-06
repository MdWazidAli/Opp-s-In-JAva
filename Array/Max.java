package Array;

public class Max {
    public static void main(String[] args) {
//        Find Max Value
        int[] arr = new int[6];

        arr[0] = 2;
        arr[1] = 21;
        arr[2] = 32;
        arr[3] = 2;
        arr[4] = -2;
        arr[5] = 1;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < res) {
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}
