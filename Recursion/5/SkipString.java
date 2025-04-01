public class SkipString {
    public static String ans = "";

    public static void main(String[] args) {
        String ques = "aanigapplega";

        System.out.println(skipApple(ques));

        String two = "appdaappleappapple";

        System.out.println(skip(two));
    }

    public static String skipApple(String ques) {

        if (ques.isEmpty()) {
            return "";
        }
        if (ques.startsWith("apple")) {
            return skipApple(ques.substring(5));
        } else {
            return ques.charAt(0) + skipApple(ques.substring(1));
        }

    }

    // Skip particular sequecnce when not equal apple ---> aabbappbiappleonly app is
    // in first is skipped not in apple
    public static String skip(String ques) {

        if (ques.isEmpty()) {
            return "";
        }

        if (ques.startsWith("app") && !ques.startsWith("apple")) {
            return skip(ques.substring(3));
        } else {
            return ques.charAt(0) + skip(ques.substring(1));
        }

    }
}
