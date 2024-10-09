import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {

        Deque<Character> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if(character == '{' || character == '(' || character == '['){
                queue.add(character);
            }
            if(!queue.isEmpty()) {
                if (character == ')' && queue.pollLast() != '(') {
                    return false;
                } else if (character == ']' && queue.pollLast() != '[') {
                    return false;
                } else if (character == '}' && queue.pollLast() != '{') {
                    return false;
                }
            }else{
                return false;
            }
        }
        return queue.isEmpty();
    }

}