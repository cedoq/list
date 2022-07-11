import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
        String[] b = new String[a.length];
        int i;
        int k = 0;
        for(i=a.length-1;i>=0;i--){
            b[k] = a[i];
            k++;
        }
        System.out.println(Arrays.toString(b));
    }
}