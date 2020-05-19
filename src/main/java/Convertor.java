public class Convertor {
    public static String convertMatrix(String matrix, String word) {
        int sizeOfMatrix = (int) Math.sqrt(matrix.length());
        if (Math.pow(sizeOfMatrix, 2) != matrix.length()) {
            return null;
        }
        StringBuilder matrixOfChars = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < matrix.length(); i++) {
            matrixOfChars.append(matrix.charAt(i));
            matrixOfChars.append("   ");
            if ((i + 1) % sizeOfMatrix == 0) {
                matrixOfChars.append("\n");
            }
        }
        for (int i = 0; i < word.length(); i++) {
            int indexOfChar = matrix.indexOf(word.charAt(i));
            result.append('[');
            if (indexOfChar != -1) {
                result.append(indexOfChar / sizeOfMatrix);
                result.append(indexOfChar - indexOfChar / sizeOfMatrix * sizeOfMatrix);
            } else {
                result.append("Not found");
            }
            result.append(']');
            if (i != word.length() - 1) {
                result.append("->");
            }
        }
        result.append("\n");
        result.append(matrixOfChars);
        return result.toString();
    }
}
