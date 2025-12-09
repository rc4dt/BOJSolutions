import java.util.*;

public class Main {

    Scanner scnr = new Scanner(System.in);

    public void solution() {
        int n = scnr.nextInt();

        for (int i = 0; i < n; i++) {

            int guests = scnr.nextInt();
            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < guests; j++) {
                int code = scnr.nextInt();

                if (set.contains(code)) {
                    set.remove(code);
                } else {
                    set.add(code);
                }
            }

            int lonely = set.iterator().next();
            System.out.println("Case #" + (i + 1) + ": " + lonely);
        }
    }

    public static void main(String[] args) {
        new Main().solution();
    }
}
