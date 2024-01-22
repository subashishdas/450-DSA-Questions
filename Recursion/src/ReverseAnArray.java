public class ReverseAnArray {
    public static void reverse(int i, int n, int arr[]) {
        if (i >= n / 2) return;
        else {
            swap(arr, i, n - i - 1);
            reverse(i + 1, n, arr);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int n = arr.length;
        reverse(0, n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
