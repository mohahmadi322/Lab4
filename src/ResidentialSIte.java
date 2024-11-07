public class ResidentialSIte extends Site{

    public ResidentialSIte(double _units, double _rate) {
        super(_units, _rate);
    }


    double getBaseAmount(){
        return _units;
    }

    double getTaxAmount(){
        return _rate;
    }
}
