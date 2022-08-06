public class Eggs extends Products{

    private int amountInPack;
    public Eggs(String name, int prise, int amountOf, String unit,int expiration, int amountInPack){
        super(name, prise, amountOf, unit, expiration);
        this.amountInPack = amountInPack;

    }
    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s Expiration:%ddays InPack:%dthings ",
                this.name, this.prise, this.amountOf, this.unit,this.expiration,this.amountInPack);
    
    }
} 