public class Sign {

    public static String devinitiveSign(String numTwo) {
        String s = "+";
        int indexM = numTwo.indexOf(s);
        if (indexM != -1) {
            return s;
        }
        s = "*";
        indexM = numTwo.indexOf(s);
        if (indexM != -1) {
            return s;
        }
        s = "/";
        indexM = numTwo.indexOf(s);
        if (indexM != -1) {
            return s;
        }
        s = "-";
        indexM = numTwo.indexOf(s);
        if (indexM != -1) {
            return s;
        }
        return "%";
    }
}