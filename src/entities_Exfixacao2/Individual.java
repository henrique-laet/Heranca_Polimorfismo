package entities_Exfixacao2;

public class Individual extends TaxPayer {

    private Double healthExpenditures;


    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIcome() < 20000.0) {
            return getAnualIcome() * 0.15 - healthExpenditures * 0.5;
        } else {
            return getAnualIcome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}
