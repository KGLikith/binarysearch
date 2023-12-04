public class Binary {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,23,54,565};
        int target=6;
        System.out.println(Binarysearch(arr,target));
    }
    static int Binarysearch(int arr[],int target){
        int start =0;
        int end=arr.length-1;

        while(start <=end){
//            int mid=(start+end)/2; //might be possible that start +end exceeds the range of int n java
        int mid=start+(end-start)/2;
        if(target<arr[mid])
            end = mid - 1;
        else if (target>arr[mid])
            start=mid+1;
        else
            return mid;
        }
        return -1;
    }
}
