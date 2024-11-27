
package Model;

import java.util.Date;

import java.io.File;

public class KTP {
    private String nik;
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String jenisKelamin;
    private String golDarah;
    private String alamat;
    private String rtRw;
    private String kelDesa;
    private String kecamatan;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private String wargaNegaraAsal;
    private File fotoFilePath;
    private File tandaTanganFilePath;
    private String berlakuHingga;
    private String kotaPembuatan;
    private String tanggalPembuatan;
    
    public KTP(String nik, String nama, String tempatLahir, String tanggalLahir, String jenisKelamin,
            String golDarah, String alamat, String rtRw, String kelDesa, String kecamatan, String agama,
            String statusPerkawinan, String pekerjaan, String kewarganegaraan, String wargaNegaraAsal,
            File fotoFilePath, File tandaTanganFilePath, String berlakuHingga, String kotaPembuatan,
            String tanggalPembuatan) {
        this.nik = nik;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.golDarah = golDarah;
        this.alamat = alamat;
        this.rtRw = rtRw;
        this.kelDesa = kelDesa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.wargaNegaraAsal = wargaNegaraAsal;
        this.fotoFilePath = fotoFilePath;
        this.tandaTanganFilePath = tandaTanganFilePath;
        this.berlakuHingga = berlakuHingga;
        this.kotaPembuatan = kotaPembuatan;
        this.tanggalPembuatan = tanggalPembuatan;
    }
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTempatLahir() {
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getGolDarah() {
        return golDarah;
    }
    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getRtRw() {
        return rtRw;
    }
    public void setRtRw(String rtRw) {
        this.rtRw = rtRw;
    }
    public String getKelDesa() {
        return kelDesa;
    }
    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }
    public String getKecamatan() {
        return kecamatan;
    }
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    public String getAgama() {
        return agama;
    }
    public void setAgama(String agama) {
        this.agama = agama;
    }
    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }
    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }
    public String getWargaNegaraAsal() {
        return wargaNegaraAsal;
    }
    public void setWargaNegaraAsal(String wargaNegaraAsal) {
        this.wargaNegaraAsal = wargaNegaraAsal;
    }
    public File getFotoFilePath() {
        return fotoFilePath;
    }
    public void setFotoFilePath(File fotoFilePath) {
        this.fotoFilePath = fotoFilePath;
    }
    public File getTandaTanganFilePath() {
        return tandaTanganFilePath;
    }
    public void setTandaTanganFilePath(File tandaTanganFilePath) {
        this.tandaTanganFilePath = tandaTanganFilePath;
    }
    public String getBerlakuHingga() {
        return berlakuHingga;
    }
    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }
    public String getKotaPembuatan() {
        return kotaPembuatan;
    }
    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }
    public String getTanggalPembuatan() {
        return tanggalPembuatan;
    }
    public void setTanggalPembuatan(String tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }

}