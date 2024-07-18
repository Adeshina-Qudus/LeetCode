package leetCode;

import java.util.ArrayList;
import java.util.Objects;

public class BaseBallGame {

    public static int baseBallGame(String[] elements) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int result = 0;
        solution(elements, numbers);
        result = getResult(numbers, result);
        return result;
    }

    private static void solution(String[] elements, ArrayList<Integer> numbers) {
        for (int count = 0; count < elements.length; count++){
            if (!Objects.equals(elements[count], "+") &&
                    !Objects.equals(elements[count], "D") &&
                         !Objects.equals(elements[count], "C")){
                numbers.add(Integer.valueOf(elements[count]));
            } else if (elements[count].equals("C") ) {
                numbers.removeLast();
            } else if (elements[count].equals("D")) {
                numbers.add(2 * numbers.getLast());
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
