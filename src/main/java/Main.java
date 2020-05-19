import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! If you want to quit program then write 'q'");
        while (true) {
            System.out.print("Input a matrix: ");
            String matrix = scanner.nextLine();
            System.out.print("Input a word: ");
            String word = scanner.nextLine();
            if (word.equals("q") || matrix.equals("q")) {
                scanner.close();
                break;
            }
            if (Convertor.convertMatrix(matrix, word) != null) {
                System.out.println(Convertor.convertMatrix(matrix, word));
            } else {
                System.out.println("Not valid matrix!");
            }
        }
    }
}
