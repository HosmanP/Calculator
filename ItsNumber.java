public class ItsNumber {

    public static boolean itsNumber(String[] numTwo,int x) {

        String number[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i <= 9; i++) {
            if (numTwo[x].equals(number[i])) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
}