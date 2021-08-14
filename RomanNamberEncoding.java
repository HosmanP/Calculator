public class RomanNamberEncoding {

    public static int romanEncoding (String[] numTwo, int x){

        String[] number = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i <= 9; i++) {
            if (numTwo[x].equalsIgnoreCase(number[i])) {
                return i + 1;
            } else {
                continue;
            }
        }
        return 15;
    }
}
