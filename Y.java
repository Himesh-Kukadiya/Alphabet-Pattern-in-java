
public class Y {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j==n/2+1 && i > 3 || (j == i || j + i == 8)  && i < 4) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
