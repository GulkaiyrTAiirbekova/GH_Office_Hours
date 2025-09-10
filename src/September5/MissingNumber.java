package September5;
//Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
//Output: 8
//Explanation: The array should contain [0, 1, 2, 3, 4, 5, 6, 7, 8, 9], but 8 is missing.
//Input: nums = [0, 1]
//Output: 2
//Explanation: The array should contain [0, 1, 2], but 2 is missing.
public class MissingNumber {
    public static int findMissing(int[] nums) {
        Arrays.sor(nums);
        for(int i=1;i < n-1; i++){
          if (nums[i] != nums[i -1] +1) {
              return nums[i-1]+1;
          }
        }
        return n;
    }
    public static void main(String [] args) {
        int [] a ={3,0,1};
        System.out.println()
    }
}
