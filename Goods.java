public class Goods {

    protected String name;
    protected int prise;
    protected int amountOf;
    protected String unit;


    public Goods(String name, int prise, int amountOf, String unit) {
    this.name = name;
    this.prise = prise;
    this.amountOf = amountOf;
    this.unit = unit;
    }
    
    public String toString() {
        return String.format("Name:%s  Prise:%dr Quantity:%d Unit:%s",
                this.name, this.prise, this.amountOf, this.unit);
    
    }
}
