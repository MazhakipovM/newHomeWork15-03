import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        task1(scan);


        task2();


        task3(scan);


    }

    private static void task3(Scanner scan) {
        System.out.println("Введите дистанцию?");
        int ourDistance = scan.nextInt();
        distance(ourDistance);
    }

    public static void distance (int deliveryDistance){
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 сутки ");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 суток");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 суток");
        } else {
            System.out.println("Доставки нет");
        }
    }

    private static void task2() {
        int phoneYear = 2020;
        int phoneOS = 0;
        clientsPhone(phoneYear,phoneOS);
    }

    public static void clientsPhone(int clientDeviceYear,int clientOS) {

        if(clientDeviceYear>= 2015 && clientOS ==0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if(clientDeviceYear>= 2015 && clientOS==1){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <2015 && clientOS ==0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    private static void task1(Scanner scan) {
        //task 1
        System.out.println("Введите год ?");
        int whichYear = scan.nextInt();
        visokosnyi(whichYear);
    }

    public static void visokosnyi(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + "год — невисокосный год");
        }
    }



}