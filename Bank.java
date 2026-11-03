class Bank{
    void rateOfinterest(){
        System.out.println("Bank interest rate");
    }
 }

class SBI extends Bank{
void rateOfinterest(){
System.out.println("SBI interest rate:7%");
    }
 }

class HDFC extends Bank{
void rateOfinterest(){
System.out.println("HDFC interest rate:8%");
    }
}

class Main{
    public static void main(String[] args){
    Bank b;
    
    b=new SBI();
    b.rateOfinterest();
    
    b=new HDFC();
    b.rateOfinterest();
    }
 }