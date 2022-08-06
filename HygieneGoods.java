public class HygieneGoods extends Goods {

    protected int amountInPack;

    public HygieneGoods(String name, int prise, int amountOf, String unit, int amountInPack){
        super(name, prise, amountOf, unit);
        this.amountInPack = amountInPack;
    }
    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s InPack:%d",
                this.name, this.prise, this.amountOf, this.unit,this.amountInPack);
    
    }
}
