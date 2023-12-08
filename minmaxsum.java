public class minmaxsum {
    public static void main(String[] args) {
            int arr[]={10,20,30,40};
            int k=1;
        System.out.println(splitArray(arr,k));
    }
    static int splitArray(int[] nums, int k){
           int start=0;
           int end=0;
//        here minimum sum is the max no. and max sum is the sum of all the no.
//        then do the binarysearch
//
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
//        binary search
        while(start<end) {
            int mid = start + (end - start) / 2;
//            calc how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces>k){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end; //end=start
    }
}
