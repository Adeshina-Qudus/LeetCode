package leetCode;

public class DivideTwoIntegers {
    public static int divideTwoIntegers(int input,int divisor) {
        String value = String.valueOf(divisor);
        StringBuilder empty = new StringBuilder();
        StringBuilder minus = new StringBuilder();
        gettingChar(value, empty, minus);
        value = String.valueOf(empty);
        int counter = 0 ;
        String result = "";
        boolean condition = true;
        result = getResult(input, condition, value, counter, result);
        result = minus + result;
        return Integer.parseInt(result);
    }

    private static void gettingChar(String value, StringBuilder empty, StringBuilder minus) {
        for (int count = 0; count < value.length(); count++){
            if (!String.valueOf(value.charAt(count)).equals("-")){
                empty.append(value.charAt(count));
            }else
                minus.append(value.charAt(count));
        }
    }

    private static String getResult(int input, boolean condition, String value, int counter, String result) {
        int reminder;
        while (condition){
            reminder = input - Integer.parseInt(value);
            if (reminder  <= 1 ){
                condition = false;
            }
            counter++;
            result = ""+ counter;
            input = reminder;
        }
        return result;
    }
}
