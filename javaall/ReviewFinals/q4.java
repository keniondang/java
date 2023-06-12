import java.util.ArrayList;

abstract class Customers{
    protected String code;
    protected String fullName;
    protected String gender;
    protected String address;
    protected int quantity;
    protected double price;

    public Customers(String code, String fullName, String gender, String address, int quantity, double price){
        this.code = code;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.quantity = quantity;
        this.price = price;
    }

    public abstract double getTotalPay();
}

class Newbie extends Customers{
    public Newbie(String code, String fullName, String gender, String address, int quantity, double price){
        super(code, fullName, gender, address, quantity, price);
    }

    @Override
    public double getTotalPay(){
        return super.quantity * super.price;
    }
}

class Loyal extends Customers{
    private int totalBought;

    public Loyal(String code, String fullName, String gender, String address, int quantity, double price, int totalBought){
        super(code, fullName, gender, address, quantity, price);
        this.totalBought = totalBought;
    }

    @Override
    public double getTotalPay(){
        if(quantity >= 30){
            int t = quantity / 30;
            return ((super.quantity - t) * super.price) - ((super.quantity - t) * super.price) * (5.0 / 100.0);
        }
        else{
            return (super.quantity * super.price) - ((super.quantity * super.price) * (5.0 / 100.0));
        }
    }
}

class VIP extends Customers{
    private String level;

    public VIP(String code, String fullName, String gender, String address, int quantity, double price, String level){
        super(code, fullName, gender, address, quantity, price);
        this.level = level;
    }

    @Override
    public double getTotalPay(){
        double newPrice = price - 10;
        return (super.quantity * newPrice) - ((super.quantity * newPrice) * 7.0/100.0);
    }
}

public class q4 {
    public static void main(String[] args){
        ArrayList<Customers> custList = new ArrayList<>();

        custList.add(new Newbie("M123", "Keni", "Male", "KTX", 30, 5000));
        custList.add(new Loyal("M456", "Nicholas", "Male", "KTX", 31, 5000, 900));
        custList.add(new VIP("M789", "Ondang", "Male", "KTX", 30, 5000, "VIP"));

        for(Customers customer : custList){
            System.out.println(customer.getTotalPay());
        }


    }
}
