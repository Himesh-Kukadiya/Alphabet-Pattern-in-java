
public class O {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5; j++) {
                if((j==1 || j==5) && (i>1 && i<n) || (i==1 || i == n) && (j>1 && j<5))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
