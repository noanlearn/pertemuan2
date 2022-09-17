public class Pertemuan2 {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Manusia m = new Manusia();
        PesawatTelepon t = new PesawatTelepon();

        // Pemanggilan Class Hewan Method makan() 
        System.out.println("Hewan Anda sedang makan " + h.makan("Ikan cuek"));

        // Pemanggilan Class Manusia Method tidur()
        System.out.println("Apakah manusia itu sedang tertidur ? " + m.tidur(true));

        // Pemanggilan Class PesawatTelepon Method melakukan_pemanggilan()
        System.out.println("Anda sedang memanggil " + t.melakukan_panggilan("+62-8953-8311-1382") + " ...");

        // Interaksi Class Manusia dengan Class PesawatTelepon
        System.out.println("Hewan itu sedang " + h.bermain("bola") + " sementara Manusia sedang " + m.memasak("Rendang"));
        
        // Manusia dan Hewan bermain lari-larian
        System.out.println("Manusia " + m.bermain("dan hewan bermain "+h.bermain("lari-larian")));
        
        
    }
}
