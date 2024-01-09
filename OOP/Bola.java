package BuAul.PBO.Enkasulapsi.ModulEnkasulapsi.OOP;

public class Bola {
    private double jariJari;

    public Bola() {
        this.jariJari = 0.0;
    }

    public void setJariJari(double jariJari) {
        if (jariJari > 0) {
            this.jariJari = jariJari;
        } else {
            System.out.println("Jari-jari harus lebih dari 0.");
        }
    }

    public double showDiameter() {
        return 2 * jariJari;
    }

    public double showLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double showVolume() {
        return (4/3) * Math.PI * Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        // Langkah 1: Membuat variable Jarijari
        double jariJariVariable = 5.0;

        // Langkah 2: Menciptakan objek Bola
        Bola bolaObjek = new Bola();

        // Langkah 3: Memanggil method showDiameter(), showLuasPermukaan(), dan showVolume()
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());

        // Langkah 4: Memanipulasi objek dengan memanggil method setJariJari()
        bolaObjek.setJariJari(jariJariVariable);

        // Langkah 5: Menampilkan hasil setelah manipulasi
        System.out.println("\nSetelah manipulasi:");
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());
    }

}
