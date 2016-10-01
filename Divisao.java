import java.util.Scanner;

public class Divisao{

    public static void main(String[] args) {

        int k, n, m, x, y, i;
        Scanner reader = new Scanner(System.in);
        
        while (reader.hasNext()){
            k = reader.nextInt();
            if (k == 0) {
                break;
            }
            n = reader.nextInt();
            m = reader.nextInt();

            for (i = 0; i < k; i++) {
                x = reader.nextInt();
                y = reader.nextInt();
                if (x == n || y == m) {
                    System.out.printf("divisa\n");
                } else if (x > n && y > m) {
                    System.out.printf("NE\n");
                } else if (x > n && y < m) {
                    System.out.printf("SE\n");
                } else if (x < n && y > m) {
                    System.out.printf("NO\n");
                } else if (x < n && y < m) {
                    System.out.printf("SO\n");
                }
            }
        }
    }
}
