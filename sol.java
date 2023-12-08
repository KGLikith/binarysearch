class sol {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
                int target=2;
        System.out.println(search(arr,target));
    }
    static boolean search(int[] nums, int target) {
        int peak=peak(nums);
        int f=bsearch(nums,target,0,peak);
        if(f!=-1)
            return true;
        int s=bsearch(nums,target,peak+1,nums.length-1);
        if(s!=-1)
            return true;
        return false;
    }
    static int peak(int []nums){
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int m=(s+e)/2;
            if(nums[m]>nums[m+1] && m<e)
                return m;
            if(nums[m]<nums[m-1] && m>s)
                return m-1;
            if(nums[m]>nums[s])
                s=m;
            else if (nums[m]<nums[s])
                e=m-1;
            else if(nums[m]==nums[s] && nums[m]==nums[e]){
                e--;
                s++;
            }
        }
        return s;
    }
   static int bsearch(int a[],int t,int s,int e){
        while(s<=e){
            int m=(s+e)/2;
            if(a[m]==t)
                return m;
            else if(a[m]<t)
                s=m+1;
            else if(a[m]>t)
                e=m-1;
        }
        return -1;
    }
}
