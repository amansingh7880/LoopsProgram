package pattern;

public class ResetPat {
    public static void main(String[] args) {
        String str="retest";
        for (int i = str.length(); i>=0 ; i--) {
            System.out.println(str.substring(0,i)+" ");
        }
    }


}
