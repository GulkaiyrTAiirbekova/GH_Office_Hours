package September10;

public class P090925 {
    public static void main(String [] args) {
        int [] nums = { 1,3,4,5,6,3,9}; //k=9
        //1= 4+5
        //2 = 6+3
       // 3=9
        System.out.println(numsOfSubbarays(                                                                   ))
    }

    public static int numsOfSubbarays(int[] nums){
        int count =0;
        for(int i=0; i<nums.length; i++){
            for(int j =i; j<nums.length; j++){
                int sum =0;
                for(int m =i;m<=j; m++) {
                    sum +=nums[m];
                }
                if (sum ==k){

                }
            }
        }
    }
}
