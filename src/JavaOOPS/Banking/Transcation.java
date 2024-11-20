package JavaOOPS.Banking;

public class Transcation {
    private Integer withdrawedAmount;
    private Double currentBalance;
    private Card card;
    private String transcationType;
    private Currency currencyTransfered;
    private String accountNumberSender;
    private String accountNumberReceiver;
    private String status ;
    private String location;

    public Integer getWithdrawedAmount() {
        return withdrawedAmount;
    }

    public void setWithdrawedAmount(Integer withdrawedAmount) {
        this.withdrawedAmount = withdrawedAmount;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getTranscationType() {
        return transcationType;
    }

    public void setTranscationType(String transcationType) {
        this.transcationType = transcationType;
    }

    public Currency getCurrencyTransfered() {
        return currencyTransfered;
    }

    public void setCurrencyTransfered(Currency currencyTransfered) {
        this.currencyTransfered = currencyTransfered;
    }

    public String getAccountNumberSender() {
        return accountNumberSender;
    }

    public void setAccountNumberSender(String accountNumberSender) {
        this.accountNumberSender = accountNumberSender;
    }

    public String getAccountNumberReceiver() {
        return accountNumberReceiver;
    }

    public void setAccountNumberReceiver(String accountNumberReceiver) {
        this.accountNumberReceiver = accountNumberReceiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
