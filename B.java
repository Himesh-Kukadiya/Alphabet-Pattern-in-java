
public class B {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<= 4; j++) {
                if(j==1 || (i == 1 || i == 4 || i == n) && j<4 || (i>1 && i<4 ||  i>4 && i<n) && j == 4) 
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
