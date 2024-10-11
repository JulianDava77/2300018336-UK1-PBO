// Kelas Induk Film
class Film {
    private String judul;
    private double hargaSewa;

    public Film(String judul, double hargaSewa) { // Constructor
        this.judul = judul;
        this.hargaSewa = hargaSewa;
    }

    // Setter dan Getter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    // Method umum yang bisa di override
    public void tampilkanInfo() {
        System.out.println("Judul Film: " + judul);
        System.out.println("Harga Sewa: Rp" + hargaSewa);
    }

    // Polymorphism dengan overloading
    public void tampilkanInfo(String tambahan) {
        System.out.println(tambahan + " - Judul Film: " + judul);
    }
}
