abstract class ThemePark {
    String name;
    String icNo;
    boolean Member;

    public ThemePark(String name, String icNo, boolean Member) { //Normal Constructor
        this.name = name;
        this.icNo = icNo;
        this.Member = Member;
    }

    public String getName() {return name;} //Accessor
    public String getIcNo() {return icNo;} //Accessor
    public boolean getMember() {return Member;} //Accessor

    public String toString() { //Printer method using toString()
        return "\n\t====ThemePark====" +
                "\n\tName = '" + getName() + '\'' +
                "\n\tIc Number = '" + getIcNo() + '\'' +
                "\n\tMember = " + getMember() +
                "\n\t================";
    }
    public abstract double calPayment(); //Abstract method
}
