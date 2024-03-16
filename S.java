
public class S {
    public static void main(String[] args) {
        int n = 7, n1=5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n1; j++) {
                if((i==1 || i == 4 || i == n) && (j>1 && j<n1) || (j == 1) && (i>1 && i <4) || (j == n1) && (i>4 && i < n) || i==1 && j == 5 || j == 1 && i == n)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
