package programmers;

import java.util.HashMap;

class hash02 {
    public int hash02(int[] nums) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        // 각 종류당 하나씩만 선택
        for(int num : nums){
            // 키가 존재하면
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }


        answer = Math.min(nums.length/2, map.size());
        return answer;
    }
}
