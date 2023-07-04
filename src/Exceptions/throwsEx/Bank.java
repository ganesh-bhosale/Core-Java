package Exceptions.throwsEx;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount){
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency(){
        return currency;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public Integer getAmount(){
        return amount;
    }

    public void setAmount(Integer amount){
        this.amount = amount;
    }

    public Integer add(Bank value) throws Exception{
        System.out.println("Total: ");
        if(!(value.currency.equals("USD"))){
            throw new CustomException("Currencies don't match!");
        }

        Integer sum = this.amount + value.amount;
        return sum;
    }
}
