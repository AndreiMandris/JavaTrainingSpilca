package enums;

public enum Countries { //an enum has a limited number of instances

    ROMANIA, SPAIN("Madrid"), FRANCE("Paris"); //these are the only instances of Countries

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
