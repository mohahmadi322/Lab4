public class LifelineSite extends Site{

    public LifelineSite(double _units, double _rate) {
        super(_units, _rate);
    }


    public double getBaseAmount(){
        double base = _units * _rate * 0.5;
        return base;
    }

    public double getTaxAmount(double base){
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }
}
