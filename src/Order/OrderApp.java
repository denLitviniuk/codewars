 package Order;

 import java.util.Arrays;
 import java.util.Comparator;

 public class OrderApp {
    public static String order(String words)
        {
            String res = "";
            String[] arr = words.trim().split(" ");
            for (int i = 1; i <= arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j].contains("" + i)) {
                        if (j != i-1)
                        {
                           res+= arr[j] + " ";
                        }
                    }
                }
            }

            res = res.substring(0, res.length()-1);
            return res;
        }
    public static String order2(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }


    public static void main(String[] args)
    {
        System.out.println(order("is2 Thi1s T4est 3a"));

    }


}