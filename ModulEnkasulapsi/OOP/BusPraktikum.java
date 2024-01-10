package BuAul.PBO.Enkasulapsi.ModulEnkasulapsi.OOP;

public class BusPraktikum {

    private double penumpang, maxPenumpang, counter, penumpangBaru;

    //Constructor
    public BusPraktikum(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        counter = 0;
        penumpangBaru = 0;
    }

    //Method mutator 
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang){
            System.out.println("Overload penumpang");
        } else {
            this.penumpang = temp;
            counter++;
            penumpangBaru += penumpang;
        }
    }
    
    public void getPenumpang(double penumpang){
        double temp;
        temp = (double) this.penumpang - penumpang;
        if (temp < 0){
            System.out.println("Jumlah penumpang tidak bisa kurang dari 0");
        } else {
            this.penumpang = temp;
            counter--;
            penumpangBaru -= penumpang;
        }
    }

    public double getAverage(){
        if (counter == 0) {
            return 0;
        } else {
            return penumpangBaru / counter;
        }
    }

    public void cetak(){
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("penumpang seharusnya adalah = " + maxPenumpang);
        System.out.println("Rata-rata berat penumpang = " + getAverage());
    }
}
