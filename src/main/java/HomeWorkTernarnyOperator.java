public class HomeWorkTernarnyOperator {

    public static void main(String[] args) {
        //task4
        int a = 20;
        String result = (a % 5 == 0 && a % 3 == 0) ? "Число делится на 5 и 3" : "Число не делится на 5 и 3";
        System.out.println(result);

        //task3
        int b1 = 30;
        int b2 = 55;

        int min = (b1 < b2) ? b1 : b2;
        System.out.println(min);

        //task5
        int c = 16;
        String result1 = (c >= 50 && c <= 100) ? "Yes" : "No";
        System.out.println(result1);

        //task2

        int t = 16;
        String result2 = (t < 0) ? "Holodno" :
                (t <= 20) ? "Prohladno" : "Teplo";
        System.out.println(result2);

        //task1
        int year = 2010;
        String result3 = (year % 4 != 0) ? "Не является високосным годом" :
                (year % 100 == 0 && year % 400 != 0) ? "Не является високосным годом" :
                        "Является високосным годом";

        System.out.println(year + " " + result3);
    }

}
