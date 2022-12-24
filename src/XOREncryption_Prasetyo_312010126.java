import java.util.Scanner;

public class XOREncryption_Prasetyo_312010126 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks yang akan dienkripsi: ");
        String text = sc.nextLine();
        System.out.print("Masukkan kunci enkripsi: ");
        String key = sc.nextLine();

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            encryptedText.append((char)(text.charAt(i) ^ key.charAt(i % key.length())));
        }

        System.out.println("Teks terenkripsi: " + encryptedText);

        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            decryptedText.append((char)(encryptedText.charAt(i) ^ key.charAt(i % key.length())));
        }

        System.out.println("Teks terdekripsi: " + decryptedText);
    }
}
