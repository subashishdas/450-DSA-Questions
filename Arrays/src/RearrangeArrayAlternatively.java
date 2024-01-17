import java.util.Arrays;

public class RearrangeArrayAlternatively {
    public static void rearrange(int[]arr, int n){
        int [] newArr = arr.clone();

        Arrays.sort(newArr);
        int min = 0;
        int max = n -1;
        boolean flag = true;

        for(int i = 0;i<n;i++){
            if(flag){
                arr[i] = newArr[max--];
            }else{
                arr[i] = newArr[min++];
            }
            flag = !flag;

        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        rearrange(arr, arr.length);

        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
    }
}
