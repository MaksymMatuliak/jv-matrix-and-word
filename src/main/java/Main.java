import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Input a matrix: ");
            String matrix = in.nextLine();
            System.out.print("Input a word: ");
            String word = in.nextLine();
            if (word.equals("q") || matrix.equals("q")) {
                in.close();
                break;
            }
            if (matrixConvertor.convertor(matrix, word) != null) {
                System.out.println(matrixConvertor.convertor(matrix, word));
            } else {
                System.out.println("Not valid matrix!");
            }
        }
    }
}
