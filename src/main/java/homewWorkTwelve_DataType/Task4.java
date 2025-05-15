package homewWorkTwelve_DataType;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        int number = 14;
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        System.out.println("Число Фибоначчи " + number + " = " + b);
    }
}
