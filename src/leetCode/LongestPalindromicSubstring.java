package leetCode;

public class LongestPalindromicSubstring {
    public static String palindromicSubstring(String input) {
        String result = "";
        StringBuilder holdingElement = new StringBuilder();
//        StringBuilder holdingElementTwo = new StringBuilder();
        StringBuilder gettingResult = new StringBuilder();
     for (int element = 0 ; element < input.length() ; element++){
         holdingElement.append(input.charAt(element));
         for (int eachElement = holdingElement.length() - 1 ; eachElement >= 0;eachElement++){
             gettingResult.append(holdingElement.charAt(eachElement));
             if (holdingElement.equals(gettingResult)){
                 result = gettingResult.toString();
             }
             else {
                 result = "";
                 gettingResult.deleteCharAt(eachElement);
             }
         }
         }
     return result;
     }

}
