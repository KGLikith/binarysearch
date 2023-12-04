public class ceiling {
    public static void main(String[] args) {
        int arr[]={-2,3,5,9,14,16,18,564,565,1000,1001};
        int target=4 ;
        System.out.println(arr[Binary(arr,target)]);
    }
    static int Binary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        if(target>arr[end]){
            return -1;
        }
        while(start<=end){
            int mid;
            mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
        else {
            return mid;
        }
    }return start;
}}
