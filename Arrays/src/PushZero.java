public class PushZero {
    public static void moveZeroToEnd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;
        moveZeroToEnd(arr, n);
        for (int num : arr) {
            System.out.println("New Array: " + num);
        }
    }
}

//  TC : O(n)
// SC : O(1)