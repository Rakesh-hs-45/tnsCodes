package mall;

public class Customer {

    private int customerId;
    private String name;
    private String phone;

    public Customer(int id,String name,String phone){
        this.customerId=id;
        this.name=name;
        this.phone=phone;
    }

    public String getName(){ return name; }
    public String getPhone(){ return phone; }
}