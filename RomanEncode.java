public class RomanEncode {

    public static String romanEncode (int number){
        String[] roman = {"0", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        if (number == 100){
            return "C";
        } else if ((number >= 1) && (number <= 9)){
            return OneToNine.oneToNine(number);
        } else {
            String string = Integer.toString(number);
            int numberOne = Integer.parseInt(String.valueOf(string.charAt(0)));
            int numberTwo = Integer.parseInt(String.valueOf(string.charAt(1)));
            if (numberTwo == 0){
                return roman[numberOne];
            } else {
                return roman[numberOne] + OneToNine.oneToNine(numberTwo);
            }
        }
    }
}