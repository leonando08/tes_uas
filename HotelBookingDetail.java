package tes;

// pewarisan (inheritance)
public class HotelBookingDetail extends HotelBooking {
    // konstruktor
    public HotelBookingDetail(String nama, String kodeBooking) {
        super(nama, kodeBooking);
    }

    public String getInfoTambahan() {
        String kodePro = getKodeBooking().substring(0, 2);
        //seleksi if
        if(kodePro.equals("10")) {
            return "Tambahan Kasur";
        } else {
            return "Tidak Ada Tambahan";
        }
      }
    // metode tambahan untuk mendapatkan informasi kamar yang dipesan
    public String getInfoKamar() {
        String kodeKamar = getKodeBooking().substring(2, 5);
        switch(kodeKamar) {
            case "101":
                return "Kamar Deluxe, dengan pemandangan laut.";
            case "201":
                return "Suite, dengan fasilitas lengkap.";
            default:
                return "Tipe kamar tidak diketahui.";
        }
    }
    
     public int gettanggalBooking() throws Exception {
        int tanggal = Integer.parseInt(getKodeBooking().substring(5));
        if (tanggal > 31) {
            throw new Exception("Tanggal tidak boleh lebih dari 31");
        }
        return tanggal;
    }

    // override metode tampilkanInfo dari superclass
    @Override
    public String tampilkanInfo() {
        try {
            return super.tampilkanInfo() +
                    "\nInfo Diskon : " + getInfoTambahan() +
                    "\nInfo Kamar : " + getInfoKamar() +
                    "\nTanggal Masuk : " + gettanggalBooking();
        } catch (Exception e) {
            return super.tampilkanInfo() +
                    "\nKesalahan: " + e.getMessage();
        }
    }
}

