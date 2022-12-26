package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task1.Comparate comparate = new task1.Comparate();
        System.out.println("Введите -calories для того чтобы узнать общую калорийность");
        String all = scanner.nextLine();
        System.out.println("Введите -sort для того чтобы отсортировать продукты");
        String sort = scanner.nextLine();
        task1.Food[] burgers = new task1.Burger[10];{
            for (int i = 0; i < burgers.length; i++){
                if(i < 4){
                    burgers[i] = new task1.Burger("Средний");
                } else if (i > 3 && i < 7) {
                    burgers[i] = new task1.Burger("Маленький");
                }else{
                    burgers[i] = new task1.Burger("Большой");
                }
            }
        }
        if(all.equals("-calories")){
            for(int i = 0; i < burgers.length; i++){
                ((task1.Burger)burgers[i]).allCalories(((task1.Burger)burgers[i]).getSize());
                if(i == burgers.length - 1){
                    System.out.println("Общее число калориев " + ((task1.Burger)burgers[i]).getAllcalories());
                    System.out.println();
                }
            }
        }else{
            System.out.println("Не правильно введено -calories");
        }

        if(sort.equals("-sort")){
            burgers = comparate.sort(burgers);
            for(int i = 0; i < burgers.length; i++){
                System.out.println(((task1.Burger)burgers[i]).getSize());
            }
        }else{
            System.out.println("-sort введенно неправильно");
        }

    }
}