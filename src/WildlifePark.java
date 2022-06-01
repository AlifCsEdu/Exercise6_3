public class WildlifePark extends ThemePark {
    String category;
    double price1, price2;

    public WildlifePark(String name, String icNo, boolean Member, String category){
        super(name, icNo, Member);
        this.category = category;
    }
    public String getCategory() {return category;}

    @Override
    public String toString() {
        return  "\n\t==========Wildlife Park==========" +
                "\n\tname='" + getName() + '\'' +
                "\n\ticNo='" + getIcNo() + '\'' +
                "\n\tmember=" + getMember() +
                "\n\tcategory='" + category + '\'' +
                "\n\tTotal Price = " + calPayment() +
                "\n\t=================================";
    }

    @Override
    public double calPayment() {
        double totalprice;
        if(Member){
            price1 = 0.25;
        }else{
            price1 = 0;
        }
        if(category.equalsIgnoreCase("Adult")){
            price2 = 35.0;
        }else if(category.equalsIgnoreCase("Children")){
            price2 = 20.0;
        }
        totalprice = price2 * price1;
        return totalprice;
    }
}
