public class Laptop extends Perangkat{
    protected boolean webcam;
    Laptop(String drive, int ram, float processor,boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    public void informasi(){
        if(this.webcam){
            System.out.printf("Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. laptop ini juga memiliki Webcam\n",this.drive,this.ram,this.processor);
        }
        else{
            System.out.printf("Laptop ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. laptop ini tidak dilengkapi dengan webcam\n",this.drive,this.ram,this.processor);
        }
    };
    public void bukaGame(String nama_game){
        System.out.printf("Laptop berhasil membuka game %s\n",nama_game);
    };
    public void kirimEmail(String email1){
        System.out.printf("Laptop berhasil mengirim email ke %s\n",email1);
    };
    public void kirimEmail(String email1,String email2){
        System.out.printf("Laptop berhasil mengirim email ke %s dan ke %s\n",email1,email2);
    }
}
