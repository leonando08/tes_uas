package tes;

public class HotelBooking {
    // atribut dan enkapsulasi
    private String nama;
    private String kodeBooking;
    
    // konstruktor
    public HotelBooking(String nama, String kodeBooking) {
        this.nama = nama;
        this.kodeBooking = kodeBooking;
    }
    
    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKodeBooking(String kodeBooking) {
        this.kodeBooking = kodeBooking;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getKodeBooking() {
        return kodeBooking;
    }

    // metode untuk menampilkan informasi pemesanan hotel
    public String tampilkanInfo(){
        return "Nama : " + getNama() +
                "\nKode Pemesanan : " + getKodeBooking();
    }
    
    // overloading metode untuk menambahkan informasi kelas kamar
    public String tampilkanInfo(String kelas){
        return tampilkanInfo() + "\nKelas Kamar : " + kelas;
    }
}

