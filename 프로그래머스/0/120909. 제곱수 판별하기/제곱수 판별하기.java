class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 2;
        return answer;
    }
}