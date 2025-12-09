import java.util.*;

public class Main{
    Scanner sc = new Scanner(System.in);
    
    public void solution() {
        int n = sc.nextInt();
        
        Map<String,Integer> mp = new HashMap<>();
        mp.put("STRAWBERRY", 0);
        mp.put("BANANA", 0);
        mp.put("LIME", 0);
        mp.put("PLUM", 0);
        
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int num = sc.nextInt();
            
            mp.put(name, mp.get(name) + num);
            }
         for(int value : mp.values()) {
                if(value == 5){
                    System.out.print("YES");
                        return;
                }
            
        }
        System.out.print("NO");
        
    }
    
    public static void main(String[] args){
        new Main().solution();
    }
}