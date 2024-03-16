
public class J {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 7; j++) {
                if(j==6 && i <6 || i == 1 || i+j == 11 && j < 7 || i==n && j ==3 || i-j == 4) 
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
