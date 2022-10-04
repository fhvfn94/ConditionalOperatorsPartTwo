public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        byte phone = 1;
        switch (phone){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }
    public static void task2(){
        byte phoneVersion = 1;
        int clientDeviceYear = 2014;
        switch (phoneVersion){
            case 0:
                if (clientDeviceYear >= 2015){
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015){
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }
    }
    public static void task3(){
        int year = 2014;
        int a = year % 4;
        int b = year % 100;
        int c = year / 400;
        if(a == 0 || c == 5){
            if (b != 0){
                System.out.println(year + "  год является високосным");
            }
        } else {
            System.out.println( year + " год не високосный");
        }
    }
    public static void task4(){
        byte deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуются сутки на доставку");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 на доставку");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 2.5 дня на доставку");
        }
    }
    public static void task5(){
        byte monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Введите от 1 до 12");
        }
    }
}