public class String_rev {

    static void main() {
        String str = "reverse";
        char[] array = str.toCharArray();

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        String rev_String = new String(array);
        System.out.println(rev_String);

    }
}
