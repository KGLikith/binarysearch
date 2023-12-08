public class rotatedsortedarray {
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3,4};
        int target=3;
        System.out.println(ans(arr,target));
        System.out.println(peak(arr));
    }
    static int ans(int arr[],int target){
        int peak=peak(arr);
        if (peak==-1 ){
//            ARRAY IS NOT ROTATED
            return binary(arr,target,0,arr.length-1);
        }
        if (arr[peak]==target)
            return peak;
        else if(target>=arr[0])
            return binary(arr,target,0,peak);
        else
            return binary(arr,target,peak+1,arr.length-1);
    }
    static int peak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid <end && arr[mid]>arr[mid+1])
                return mid;
            if (mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid;
        }}
        return -1;
    }
        static int binary ( int arr[], int target, int start, int end){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
