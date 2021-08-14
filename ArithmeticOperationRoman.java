public class ArithmeticOperationRoman {
    public static int operation (int a, int b, String sign) throws Exception {

        switch(sign){
            case "+": return a + b;
            case "-": if (a <= b) throw new Exception("В римской системе нет отрицательных чисел и 0");
                      return a - b;
            case "*": return a * b;
            case "/": if ((a / b) == 0) throw new Exception("Результат деления = 0, в римской системе это невозможно");
                      return a / b;
        }
        return 0;
    }
}
