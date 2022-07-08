package start;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class app {
    public static boolean check(String sentence){
        sentence = sentence.toLowerCase();

       if(sentence.contains("q") &&sentence.contains("w") &&sentence.contains("e") &&sentence.contains("r") &&sentence.contains("t") &&sentence.contains("y") &&sentence.contains("u") &&
               sentence.contains("i") &&sentence.contains("o") &&sentence.contains("p") &&sentence.contains("a") &&sentence.contains("s") &&sentence.contains("d") &&sentence.contains("f") &&
               sentence.contains("g") &&sentence.contains("h") &&sentence.contains("j") &&sentence.contains("k") &&sentence.contains("l") &&sentence.contains("z") &&sentence.contains("x") &&
               sentence.contains("c") &&sentence.contains("v") &&sentence.contains("b") &&sentence.contains("n") &&sentence.contains("m") )
       {return true;}
           return false;
    }
    public static void main(String[] args)
    {
        String input = "The quick rown fox jumps over the lazy dog.";
         System.out.println(check(input));
    }
}
