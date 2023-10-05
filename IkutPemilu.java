package percabangan;
import java.util.Scanner;
public class IkutPemilu {
    public static void main(String[] args) {Scanner input = new Scanner (System.in);

    System.out.println("Masukkan Bilangan: ");
    int umur = input.nextInt();

    if(umur >=17){System.out.println("Boleh ikut pemilu");
    }

    else{System.out.println("Tidak boleh ikut pemilu");
    }
}
}
