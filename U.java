
public class U {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((j==1 || j == n) && (i < n-2) || i-j == 4 || i+j == 12 || i==n && j == 4) 
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
