public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perngkt = new Perangkat("Adata",2,1.80f);
        Handphone hp = new Handphone("Sandisk",3,2.20f,true);
        Laptop laptop = new Laptop("Sandisk", 8, 2.40f, true);
        perngkt.informasi();
        System.out.println();
        hp.informasi();
        hp.telfon(628122122);
        hp.kirimSMS(62852112);
        hp.kirimSMS(628121212,629292211);
        System.out.println();
        laptop.informasi();
        laptop.bukaGame("Dota 2");
        laptop.kirimEmail("taufiq@mail.com");
        laptop.kirimEmail("taufiq@gmail.com","yunan@gmail.com");

    }
}
    