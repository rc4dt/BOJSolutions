import java.io.*;

public class Main {

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" "); // splits by space
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);

    br.close();
    System.out.println(cows(a,b));
}


    static long cows(int x, int y){
        if (x % 2 == 0 || y % 2 == 0 || x < 1 || y < 1){
            return 0;
        }

        return 1 + 4*cows(x / 2, y / 2);
    }
}
        