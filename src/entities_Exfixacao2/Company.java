package entities_Exfixacao2;

public class Company extends TaxPayer {

    private int numberOfEmployess;

    public Company(String name, Double anualIcome, int numberOfEmployess) {
        super(name, anualIcome);
        this.numberOfEmployess = numberOfEmployess;
    }

    public int getNumberOfEmployess() {
        return numberOfEmployess;
    }

    public void setNumberOfEmployess(int numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public Double tax() {
        if (getNumberOfEmployess() > 10) {
            return getAnualIcome() * 0.14;
        }else {
            return getAnualIcome() * 0.16;
        }
    }
}
