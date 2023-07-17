public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + hi) / 2;
        while (li <= hi) {
            if (target == arr[mi]) {
                System.out.println("target is present at index " + mi);
                break;
            } else if (target > arr[mi]) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi=(li+hi)/2;
        }
    }
}
