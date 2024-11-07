public class ResidentialSIte extends Site{

    public ResidentialSIte(double _units, double _rate) {
        super(_units, _rate);
    }


    double getBaseAmount(){
        double base = _units * _rate * 0.5;
        return base;
    }

    double getTaxAmount(double base){
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }
}
