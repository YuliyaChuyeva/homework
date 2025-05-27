package homeWorkFifteen_stringbuild;

import java.util.StringJoiner;


public class Task2 {
    public static void main(String[] args) {
        String text = "001:Apple:1.25; 002:Banana:0.89; 003:Cherry:3.40";
        String[] products = text.split(";");
        StringJoiner joiner = new StringJoiner("\n");
        System.out.println("ID         Name      Price");
        for (String product : products) {
            product = product.trim();
            String[] p = product.split(":");
            String id = p[0];
            String name = p[1];
            String price = p[2];
            String formatted = String.format("%-10s %-10s %-10s", id, name, price);
            joiner.add(formatted);
        }
        System.out.println(joiner.toString());
    }
}
