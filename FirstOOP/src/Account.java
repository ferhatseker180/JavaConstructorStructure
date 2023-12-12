public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Kendi constructorımızı oluşturma işlemi aşağıdaki gibidir.
    public Account(){
        // This ile constructor içerisinde bir diğer constructorı çağırdık. Çağırılan ilk satır olması zorunludur.
        this("123",2.50,"default name","deneme@gmail.com","507510");
        System.out.println("Empty Constructor Called...");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone){

        System.out.println("Account constructer with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        // Eğer constructorda customerEmail vs gibi adlandırma yerine eMail deseydik this kalıbını kullanmaya gerek kalmayacaktı.
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount){

        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withDrawFunds(double withdrawalAmount){
        if (balance - withdrawalAmount < 0){
            System.out.println("Unsifficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    // Setter...
    public String getNumber(){
        return number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setNumber(String number){
        this.number = number;
    }

}

