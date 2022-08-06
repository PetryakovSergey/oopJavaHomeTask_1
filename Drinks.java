public class Drinks extends Goods{

    protected int volume;

    public Drinks(String name, int prise, int amountOf, String unit,int volume){
        super(name, prise, amountOf, unit);
        this.volume = volume;

    }
    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s Volume:%ml",
                this.name, this.prise, this.amountOf, this.unit,this.volume);
    
    }
} 
