// Kelas Anak FilmComedy
class FilmComedy extends Film {
    private int tingkatKelucuan;

    public FilmComedy(String judul, double hargaSewa, int tingkatKelucuan) {
        super(judul, hargaSewa);
        this.tingkatKelucuan = tingkatKelucuan;
    }

    public int getTingkatKelucuan() {
        return tingkatKelucuan;
    }

    public void setTingkatKelucuan(int tingkatKelucuan) {
        this.tingkatKelucuan = tingkatKelucuan;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tingkat Kelucuan: " + tingkatKelucuan);
    }
}
