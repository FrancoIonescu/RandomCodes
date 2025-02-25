import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti sirul de caractere: ");
        String input = scanner.nextLine();

        String binaryString = stringToBinary(input);
        System.out.println("Sirul in format binar: " + binaryString);

        String originalString = binaryToString(binaryString);
        System.out.println("Sirul original: " + originalString);
    }

    private static String stringToBinary(String text) {
        StringBuilder binary = new StringBuilder();
        for (char character : text.toCharArray()) {
            String binaryChar = String.format("%8s", Integer.toBinaryString(character))
                    .replaceAll(" ", "0");
            binary.append(binaryChar).append(" ");
        }
        return binary.toString().trim();
    }

    private static String binaryToString(String binaryText) {
        String[] binaryChars = binaryText.split(" ");
        StringBuilder text = new StringBuilder();
        for (String binaryChar : binaryChars) {
            int charCode = Integer.parseInt(binaryChar, 2);
            text.append((char) charCode);
        }
        return text.toString();
    }
}