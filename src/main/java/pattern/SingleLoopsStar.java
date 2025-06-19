package pattern;

public class SingleLoopsStar {
    public static void main(String[] args) {
        String pattern="";
        int rows=5;
        for (int i = 1; i <=rows ; i++) {
            pattern+="*";
            System.out.println(pattern);
        }
    }

}
