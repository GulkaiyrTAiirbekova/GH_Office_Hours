package April18;

class TrappingRainWater {   //line125
    public int trap(int [] heigth) {
        if (heigth == null || heigth.length <3)
            return 0;

        int left = 0, right = heigth.length -1;
        int leftMax = 0,rightMax = 0;
        int water =0;

        while (left < right){
            if (heigth[left] < heigth[right]) {
                if(heigth[left]>= leftMax)
                    leftMax = heigth[left];
                else
                    water +=leftMax - heigth[left];
                left++;
            } else{
                if (heigth[right] >= rightMax)
                    rightMax= heigth[right] ;
                else water += rightMax-heigth[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args){
        TrappingRainWater solution= new TrappingRainWater();
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Amount of water trapped: " + solution.trap(height));
    }
}
