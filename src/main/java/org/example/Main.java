package org.example;
import java.util.Scanner;

class Jail {
    public static void col(){
        Scanner sc = new Scanner(System.in);
        int quantity = 500;
        System.out.println(quantity);
        int quantity1 = sc.nextInt();
        if (quantity < quantity1)
        {
            System.out.println("не хватает мест для заключённых");
            System.out.println("|-_-_-_-_-_-_-_-_-_-_-|");
        }
    }
    //проверка на счетчик эдениц безопасности
    public static void safety(){
        Scanner sc = new Scanner(System.in);
        int safety = 50;
        System.out.println(safety);
        String time = "0";
        int security = 45;
        if (time == "21:00"){
            System.out.println(security + 15);
            System.out.println(safety + 20);
            System.out.println(safety);
            if(time == "21:00" && security == 60){
                System.out.println(safety + 35);
                System.out.println(safety);
            }
        }
        else if (time == "9:00"){
            System.out.println(security);
            System.out.println(safety - 20);
            System.out.println(safety);
        }

        if(safety == 75){
            System.out.println("никто не сможет сбежать");
        }
        else if(safety == 0){
            System.out.println("многие сбежали");
        }

    }
    // сделай проверку на наличие веруюших
    public static  void believers(){
        Scanner sc = new Scanner(System.in);
        int believer = 0;
        int nobelievers = 0;
    }
    // проверка времени для трапезы
    public void stalovka(){
        String timeate = "0";
        if(timeate == "7:00" || timeate == "12:00" ||timeate == "18:00"){
            System.out.println("в сотовую что-бы поесть");
        }
    }

    public void freetimes(){
        String freetime = "0";
        if(freetime == "10:00" || freetime == "14:00" || freetime == "21:00"){
            System.out.println("свободное время, можно выйти на улицу и ещё что-то");
            System.out.println("|-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-|");
        }
    }

    public void meetingtimes(){
        Scanner sc = new Scanner(System.in);
        String meetingtime = "0";
        if (meetingtime == "16:00"){
            String Name = sc.toString();
            System.out.println("заключенный встретился с " + Name);
        }
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jail jail = new Jail();
    }
}
