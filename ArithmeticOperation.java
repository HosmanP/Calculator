public class ArithmeticOperation {

    public static int operation (int a, int b, String sign) {

        switch(sign){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
    return 0;
    }
}
