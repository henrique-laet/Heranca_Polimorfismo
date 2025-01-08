package entities_Exfixacao;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customFree) {
        super(name, price);
        this.customsFee = customFree;
    }

    public Double getCustomFree() {
        return customsFee;
    }

    public void setCustomFree(Double customFree) {
        this.customsFee = customFree;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName()
                + String.format(" $ %.2f ", totalPrice())
                + String.format("(Customs fee: $ %.2f ", customsFee);
    }
}
