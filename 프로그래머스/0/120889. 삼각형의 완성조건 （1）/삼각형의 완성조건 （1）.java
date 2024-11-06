import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt();
        int a = 0;
        int sum = 0;
        
        for (int i=0; i<sides.length; i++) {
            if (sides[i] == max) {
                if (a == 0) {
                    a += 1;
                } else {
                    sum += sides[i];
                }
            } else {
                sum += sides[i];
            }
        }

        return sum > max ? 1 : 2;
    }
}