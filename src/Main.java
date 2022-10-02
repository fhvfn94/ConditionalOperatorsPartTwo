public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}