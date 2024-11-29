public class segment {
    public int countSegments(String s) {
       
        String[] words = s.split(" ");
        int count = 0;

   
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        segment s = new segment();
        System.out.println(s.countSegments("Hello, World!")); // 2
    }
}
