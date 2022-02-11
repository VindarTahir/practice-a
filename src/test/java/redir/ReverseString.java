package redir;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Group1";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);

        }

        System.out.println("This is the original word: " + str);
        System.out.println("This is the reversed word: " + reverse);


    }

}
