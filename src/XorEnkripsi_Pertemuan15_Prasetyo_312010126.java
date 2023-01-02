import java.util.Scanner;



import java.util.Scanner;

public class XorEnkripsi_Pertemuan15_Prasetyo_312010126 {
        public static Scanner in;
        public static void main(String[] args) {
            in = new Scanner(System.in);
            System.out.print("Masukan Pesan Yang Akan Di Enkripsi: ");
            String msg = in.nextLine();

            System.out.print("Masukan Kuncinya: ");
            String key = in.nextLine();

            String encrypHexa = "";
            int keyItr = 0;
            for (int i = 0; i < msg.length(); i++) {
                // XOR Operation
                int temp = msg.charAt(i) ^ key.charAt(keyItr);

                encrypHexa += String.format("%02x", (byte)temp);
                keyItr++;
                if(keyItr >= key.length()){
                    
                    keyItr = 0;
                }

            }

            System.out.println("Pesan Sudah terenkripsi: " + encrypHexa);
        }
    }

