public class findCapital {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0)return true;
        int count = 0;
        int length = word.length();

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 65 && ch < 91)count++;
        }
        if(count == length)return true;
        if(count == 0)return true;
        if(count == 1 && word.charAt(0) >= 65 && word.charAt(0) < 91)return true;

        return false;
    }
    public static void main(String[] args) {
        findCapital obj = new findCapital();
        System.out.println(obj.detectCapitalUse("USA")); // true
    }
}
