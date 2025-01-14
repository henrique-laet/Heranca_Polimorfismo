package entities_Exfixacao2;

public abstract class TaxPayer {

    private String name;
    private Double anualIcome;

    public TaxPayer(String name, Double anualIcome) {
        this.name = name;
        this.anualIcome = anualIcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIcome() {
        return anualIcome;
    }

    public void setAnualIcome(Double anualIcome) {
        this.anualIcome = anualIcome;
    }

    public abstract Double tax();
}
