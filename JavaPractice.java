import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {12,30,543,894,8,6};
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[len-2]);
    }
}
