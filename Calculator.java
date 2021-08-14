
import java.util.Scanner;

public class Calculator  {

    public static void main (String[] args)  throws Exception {

        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        String[] arrayString = num.split(" ");
        String sign = Sign.devinitiveSign(num);
        if ((arrayString.length == 1) || (arrayString.length == 2)) throw new Exception("Строка не является математической операцией");
        if (arrayString.length >= 4) throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        if (sign.equals("%")) throw new Exception("Введенный знак не соответствует: + - / * ");
        boolean romanOne = ItsRoman.itsRoman(arrayString,0);
        boolean romanTwo = ItsRoman.itsRoman(arrayString,2);
        boolean numberOne = ItsNumber.itsNumber(arrayString,0);
        boolean numberTwo = ItsNumber.itsNumber(arrayString,2);
        if ((romanOne == numberTwo) || (romanTwo == numberOne)) throw  new Exception("Используются одновременно разные системы счисления либо числа не от 1 до 10 и не от I до X");
        if (romanOne != romanTwo) throw new Exception("1ое или 2ое введеное число не римские цифры");
        if (numberOne != numberTwo) throw new Exception("1ое или 2ое введеное число больше 10 или меньше 0");
        if ((numberOne == true) && (numberTwo == true)){
            int a = Integer.parseInt(arrayString[0]);
            int b = Integer.parseInt(arrayString[2]);
            int c = ArithmeticOperation.operation(a, b, sign);
            System.out.println(a + sign + b + " = " + c);

        } else if((romanOne == true) && (romanTwo == true)){
            int a = RomanNamberEncoding.romanEncoding(arrayString, 0);
            int b = RomanNamberEncoding.romanEncoding(arrayString, 2);
            int c = ArithmeticOperationRoman.operation(a, b, sign);
            if ((c >= 1) && (c <= 9)) {
                System.out.println(OneToNine.oneToNine(c));
            } else {
                System.out.println("Полученное число в римской системе = " + RomanEncode.romanEncode(c));
            }
        }
    }
}
