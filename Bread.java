public class Bread extends Products{

    private String type;
    public Bread(String name, int prise, int amountOf, String unit,int expiration,String type){
        super(name, prise, amountOf, unit, expiration);
        this.type = type;
    

    }
    @Override
    public String toString() {
        return String.format("Name:%s Prise:%dr Quantity:%d Unit:%s Expiration:%ddays Type:%s ",
                this.name, this.prise, this.amountOf, this.unit,this.expiration,this.type );
    }
} 
