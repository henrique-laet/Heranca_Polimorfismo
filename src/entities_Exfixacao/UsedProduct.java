package entities_Exfixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {

    private LocalDate manuFactureDate;

    public UsedProduct(String name, Double price, LocalDate manuFacture) {
        super(name, price);
        this.manuFactureDate = manuFacture;
    }

    public LocalDate getManuFacture() {
        return manuFactureDate;
    }

    public void setManuFacture(LocalDate manuFacture) {
        this.manuFactureDate = manuFacture;
    }

    @Override
    public String priceTag() {
        return getName()
                + " (used) "
                + String.format("$ %.2f ", getPrice())
                + "(Manufacture date: "
                + manuFactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";

    }
}
