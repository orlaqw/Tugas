package BuAul.PBO.Enkasulapsi.ModulEnkasulapsi.OOP;

public class UjiBus2 {
    public static void main(String[] args) {
        Bus2 busMini = new Bus2(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
    }


}
