package Java_basics.codes.OOPs.Encapsulation;

public class encapsulation {
    public static void main(String[] args) {
        account_info a1 = new account_info();
        a1.setAcc_no(121232424);
        a1.setAmount(324242.232f);
        a1.setName("swayam");
        a1.setEmail("swayamswarupbarik25@gmail.com");
        System.out.println("Name: "+a1.getName()+", account no: "+a1.getAcc_no()+", email-id: "+a1.getEmail()+
                ", amount in " +
                "account: $"+a1.getAmount());
    }
}
class account_info{
    private  long acc_no;
    private String name,email;
    private float amount;

    public float getAmount() { //getter methods
        return amount;
    }

    public void setAmount(float amount) { //setter methods
        this.amount = amount;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}