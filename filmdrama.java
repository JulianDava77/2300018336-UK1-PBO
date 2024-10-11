// Kelas Anak FilmDrama
class FilmDrama extends Film {
    private String genreDrama;

    public FilmDrama(String judul, double hargaSewa, String genreDrama) {
        super(judul, hargaSewa);
        this.genreDrama = genreDrama;
    }

    public String getGenreDrama() {
        return genreDrama;
    }

    public void setGenreDrama(String genreDrama) {
        this.genreDrama = genreDrama;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Genre Drama: " + genreDrama);
    }
}
