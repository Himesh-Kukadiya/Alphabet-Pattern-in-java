
public class P {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 5; j++) {
                if(j == 1 || (i == 1 || i == 4) && j < 4 || j==4 && (i>1 && i<4)) 
                    System.out.print(" * ");
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
