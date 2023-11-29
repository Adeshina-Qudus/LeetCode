package leetCode;

public class DivideTwoIntegers {
    public static int divideTwoIntegers(int input,int divisor) {
        String value = String.valueOf(divisor);
        StringBuilder empty = new StringBuilder();
        StringBuilder minus = new StringBuilder();

        for (int count = 0 ; count < value.length(); count++){
            if (!String.valueOf(value.charAt(count)).equals("-")){
                empty.append(value.charAt(count));
            }else
                minus.append(value.charAt(count));
        }
        value = String.valueOf(empty);
        int counter = 0 ;
        String result = "";
        int reminder;
        boolean condition = true;
        while (condition){
            reminder = input - Integer.parseInt(value);
            if (reminder  <= 1 ){
                condition = false;
            }
            counter++;
            result = ""+counter;
            input = reminder;
        }
        if (String.valueOf(minus.charAt(0)).equals("-")){
            result = Integer.parseInt(String.valueOf(minus.charAt(0))) + result;
        }
        return Integer.parseInt(result);
    }
}
