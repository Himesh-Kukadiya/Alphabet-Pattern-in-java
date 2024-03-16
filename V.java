
public class V {
    public static void main(String[] args) {
        int n = 7;
        for(int i = n; i >=1; i--) {
            for(int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                if(i==j || j==1) {
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
