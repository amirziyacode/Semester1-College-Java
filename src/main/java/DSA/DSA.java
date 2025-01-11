package DSA;

public class DSA {
     // [1,2,3,4,5,6]
    public static int BinarySearch(int[] nums,int target){
        int first ,last,mid; // 0
        first = 0;  // 5
        last = nums.length - 1; // 5
        while(first<=last){
            mid = (first+last)/2; // 4 ;
            if(target==nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                first = mid + 1;
            } else {
                last = mid - 1 ;
            }
        }
        return -1;
    }
}
