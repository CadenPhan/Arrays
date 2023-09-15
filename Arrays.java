
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
        System.out.println(" ");
        i = 10;
        f += i;
        flag = !flag;
        i++;
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        System.out.println(" ");
        String str1 = "I am a string";
        String str2 = str1;
        String str3 = "I am also a string";
        boolean stringsEqual = str1.equals(str3);     
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(stringsEqual);
        System.out.println(" ");
        String[] strArray = {"Alpha","Beta","Charlie","Delta","Echo"};
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.println(strArray[iterate]);
        }
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate] + " ");
        }
            System.out.println(" ");
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
            if (iterate < strArray.length - 1) {
                System.out.print("-");
            }
        }
    } 
}   
