import leetCode.CalculateMoneyInLeetcodeBank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateMoneyInLeetcodeBankTest {


    @Test
    public void moneySavedByHercyForHisFirstCarTest(){
        int daysInput = 4;
        int moneySaved = 10;
        assertEquals(moneySaved, CalculateMoneyInLeetcodeBank.leetcodeBank(daysInput));
    }
    @Test
    public void moneySavedByHercyForHisFirstCarTestTwo(){
        int daysInput = 10;
        int moneySaved = 37;
        assertEquals(moneySaved, CalculateMoneyInLeetcodeBank.leetcodeBank(daysInput));
    } @Test
    public void moneySavedByHercyForHisFirstCarTestThree(){
        int daysInput = 20;
        int moneySaved = 96;
        assertEquals(moneySaved, CalculateMoneyInLeetcodeBank.leetcodeBank(daysInput));
    }

}
