class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n / 7 + ((n % 7 > 0) ? 1 : 0);
        return answer;
    }
}