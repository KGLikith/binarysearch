public class elementinmountain {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,4,3,2};
        int target=3;
        System.out.println(search(arr,target));
    }
    static int search(int arr[],int target){
        int peak=peak(arr);
//        first search in the ascending part of the array then seconf part (descending) to find the target
        int first=binarysearch(arr,target,0,peak);
        if(first!=-1)
            return first;
//        since first try did not yield the value now find in the second half
        int second=binarysearch(arr,target,peak+1,arr.length-1);
        if (second!=-1)
            return second;
        return -1;
    }
        static int peak(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            while (start <end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            return start; //it can be end too cuz both are ans
        }
    static int binarysearch(int arr[],int target,int start,int end){
        boolean isAsc= arr[start] < arr[end];
        while(start <=end){
//      int mid=(start+end)/2; //might be possible that start +end exceeds the range of int n java
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if(target<arr[mid])
                    end = mid - 1;
                else if (target>arr[mid])
                    start=mid+1;
                else
                    return mid;
            }
            else{
                if(target<arr[mid])
                    start=mid+1;
                else if (target>arr[mid])
                    end = mid - 1;
                else
                    return mid;
            }
        }
        return -1;
    }
}

