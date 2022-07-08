package Morse;

public class MorseApp {
    public static String decode(String morseCode) {
        String res = "";

        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };
        morseCode = morseCode.trim();
        String[] array = morseCode.split(" ");


        // Morse code to English
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(""))
                if(!res.endsWith(" "))
                    res+= " ";

            if(array[i].equals("···−−−···"))
                res+= "SOS";
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {
                    if(array[i].startsWith(" "))
                        res+= " ";
                    res += (char)(j + 'a') ;

                    break;
                }

            }
        }
        res = res.toUpperCase();
        return res;
    }
    public static void main(String[] args)
    {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };
        // Morse code by indexing


        String input = ".... . -.--   .--- ..- -.. .";
        System.out.println(decode(input));
    }
}
