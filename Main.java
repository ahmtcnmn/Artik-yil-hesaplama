import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        int yil, bolme;
        out.print("Artık yıl hesaplama programına hoş geldiniz.\nLütfen yılınızı giriniz : ");
        yil = input.nextInt();
        bolme = yil % 400;
        switch (bolme) {
            case 0:
                if (yil % 4000 == 0) out.print(yil + " yılınız artık yıl değildir.");
                else out.printf(yil + " yılınız artık yıldır.");
                break;
        }

    }
}