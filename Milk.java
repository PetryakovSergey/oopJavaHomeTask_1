public class Milk extends Drinks {
    private String richness;
    private int expiration;
    
    public Milk (String name, int prise, int amountOf, String unit,int volume,String richness,int expiration){
        super(name, prise, amountOf, unit, volume);
        this.richness = richness;
        this.expiration = expiration;
        
    }
    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s Volume:%d Richness:%s Expiration:%ddays",
                this.name, this.prise, this.amountOf, this.unit,this.volume,this.richness,this.expiration);
    
    }
} 