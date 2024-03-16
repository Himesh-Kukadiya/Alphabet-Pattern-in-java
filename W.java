
public class W {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < n*2; j++) {
                if(j==1 || j == n*2-1 || i+j == 8 || j-i == 6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
