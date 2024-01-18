public class LeadersInArray {
    public static void leaders(int []arr,int n){
        for(int i = 0;i<n;i++){
            int j;
            for( j = i + 1;j<n;j++){
                if(arr[i] <= arr[j]){
                    break;
                }

            }
            if(j == n ){
                System.out.printf(arr[i] + " ");
            }

        }
    }
    public static void main(String[] args) {
        LeadersInArray lead = new LeadersInArray();
        int []arr = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.leaders(arr, n);
    }
}
