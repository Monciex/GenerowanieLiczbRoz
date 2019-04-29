import java.util.Arrays;
import java.util.Random;

class main {

    public static void main(String[] args) {

        int[] wek = new int[100];

        Random r = new Random();

        for(int i = 0; i < wek.length -1; i++) {
            int a = r.nextInt(5) +1;
            wek[0] = a;
            wek[i + 1] = wek[i] + a; 
        }
        System.out.println(Arrays.toString(wek)); 
    }
}