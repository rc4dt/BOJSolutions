import java.io.*;

public class Main {

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" "); // splits by space
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);

    br.close();
    System.out.println(rectangle(a,b));
}


    static int rectangle(int x, int y){
        if(x == 0 || y == 0){
            return 0;
        }
        if (x == 1 || y == 1){
            return x*y;
        }
        if (x==y){
            return 1;
        }

        if(x > y){
            return 1 + rectangle(x-y, y);
        }else if (y > x){
            return 1 + rectangle(y-x, x);
        }
        
        return 0;
    }
}
        