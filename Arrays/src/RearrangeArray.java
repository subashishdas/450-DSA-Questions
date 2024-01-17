import java.util.Arrays;

public class RearrangeArray {
    public static void rearrange(int[]arr,int n){
        Arrays.sort(arr);
        int[] ans = new int[n];
        int p = 0; // Pointer for odd position
        int q = n - 1; // Pointer for even position

        for(int i = 0;i<n;i++){
            if((i + 1) % 2 == 0){
                ans[i] = arr[q--];
            }else{
                ans[i] = arr[p++];
            }
        }

    }
    public static void main(String[] args) {
        int []arr ={1, 2, 2, 1};
        int n = arr.length;
        rearrange(arr,n);
        for(int num : arr){
            System.out.println("Rearrange Array : " + num);
        }
    }
}


// TC : O(n)
// SC : O(n)