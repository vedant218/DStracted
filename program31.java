import java.util.Scanner;

public class program31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = sc.nextLine();

        int i=0,upper=0,lower=0,special=0,blank=0,digit=0;
        while(i<str.length())
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                upper++;
            }
            else if (Character.isLowerCase(str.charAt(i)))
            {
                lower++;
            }
            else if(Character.isDigit(str.charAt(i)))
            {
                digit++;
            }
            else if(Character.isWhitespace(str.charAt(i))) {
                blank++;
            }
            else
            {
                special++;
            }
            i++;
        }

        System.out.println("Upper Case = "+upper);
        System.out.println("Lower Case = "+lower);
        System.out.println("Special Character = "+special);
        System.out.println("Digit = "+digit);
        System.out.println("Blank Space = "+blank);

    }


}