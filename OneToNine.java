public class OneToNine {

    public static String oneToNine(int number){
        String[] roman = {"0" ,"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",};
            for (int i = 1; i <= 9; i++){
                if(i == number){
                    return roman[i];
                } else {
                    continue;
                }
            }
        return "error";
    }
}
