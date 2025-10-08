import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int canvasSize = 4*num - 3;
        
        char[][] canvas = new char[canvasSize][canvasSize];
        for(int i = 0; i < canvasSize; i++){
            for(int j = 0; j < canvasSize; j++){
               canvas[i][j] = ' ';
            }
        }

        addStars(0, canvas, num);
        
        for(int i = 0; i < canvasSize; i++){
            for(int j = 0; j < canvasSize; j++){
               System.out.print(canvas[i][j]);
            }
            System.out.println();
        }

    }

    private static void addStars(int start, char[][] array, int n) {
        if(n == 0){
            return;
        }
        
        int count = 4*n - 3;
        for(int i = start; i < start+count; i++){
            array[start][i] = '*';
            array[i][start] = '*';
            array[start+count-1][i] = '*';
            array[i][start+count-1] = '*';
        }
        
        addStars(start + 2, array, n - 1);
        
    }
}