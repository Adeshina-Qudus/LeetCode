package leetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IpAddressTest {



    @Test
    public void validIpAddressTest(){
        String input ="25525511135";
        ArrayList<String> output = new ArrayList<>(Arrays.asList("255.255.11.135","255.255.111.35"));
        assertEquals(output,IpAddress.validIpAddress(input));
    }

}