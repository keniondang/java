class Bill{
    protected String code;
    protected String date;
    protected String salesman;
    protected String customer;
    protected String product;
    protected int quantity;
    protected double price;
    
    public Bill(){
        this.code = "Bill001";
        this.date = "";
        this.salesman = "TTP";
        this.customer = "Keni";
        this.product = "pen";
        this.quantity = 20;
        this.price = 2500;
    }

    public double getPrice(){
        double TotalPrice = quantity * price;
        double discount = TotalPrice * (4.0 / 100.0);
        if(quantity > 1000){
            return quantity * price - discount;
        }
        else{
            return TotalPrice;
        }
        
    }

    public double getTax(){
        return getPrice() * (10.0 / 100.0);
    }

    public double getTotalPay(){
        return getPrice() + getTax();
    }

    public String exportInfo(){
        return "Code: " + code + "\nProduct: " + product + "\nCustomer: " + customer + "\nQuantity: " + quantity + "\nPrice: " + price + "\nTotal Price: " + getPrice() + "\nTax: " + getTax() + "\nTotal Pay: " + getTotalPay();  
    }
}

class DeliveryBill extends Bill{
    private String address;
    private double distance;
    private double waitingTime;

    public DeliveryBill(){
        super();
        this.address = "District 7";
        this.distance = 5;
        this.waitingTime = 24;
    }

    @Override
    public double getTotalPay(){
        double total = super.getTotalPay();
        if(waitingTime <= 24){
            if (distance < 10){
                double deliveryFee = 20 * distance * super.quantity;
                return total + deliveryFee;
            }
            else{
                double deliveryFee = 18 * distance * super.quantity;
                return total + deliveryFee;
            }
        }
        else{
            double deliveryFee = 150000;
            return total + deliveryFee;
        }
    }

    @Override
    public String exportInfo(){
        return super.exportInfo() + "\nDelivery fee: " + (getTotalPay() - super.getTotalPay());
    }
}

public class q3{
    public static void main(String[] args){
        DeliveryBill bill = new DeliveryBill();
        System.out.println(bill.exportInfo());
    }
}
