public class LifelineSite extends Site{

    public LifelineSite(double _units, double _rate) {
        super(_units, _rate);
    }


    double getBaseAmount(){
        return _units;
    }

    double getTaxAmount(){
        return _rate;
    }
}
