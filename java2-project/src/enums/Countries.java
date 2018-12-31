package enums;

public enum Countries {

    ROMANIA, SPAIN("Madrid"), FRANCE("Paris");

    Countries() { //constructors are by default private
    }

    String capital;

    Countries(String capital) {
        this.capital = capital;
    }

    public String getCapital(){
        return this.capital;
    }
}
