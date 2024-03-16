
public class R {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 4; j++) {
                if(j == 1 || (i == 1 || i == 4) && j<4 || i-3 == j || j == 4 && (i==2 || i==3))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
