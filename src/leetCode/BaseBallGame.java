package leetCode;

import java.util.ArrayList;
import java.util.Objects;

public class BaseBallGame {

    public static int baseBallGame(String[] elements) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> invalidate = new ArrayList<>();
        int result = 0;
        solution(elements, numbers, invalidate);
        result = getResult(numbers, result);
        return result;
    }

    private static void solution(String[] elements, ArrayList<Integer> numbers, ArrayList<Integer> invalidate) {
        for (int count = 0; count < elements.length; count++){
            if (!Objects.equals(elements[count], "+") &&
                    !Objects.equals(elements[count], "D") &&
                         !Objects.equals(elements[count], "C")){
                numbers.add(Integer.valueOf(elements[count]));
            } else if (elements[count].equals("C") ) {
                int invalidated =  numbers.getLast();
                invalidate.add(invalidated);
                numbers.removeLast();
            } else if (elements[count].equals("D")) {
                numbers.add(numbers.getLast() * invalidate.removeLast());
            }
            else {
                numbers.add(numbers.getLast() + numbers.get(numbers.size() - 2));
            }
        }
    }

    private static int getResult(ArrayList<Integer> numbers, int result) {
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }
}
