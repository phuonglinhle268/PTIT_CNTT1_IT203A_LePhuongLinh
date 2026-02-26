package PTIT_CNTT1_IT203A_Session13.Bai6;

public class Medicine {
    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;

    public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDrugId() {
        return drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount){
        this.quantity += amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal(){
        return this.unitPrice * this.quantity;
    }

    @Override
    public String toString(){
        return String.format("%-10s %-20s %10.2f %8d %12.2f", drugId, drugName, unitPrice, quantity, getTotal());
    }
}
