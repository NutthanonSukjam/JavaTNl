public class Pudding extends Bakery {
    private int cup;

    public Pudding(int cup, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.cup = cup;
    }
    public int GetFree(){
        if(this.cup >= 10){
            return 1;
        }
        return 0;
    }
    @Override

    public double calculateTotalPrice(){
        int paycup = this.cup - GetFree();
        return getUnitPrice() * paycup;
    }

    public String toString(){
        return super.toString() + "\n" + "Pudding ( " + super.getflavor() + " )"
                + " with " + this.cup + " cup " + GetFree() + " You get Free Cup!"
                + "\nTotal price of Pudding = " + calculateTotalPrice();
    }
}
