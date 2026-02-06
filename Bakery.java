public class Bakery {
    private String flavor;
    private double UnitPrice;
    private int packingCost = 5;

    public Bakery(String flaver, double UnitPrice){
        this.flavor = flaver;
        this.UnitPrice = UnitPrice;
    }
    public Bakery() {
        this("", 0.0);
    }
    public String getflavor(){
        return this.flavor;
    }
    public double getUnitPrice(){
        return this.UnitPrice;
    }
    public int getPackingCost() {
        return this.getPackingCost();
    }
    public double calculateTotalPrice() {
        return this.UnitPrice + this.packingCost;
    }
    public String toString(){
        return "่Thank you for your order!";
    }
}
