package November5;
"Given an array of integers and a target sum, find two numbers
in the array that add up to the target. Return their indices.

        EXAMPLE:
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9"
"В начал обсудим Brute force- where the Time Complexity is not the most efficient and the best practice but the most obvious practice." +
        "In brute force i will try all the possible solutions.For the nested loop, N2"

"SECOND OPTIMAL SOLUTION: FIRST OPTIMAL SOLUTION Using HASHMAP(single pass for loop) for each number"

"if we find a complements it means we found our answer"
public class sort {
    public static int[] twoSumHashMap(int [] nums, int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        //key:number value, value: index in the array(index of the array)
        for (int i = 0; i<nums.length; i++){//iterate through each number
            int complement = target - nums[i];//to find the difference 9-2=7
            if (map.containsKey(complement)){ //check the map if we seen already the number we need
                return new int[]{map.get(complement),i}; //then return index of the complement and current index
            } else{
                map.put(nums[i],i);//add a number to the map and its index
            }
        }
        return new int[]{-1,-1};
    }
    //brute force time : O(n^2), space :O(1)
    //optimazied time : O(n), space: O(n)= trade off
    //now all the processor are strong with big memmory so its bettor to improve time complexity
}
