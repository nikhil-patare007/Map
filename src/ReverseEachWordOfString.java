package javademo.practice;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "Nikhil Patare";
        String[] words = str.split("\\s");
        StringBuilder reverseWord = new StringBuilder(" ");

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord.append(sb.toString()).append(" ");
        }

        System.out.println(reverseWord.toString().trim());
    }
}
