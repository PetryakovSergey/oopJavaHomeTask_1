public class Nipple extends ChildrensGoods{
    public Nipple(String name, int prise, int amountOf, String unit,int expiration, int minAge, 
    String hypoallergenic){
        super(name, prise, amountOf, unit, expiration, minAge, hypoallergenic);
        
    }
    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s Expiration:%ddays MinAge:%dy Hypoallergenic:%s",
                this.name, this.prise, this.amountOf, this.unit, this.expiration,this.minAge,this.hypoallergenic);
    
    }
    
} 