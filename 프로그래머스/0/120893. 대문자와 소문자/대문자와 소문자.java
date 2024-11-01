import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.chars()
                .mapToObj(c -> (char) c)
                .map(c -> (c >= 65 && c <= 90) ? (char) (c + 32) : (c >= 97 && c <= 122) ? (char) (c - 32) : c)
                .map(c -> String.valueOf(c))
                .collect(Collectors.joining());
        return answer;
    }
}