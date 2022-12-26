package task1;

import java.util.Arrays;

public class Comparate {

    public task1.Food[] sort(task1.Food[] burgers){
        String[] arr = new String[burgers.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ((task1.Burger)burgers[i]).getSize();
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    String pum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = pum;
                }
            }
        }
        for(int i = 0; i < burgers.length; i++){
            ((task1.Burger)burgers[i]).setSize(arr[i]);
        }
        return burgers;
    }
}
