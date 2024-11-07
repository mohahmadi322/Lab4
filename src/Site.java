public class Site {
    public static final double TAX_RATE = 0.13;
    protected double _units;
    protected double _rate;

    public Site(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }


    double getBillableAmount(){
        return getBaseAmount() + getTaxAmount(getBaseAmount());

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
