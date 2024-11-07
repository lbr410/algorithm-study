class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String nums = num + "";
        for (int i=0; i<nums.length(); i++) {
            if (nums.charAt(i) - '0' == k && answer == 0) answer = i+1;
        }
        
        return answer != 0 ? answer : -1;
    }
}