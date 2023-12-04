public class orderagnosticbinarysearch {
    public static void main(String[] args) {
        int []arr={565,343,43,6,4,3,2,1,0};
        int target=0;
        System.out.println(binarysearch(arr,target));
    }
    static int binarysearch(int arr[],int target){
        int start =0;
        int end=arr.length-1;
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
