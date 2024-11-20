public class firstOcc {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
public static void main(String[] args) {
    firstOcc obj = new firstOcc();
    System.out.println(obj.strStr("hello", "ll"));  // prints 2
}
}
