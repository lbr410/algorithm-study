class Solution {
    public int solution(String my_string) {
        int answer = 0;
        answer = my_string.chars()
            .filter(c -> c >= 48 && c <= 57)
            .map(c -> c - '0')
            .sum();
        return answer;
    }
}