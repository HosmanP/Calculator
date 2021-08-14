public class ItsRoman {

    public static boolean itsRoman (String numTwo[],int x){

        String number[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i <= 9; i++) {
            if (numTwo[x].equalsIgnoreCase(number[i])) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
}
