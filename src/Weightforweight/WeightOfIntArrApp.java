package Weightforweight;

import java.util.Arrays;

public class WeightOfIntArrApp {
    public static int WeightOfInt(String input)
    {
        int res = 0;
        char[] arr = input.toCharArray();
        for ( char c: arr
             ) {
            res+= c - '0';
        }
        return res;
    }
    public static String orderWeight(String strng) {
          String res = "";
          String[] arr = strng.split("[^0-9]*[ ]+[^0-9]*");
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(WeightOfInt(arr[j+1]) < WeightOfInt(arr[j])){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(WeightOfInt(arr[j+1]) == WeightOfInt(arr[j]) && arr[j+1].compareTo(arr[j]) < 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        res += arr[0];
        for (int i = 1; i < arr.length; i++) {
            res+= " " + arr[i];
        }

          return  res;
    }

public static void main(String[] args)
    {
        String input = "45240 131550 202724 32264 222652 436304 13818 117634 4972 265361 125953";
        String[] arr = input.split("[^0-9]*[ ]+[^0-9]*");

        System.out.println(orderWeight(input));






    }
}
