public class mountain {
    public static void main(String[] args) {
        int arr[] = {0, 1,2,3,2,1, 0};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
//            this may be the ans but look at the left this is why end is not mid-1
                end = mid;
            } else {
//            this is not the ans as this is not the peak value
                start = mid + 1;
            }
        }
//        in the end start==end because both are leaning towards the answer(largest no.) because of the two checks above
//        at every point they have the best possible answer at that situation
//        since in the end the remaining ans is only 1 that is the best possible ans
        return start; //it can be end too cuz both are ans
        }
        }