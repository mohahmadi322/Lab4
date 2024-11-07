public class ResidentialSIte extends Site{

    public ResidentialSIte(double _units, double _rate) {
        super(_units, _rate);
    }


    public double getBaseAmount(){
        double base = _units * _rate;
        return base;
    }

    public double getTaxAmount(double base){
        double tax = base * Site.TAX_RATE;
        return tax;
    }
}
