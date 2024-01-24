
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static ArrayList<Integer> maxOfSubarray(int[]arr,int n,int k){
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0;i<k;i++){
//            Remove Element that are smaller than current element from the back of the deque
            while(!dq.isEmpty() && arr[i] > arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

//        Process for remaining element
        for(int i = k;i<n;i++){
            ans.add(arr[dq.peekFirst()]);

            while(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[i] > arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans.add(arr[dq.peekFirst()]);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int n = arr.length;

        ArrayList<Integer> result = maxOfSubarray(arr,n,k);
        System.out.println("Maximum Elements in Subarrays of Size " + k + ": " + result);
    }
}
