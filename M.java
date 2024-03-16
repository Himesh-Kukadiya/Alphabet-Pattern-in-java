
public class M {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=n; j++) {
                if(j==1 || j==n || i==j && j<5 || i+j == 8 && j>=4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
