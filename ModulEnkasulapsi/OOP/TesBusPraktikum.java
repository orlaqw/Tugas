package BuAul.PBO.Enkasulapsi.ModulEnkasulapsi.OOP;

public class TesBusPraktikum {
    public static void main(String[] args) {
        BusPraktikum busMini = new BusPraktikum(10);
        busMini.addPenumpang(5);
        busMini.addPenumpang(6);
        busMini.getPenumpang(10);   
        busMini.getPenumpang(15);
        busMini.cetak();

        busMini.getAverage();
        busMini.cetak();
    }

}
