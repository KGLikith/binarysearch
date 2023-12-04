public class floor {public static void main(String[] args) {
    int arr[]={-2,3,5,9,14,16,18,564,565,1000,1001};
    int target=1000;
    System.out.println(arr[Binary(arr,target)]);
}
    static int Binary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int max=arr[start];
        if(target<arr[start]){
            return -1;
        }
        while(start<=end){
            int mid;
            mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            if (target>arr[mid]){
                start=mid+1;
            }
        }
        return end;
    }
}
