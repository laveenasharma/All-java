public class Triangle {
    public static void main(String[] args) {
        int rows = 4;

        // Printing upper half of the triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing lower half of the triangle
        for (int i = rows-1; i >= 1; i--) {
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
