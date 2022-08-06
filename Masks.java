public class Masks extends HygieneGoods {
    public Masks(String name, int prise, int amountOf, String unit, int amountInPack){
        super(name, prise, amountOf, unit, amountInPack);
        
    }
    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s InPack:%dcounts",
                this.name, this.prise, this.amountOf, this.unit,this.amountInPack);
    
    }
} 