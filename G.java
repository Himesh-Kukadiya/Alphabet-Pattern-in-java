
public class G {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5; j++) {
                if((i>2 && i < 6 && j == 1) || i+j == 4 || (i==1 && j>3) || i-j == 4 || (i==7 && j>3) || j==5 && i>4 || i==4 && j >= 3) 
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
