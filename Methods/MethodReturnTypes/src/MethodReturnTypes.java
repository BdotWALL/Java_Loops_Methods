
public class MethodReturnTypes {
    public static void main(String[] args) throws Exception {
       String phrase = returnString("String of text");
       int number = returnInt(5);
       Boolean  boo = returnBoo(false);

        System.out.println(phrase);
        System.out.println(number);
        System.out.println(boo);


    }

    public static String returnString (String text) {
            return text;
        }
     

     public static int returnInt(int num1) {
         return  num1 ;
     }

     public static boolean returnBoo(boolean trueOrFalse) {
        return trueOrFalse;
            }
        }
    

