public abstract class Site {
    public static final double TAX_RATE = 0.13;
    protected double _units;
    protected double _rate;

    public abstract double getBaseAmount();

    public abstract double getTaxAmount(double base);

    public Site(double _units, double _rate) {
        this._units = _units;
        this._rate = _rate;
    }


    double getBillableAmount(){
        return getBaseAmount() + getTaxAmount(getBaseAmount());

    }


}
