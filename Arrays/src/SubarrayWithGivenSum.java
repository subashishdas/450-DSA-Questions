import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static ArrayList<Integer> subarraySum(int[]arr,int n,int sum){
        ArrayList<Integer> result = new ArrayList<>();
        int currSum = arr[0];
        int begin = 0;
        for(int i = 1;i<=n;i++){
            while(currSum > sum && begin <i -1){
                currSum = currSum - arr[begin];
                begin++;
            }

            if(currSum == sum){
                result.add(begin);
                result.add(i - 1);
                return result;
            }
            if(i < n)
                currSum = currSum + arr[i];
        }
        result.add(-1);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = arr.length;
        int sum = 12;
        ArrayList<Integer> result = subarraySum(arr,n,sum);
        System.out.println(result);
    }
}
