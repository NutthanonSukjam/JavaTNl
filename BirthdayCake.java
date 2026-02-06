public class BirthdayCake extends  Bakery {
    private String message;
    private double pound;

    public BirthdayCake(String message, double pound, String flavor, double unitPrice){
        super(flavor, unitPrice);
        this.message = message;
        this.pound = pound;
    }
    public String getMessage(){
        return this.message;
    }
    public void changeMessage(String new_message){
        this.message = new_message;
    }
    public int getPackingCost() {
        if (this.pound >= 3)
            return 10;
        return super.getPackingCost();
    }
    @Override
    public double calculateTotalPrice(){
        return getUnitPrice() * this.pound + getPackingCost();
    }
    public String toString(){
        return super.toString() + "\n" + super.getflavor() + " birthday cake (message=" + this.message + ")"
                + "\nTotal price of birthday cake = " + calculateTotalPrice();
    }
}
