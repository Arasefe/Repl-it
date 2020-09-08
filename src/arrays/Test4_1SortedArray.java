package arrays;

public class Test4_1SortedArray {
    public static void main(String[] args) {
        System.out.println(isSort(new int[]{2,3,4,5,6,1}));
    }
    public static boolean isSort(int[] nums) {

        int min=nums[0];
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]>min){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }

}
