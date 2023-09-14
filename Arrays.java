
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class  Arrays
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i;
        double f = 2.5;
        boolean flag = true;
        i = 10;
        f += i;
        flag = !flag;
        i++;
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        String str1 = "I am a string";
        String str2 = str1;
        String str3 = "I am also a string";
        boolean stringsEqual = str1.equals(str3);     
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(stringsEqual);
        String[] strArray = {"Alpha","Beta","Charlie","Delta","Echo"};
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.println(strArray[iterate]);
        }
        System.out.println(" ");
        for (String value : strArray) {
            System.out.print(strArray);
            
        }
    }
}
