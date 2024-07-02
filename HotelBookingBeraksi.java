package tes;

import java.util.Scanner;

public class HotelBookingBeraksi {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // array untuk menyimpan data pemesanan hotel
            HotelBookingDetail[] bookings = new HotelBookingDetail[2];

            // perulangan untuk mengisi data pemesanan hotel
            for (int i = 0; i < bookings.length; i++) {
                System.out.println("Masukkan Data Pemesanan Hotel ke " + (i + 1));
                System.out.print("Nama Pemesan: ");
                String nama = scanner.nextLine();
                System.out.print("Kode Pemesanan (contoh: 1010118): ");
                String kodeBooking = scanner.nextLine();

                bookings[i] = new HotelBookingDetail(nama, kodeBooking);
            }

            // menampilkan informasi pemesanan hotel
            System.out.println("\nData Pemesanan Hotel:");
            for (HotelBookingDetail data : bookings) {
                System.out.println("=================");
                System.out.println("Detail Pemesanan Hotel:");
                System.out.println(data.tampilkanInfo());
            }
        
        }
        catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor" +e.getMessage());
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("kesalahan Format Kode Kamar"+e.getMessage()); 
        }
        catch (Exception e){
            System.out.println("Kesalahan Kode Promo :"+e.getMessage());  
        } 
    }
}

