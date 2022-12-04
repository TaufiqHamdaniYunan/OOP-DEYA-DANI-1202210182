public class Handphone extends Perangkat {
    protected boolean fingerprint;
    Handphone(String drive, int ram, float processor,boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    };
    
    
    public void telfon(int no_hp){
        System.out.printf("handphone berhasil menyambungkan telfon ke no %d\n",no_hp);
    };
    public void kirimSMS(int no_hp){
        System.out.printf("handphone berhasil mengirim sms ke no %d\n",no_hp);
    };
    public void kirimSMS(int no_hp1,int no_hp2){
        System.out.printf("handphone berhasil mengirim sms ke nomor %d dan %d\n",no_hp1,no_hp2);
    };

    public void informasi(){
        if(this.fingerprint){
            System.out.printf("Handphone ini memiliki drive tipe %s dengan ram sebesar %d gb dan processor secepat %.2f Ghz processor. Handphone ini memiliki fingerprint sensor.\n",this.drive,this.ram,this.processor);
        }
        else{
            System.out.printf("Handphone ini memiliki drive tipe %s dengan ram sebesar %d gb dan processor secepat %.2f Ghz processor. Handphone ini Tidak memiliki fingerprint\n",this.drive,this.ram,this.processor);
        }
    };
    
}
