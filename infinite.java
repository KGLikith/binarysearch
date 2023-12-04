public class infinite {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,222,333};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int []arr,int target){
//        first find the range
//        first start with the box of two
        int start=0;
        int end=1;
//        condition for the target to lie in range
         while(target>arr[end]){
             int temp=end+1;
//             end =double the size than the previous one
             end=end+(end-start+1)*2;
//             start cant be used initially cuz it is used in the end formula
             start=temp;
         }
         return Binary(arr,target,start,end);
    }
    static int Binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
//            int mid=(start+end)/2; //might be possible that start +end exceeds the range of int n java
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}