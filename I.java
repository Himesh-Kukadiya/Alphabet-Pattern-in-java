
public class I {
    public static void main(String[] args) {
        int n = 7; 
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5; j++) {
                if(j==3 || i == 1 || i == n)
                    System.out.print(" * ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
    }
}
