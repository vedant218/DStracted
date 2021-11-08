import java.util.Scanner;

public class program25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word:");
        String string = sc.nextLine();
        String s = string.toLowerCase();
        for (int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                System.out.println("The word is not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("The word is a palindrome");
    }
}