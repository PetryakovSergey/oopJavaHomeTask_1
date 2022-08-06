public class Lemonade extends Drinks {

    public Lemonade(String name, int prise, int amountOf, String unit,int volume){
        super(name, prise, amountOf, unit, volume);
    }
    @Override
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s Volume:%dml",
                this.name, this.prise, this.amountOf, this.unit,this.volume);
    
    }
} 
