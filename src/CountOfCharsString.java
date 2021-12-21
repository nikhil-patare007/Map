package javademo.practice;

public class CountOfCharsString {

    public static void main(String[] args) {
        String str = "nikhil patare";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count ++;
            }
        }

        System.out.println("Count of character in string " + str + " is " +count);

    }
}

