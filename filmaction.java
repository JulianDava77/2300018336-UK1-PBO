// Kelas Anak FilmAction
class FilmAction extends Film {
    private int ratingAksi; // Nilai khusus untuk film action

    public FilmAction(String judul, double hargaSewa, int ratingAksi) {
        super(judul, hargaSewa); // Memanggil konstruktor kelas induk
        this.ratingAksi = ratingAksi;
    }

    public int getRatingAksi() {
        return ratingAksi;
    }

    public void setRatingAksi(int ratingAksi) {
        this.ratingAksi = ratingAksi;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Rating Aksi: " + ratingAksi);
    }
}
