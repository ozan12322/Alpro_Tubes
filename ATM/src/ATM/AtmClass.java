package ATM;

public class AtmClass {
    int pin;
    double saldo;
    
//--------------------------- setter
    
 
    public void setPin(int password) {
        this.pin = password;
    }
 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
//------------------------------------ getter
    
 
    public int getPin() {
        return pin;
    }
 
    public double getSaldo() {
        return saldo;
    }  
}