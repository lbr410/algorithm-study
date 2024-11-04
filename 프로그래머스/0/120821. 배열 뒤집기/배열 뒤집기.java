import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list)
                            .boxed()
                            .collect(Collectors.toList());
        Collections.reverse(list);
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}