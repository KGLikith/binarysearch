import java.util.Arrays;

public class twodarray {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        int target=12;
        System.out.println(Arrays.toString(find(arr,target)));
    }
    static int []find(int [][] arr,int target) {
        int r=0;
        int c=arr[0].length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};}
            if (arr[r][c]<target){
                r++;}
            if(arr[r][c]>target){
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
