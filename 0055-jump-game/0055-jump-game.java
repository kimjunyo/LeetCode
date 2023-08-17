class Solution {
    public boolean canJump(int[] nums) {
        int comp=-1;
        int step=1;
        if(nums.length==1){
            return true;
        }
        for(int idx=nums.length-2;idx>=0;idx--){
            if(step<=nums[idx]){
                step=0;
                comp=idx;
            }
            step++;
        }

        if(comp==0){
            return true;
        }
        return false;
    }
}