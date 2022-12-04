public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;
    Perangkat(String drive,int ram,float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi(){
        System.out.printf("Perangkat tidak diketahui memiliki drive tipe %s dengan ram sebesar %d dan juga memiliki processor secepat %.2f Ghz.\n",this.drive,this.ram,this.processor);
    }
}
