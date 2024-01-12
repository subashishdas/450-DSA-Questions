public class kadaneAlgorithm {
    public static int maxSubarraySum(int[]arr){
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1;i<arr.length;i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum,currSum);
            currSum = Math.max(currSum,0);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = maxSubarraySum(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
