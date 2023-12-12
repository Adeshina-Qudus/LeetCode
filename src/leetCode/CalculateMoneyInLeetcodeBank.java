package leetCode;

public class CalculateMoneyInLeetcodeBank {

    public static int leetcodeBank(int daysInput) {
        int counter = 0;
        int moneySaved = 0;
        int seventhDay = 1;
        int daysOFTheWeek = 7;
        for (int count = 1 ; count <= daysInput; count++) {
            counter++;
            if (count % daysOFTheWeek == 0) {
                seventhDay++;
                moneySaved += counter;
                counter = seventhDay;
                counter--;
            } else {
                moneySaved += counter;
            }
        }
        return moneySaved;
    }
}
