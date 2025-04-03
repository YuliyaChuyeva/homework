public class Task5 {
    public static void main(String[] args) {
        int age = 61;
        String zone = "обычная";
        String timeOfDay = "вечер";

        if(age < 12){
            if(zone.equals("VIP")){
                System.out.println("Детский вип билет");
            }
            else if (zone.equals("обычная")){
                System.out.println("Детский билет");
            }
        }
        else if (age>=12 && age<60) {
            if(zone.equals("VIP")){
                if (timeOfDay.equals("вечер")) {
                System.out.println("Вечерний вип билет");
            } else {
                System.out.println("Обычный вип билет");
            }}
             else if (zone.equals("обычная")) {
                if (timeOfDay.equals("утро")) {
                    System.out.println("утренний билет");
                } else {
                    System.out.println("стандартный билет");
                }
            }
        }
            else if(age>=60){
                if(zone.equals("VIP")){
                    System.out.println("пенсионный вип билет");
                }
                else if (zone.equals("обычная")){
                    System.out.println("пенсионный билет");
                }

        }
        }
    }

