package Duplicate;

public class DuplicateApp {
    public static String duplicate(String input)
    {
        char[] arr = input.toLowerCase().toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ')
                result+=" ";
            else
            {
                boolean isDuplicate = false;
                for (int j = 0; j < arr.length; j++) {
                    if(j != i)
                        if(arr[i] == arr[j])
                            isDuplicate = true;

                }
                if(isDuplicate)
                    result+= "(";
                else
                    result+=")";
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        String input = "HelLo";
        System.out.println(duplicate(input));
    }
}
