public class Diapers extends ChildrensGoods {

    private int Size;
    private int minWeight;
    private int maxWeight;

    public Diapers(String name, int prise, int amountOf, String unit,int expiration,
    int minAge, String hypoallergenic,int Size, int minWeight, int maxWeight){
        super(name, prise, amountOf, unit, expiration, minAge, hypoallergenic);
        this.Size = Size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        
    }
    @Override
    public String toString() {
        return String.format("Name:%s Prise:%dr Quantity:%d Unit:%s Expiration:%ddays MinAge:%dyears Hypoallergenic:%s Size:%d MInWeight:%dg MaxWeight:%dg",
                this.name, this.prise, this.amountOf, this.unit,this.expiration,this.minAge,this.hypoallergenic,this.Size, this.minWeight,this.maxWeight);
    }
} 
