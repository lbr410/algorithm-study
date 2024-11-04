import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                .filter(item -> item % n == 0)
                .toArray();
    }
}