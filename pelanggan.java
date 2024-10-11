// Kelas Induk Pelanggan
class Pelanggan {
    private String nama;
    private String alamat;

    public Pelanggan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tampilkanInfoPelanggan() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
