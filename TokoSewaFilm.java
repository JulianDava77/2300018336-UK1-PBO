// Kelas Main
public class TokoSewaFilm {
    public static void main(String[] args) {
        // Membuat objek film dari berbagai genre
        FilmAction filmAction = new FilmAction("Avengers: Endgame", 15000, 9);
        FilmDrama filmDrama = new FilmDrama("The Fault in Our Stars", 12000, "Romance");
        FilmComedy filmComedy = new FilmComedy("The Hangover", 13000, 8);

        // Membuat objek pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Budi", "Jl. Sudirman No. 23");

        // Menampilkan informasi pelanggan
        pelanggan1.tampilkanInfoPelanggan();
        System.out.println();

        // Menampilkan informasi film yang disewa dengan polymorphism
        Film[] daftarFilm = {filmAction, filmDrama, filmComedy};

        for (Film film : daftarFilm) {
            film.tampilkanInfo();
            System.out.println();
        }

        // Polymorphism dengan overloading
        filmAction.tampilkanInfo("Film Action Populer");
    }
}
