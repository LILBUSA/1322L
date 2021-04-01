public class Assignment8 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //String foldString = paperFold(i);
            //System.out.println("For " + i + " folds we get: " + foldString + "\n");
        }
    }

    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        if (arr.length > 0) {
            return Character.toString(arr[arr.length - 1]) + reverse(str.substring(0, str.length() - 1));
        } else {
            return "";
        }
    }

    public static String flip(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '^') {
                arr[i] = 'v';
            } else if (arr[i] == 'v') {
                arr[i] = '^';
            }
        }
        return new String(arr);
    }

//    public static String paperFold(int n) {
//        if (n > 0) {
//            if () {
//
//            }
//            String s = reverse(str);
//            s = flip(s);
//            s += "v";
//            s += str;
//            str = s;
//            return paperFold(n - 1);
//        } else {
//            return "";
//        }
//    }
}
