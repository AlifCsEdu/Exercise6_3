public class WaterPark extends ThemePark{
    String activity;
    double payment;

    public WaterPark(String name, String icNo, boolean Member,String activity) { //Normal Constructor
        super(name, icNo, Member);
        this.activity = activity;
    }

    public String getActivity() {return activity;}

    @Override
    public String toString() {
        return  "\n\t============WaterPark Data============" +
                "\n\tName = '" + super.getName() + '\'' +
                "\n\tIC Number = '" + super.getIcNo() + '\'' +
                "\n\tis A Member? = " + super.getMember() +
                "\n\tActivity chosen = '" + activity + '\'' +
                "\n\tTotal Payment" + calPayment() +
                "\n\t======================================";
    }

    @Override
    public double calPayment() {
        if(activity.equalsIgnoreCase("Surf Beach")){
            payment = 25.0;
        }else if(activity.equalsIgnoreCase("Water Rides")){
            payment = 20.0;
        }else if (activity.equalsIgnoreCase("Wave Pool")){
            payment = 15.0;
        }
        return payment;
    }
}

