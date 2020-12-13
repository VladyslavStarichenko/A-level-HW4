import java.util.*;
import java.lang.*;


public class Task1 {

    public static void main(String[] args) {
        String test = "Школа А-левел задание";
        System.out.println("Transliteration result for hardcode string equals:" + " " + Transliteration(test));
        System.out.println("Enter your text to transliterate, max size : 30 char");
        Scanner scanner = new Scanner(System.in);
        String testString =  scanner.nextLine();
        if(testString.length() <= 30){
            System.out.println("Transliteration result for input string equals:" + " " + Transliteration(testString));
        }
        else if(testString.length() > 30){
            System.out.println("Your string is too long, reload the app and try again with string length <= 30");
        }

        System.out.println("If you wanna try again press 1 to reload the app");
        Scanner reloadScanner = new Scanner(System.in);
        int reloadBut =  reloadScanner.nextInt();

        if (reloadBut == 1){
            restart(args);
        }
        else if(reloadBut != 1){
            System.out.println("You've finished the process");
        }

    }


    private static void restart(String[] strArr)
    {
        System.out.println("You restarted");
        main(strArr);
    }


    private static final Map<String, String> alphabet = new HashMap<>();
    static{
        alphabet.put("А", "A"); alphabet.put("Б", "B"); alphabet.put("В", "V");
        alphabet.put("Г", "G"); alphabet.put("Д", "D"); alphabet.put("Е", "E");
        alphabet.put("Ё", "Yo"); alphabet.put("Ж", "Zh"); alphabet.put("З", "Z");
        alphabet.put("И", "I"); alphabet.put("Й", "I"); alphabet.put("К", "K");
        alphabet.put("Л", "L"); alphabet.put("М", "M"); alphabet.put("Н", "N");
        alphabet.put("О", "O"); alphabet.put("П", "P"); alphabet.put("Р", "R");
        alphabet.put("С", "S"); alphabet.put("Т", "T"); alphabet.put("У", "U");
        alphabet.put("Ф", "F"); alphabet.put("Х", "Kh"); alphabet.put("Ц", "C");
        alphabet.put("Ч", "Ch"); alphabet.put("Ш", "Sh"); alphabet.put("Щ", "Sch");
        alphabet.put("Ъ", "'"); alphabet.put("Ы", "Y"); alphabet.put("Ь" , "'");
        alphabet.put("Э", "E"); alphabet.put("Ю", "Yu"); alphabet.put("Я", "Ya");
        alphabet.put("а", "a"); alphabet.put("б", "b"); alphabet.put("в", "v");
        alphabet.put("г", "g"); alphabet.put("д", "d"); alphabet.put("е", "e");
        alphabet.put("ё", "yo"); alphabet.put("ж", "zh"); alphabet.put("з", "z");
        alphabet.put("и", "i"); alphabet.put("й", "i"); alphabet.put("к", "k");
        alphabet.put("л", "l"); alphabet.put("м", "m"); alphabet.put("н", "n");
        alphabet.put("о", "o"); alphabet.put("п", "p"); alphabet.put("р", "r");
        alphabet.put("с", "s"); alphabet.put("т", "t"); alphabet.put("у", "u");
        alphabet.put("ф", "f"); alphabet.put("х", "h"); alphabet.put("ц", "c");
        alphabet.put("ч", "ch"); alphabet.put("ш", "sh"); alphabet.put("щ", "sch");
        alphabet.put("ь", "'");  alphabet.put("ъ", "'"); alphabet.put("ы", "y");
        alphabet.put("э", "e"); alphabet.put("ю", "yu"); alphabet.put("я", "ya");
    }

    public static String Transliteration(String translateString){
        StringBuilder sb = new StringBuilder(translateString.length());
        for(int i = 0; i < translateString.length(); i++){
            String sub = translateString.substring(i, i+1);
            if(alphabet.containsKey(sub)){
                sb.append(alphabet.get(sub));
            }
            else {
                sb.append(sub);
            }
        }
        return sb.toString();
    }



}


