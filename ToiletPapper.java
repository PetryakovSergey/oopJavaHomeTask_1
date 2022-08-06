public class ToiletPapper extends HygieneGoods {
    private int numberOflayers;

    public ToiletPapper(String name, int prise, int amountOf, String unit, 
    int amountInPack,int numberOflayers){
        super(name, prise, amountOf, unit, amountInPack);
        this.numberOflayers = numberOflayers;
    }
    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s InPack:%dcounts",
                this.name, this.prise, this.amountOf, this.unit,this.numberOflayers);
    
    }

} 
