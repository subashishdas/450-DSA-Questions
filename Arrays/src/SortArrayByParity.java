public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            if(nums[i] % 2 > nums[j] % 2){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[i] % 2 == 0) i++;
            if(nums[j] % 2 == 1) j--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        SortArrayByParity sorter = new SortArrayByParity();
        int[] result = sorter.sortArrayByParity(nums);

        // Printing the result
        System.out.println("Sorted Array By Parity:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
