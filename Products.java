public class Products extends Goods {

    protected int expiration;

    public Products(String name, int prise, int amountOf, String unit,int expiration ){
        super(name, prise, amountOf, unit);
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s Expiration:%ddays",
                this.name, this.prise, this.amountOf, this.unit,this.expiration);
    
    }
        
}