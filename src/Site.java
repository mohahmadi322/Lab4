public class Site {
    public static final double TAX_RATE = 0.13;
    protected double _units;
    protected double _rate;

    public Site(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }


    double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;

    }

}
