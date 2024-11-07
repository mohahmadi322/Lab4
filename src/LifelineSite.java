public class LifelineSite extends Site{

    public LifelineSite(double _units, double _rate) {
        super(_units, _rate);
    }


    double getBaseAmount(){
        double base = _units * _rate;
        return base;
    }

    double getTaxAmount(double base){
        double tax = base * Site.TAX_RATE;
        return tax;
    }
}
