package leetCode;

public class ElementAppearingMoreThan25Percent {


    public static int elementAppearingMoreThan25Percent(int[] input) {
        int number = 0;
        int count = 0 ;
        int counter = 0 ;
        for (int outterLoop = 0 ; outterLoop < input.length; outterLoop++){
            for (int innerLoop = 0; innerLoop < input.length; innerLoop++){
                if (input[outterLoop] == input[innerLoop]) {
                    counter++;
                    if (counter > count) {
                        number = input[outterLoop];
                    }
                }
            }
            count = counter;
            counter = 0;
        }
        return number;
    }
}
