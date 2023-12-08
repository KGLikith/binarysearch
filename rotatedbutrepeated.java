//what if the elements are repeated like {2,2,3,2}i.e. duplicate values so for that we cant use the cond
//to check if the mid element is greate or lesser than start cuz all are same
//ignoring duplicate elments in the start and the end i.e. ignoring as many duplicate values as possible
//its of no use
public class rotatedbutrepeated {
    public static void main(String[] args) {
        int arr[]={1,3};
        int target=3;
        System.out.println(ans(arr,target));
    }
    static int ans(int arr[],int target){
        int peak=peakwithdup(arr);
        if (peak==-1 ){
            return binary(arr,target,0,arr.length-1);
        }
        if (arr[peak]==target)
            return peak;
        else if(target>=arr[0])
            return binary(arr,target,0,peak);
        else
            return binary(arr,target,peak+1,arr.length-1);
    }
    static int peakwithdup(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid <end && arr[mid]>arr[mid+1])
                return mid;
            if (mid>start && arr[mid]<arr[mid-1])
                return mid-1;
//            if elements at middle , start, end are equal then just skip the duplicates
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
//                what if these elements at start and end were the pivots
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
//            left side is sorted ,so pivot shd be in the right
            else if (arr[start]<arr[mid] || (arr[mid]==arr[start] && arr[mid]>arr[end]) ) {
                start = mid;
            }
            else{
                end=mid-1;
            }
            }
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