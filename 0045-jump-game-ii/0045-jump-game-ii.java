class Solution {
    public int jump(int[] nums) {
        int maxDistance=nums[0]; //갈 수 있는 최대 길이
        int result=1; //결과
        int idx=1; //하나씩 배열 읽기
        int temp=-1; //최대값을 저장하기 위한 변수
        int nextStart=0; //다음 시작점
        int start=0; //현재 시작점
        if(nums.length==1){
            return 0;
        }
        while(true){
            if(temp<(nums[idx]+idx)){
                temp=nums[idx]+idx;
                nextStart=idx;
            }
            
            if(start+maxDistance<=idx){
                idx=nextStart;
                start=nextStart;
                maxDistance=nums[idx];
                temp=-1;
                if(idx>=nums.length-1){
                    break;
                }
                result++;
            }
            idx++;
            if(idx>=nums.length-1){
                break;
            }
            
        }
        return result;
    }
}