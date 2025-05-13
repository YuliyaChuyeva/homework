package homewWorkTwelve_DataType;

public class Task3 {

    public static void main(String[] args) {
        int a = 222;
        int b = 222;
        System.out.println("Если сравнить два одинаковых числа примитивного типа int через ==: " + (a == b));
        Integer a1 = 221;
        Integer b1 = 221;
        System.out.println("Если сравнить два одинаковых числа Integer через ==: " + (a1 == b1));
        System.out.println("Если сравнить два одинаковых числа Integer через equals: " + a1.equals(b1));
    }
}
