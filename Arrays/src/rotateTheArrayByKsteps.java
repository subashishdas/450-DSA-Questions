import java.util.Arrays;

public class rotateTheArrayByKsteps {
    public static void reverse(int []arr,int start,int end){
        while(start < end){
            int temp = arr[start];

            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void rotate(int[]arr,int k){
        int n = arr.length;
        k = k % n;

        // First Reverse the entire array
        reverse(arr,0,n-1);

        // Reverse the first K elements
        reverse(arr,0,k-1);

        //Reverse the remaining element
        reverse(arr,k,n-1);
    }

    public static void main(String[] args) {
        int[]arr = {7,10,4,3,20,15};
        int k = 3;

        System.out.println("Original Array " + Arrays.toString(arr));
        rotate(arr,k);
        System.out.println("Rotated array " + Arrays.toString(arr));
    }
}
