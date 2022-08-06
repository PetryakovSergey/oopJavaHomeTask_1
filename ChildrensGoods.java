public class ChildrensGoods extends Goods{
    protected int expiration;
    protected int minAge;
    protected String hypoallergenic;

    public ChildrensGoods(String name, int prise, int amountOf, String unit,int expiration,
        int minAge, String hypoallergenic){
        super(name, prise, amountOf, unit);
        this.expiration = expiration;
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;

    }
    @Override
    public String toString() {
        return String.format("Name:%s Prise:%dr Quantity:%d Unit:%s Expiration:%ddays MinAge:%dyears Hypoallergenic:%s",
                this.name, this.prise, this.amountOf, this.unit,this.expiration,this.minAge,this.hypoallergenic );
    }
}
