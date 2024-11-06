package Array;

public class Sum {
    public static void main(String[] args) {
//        Sum Of Array
        int[] arr = {11, 21, 32, 54, 76, 90, -190, -94, 3};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
