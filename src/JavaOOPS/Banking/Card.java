package JavaOOPS.Banking;

public class Card {
    private String cardNumber;
    private Integer cvv;
    private String customersName;
    private Integer expiryMonth;
    private Integer expiryYear;
    private  String cardType;
    private Integer cardIssuedYear;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getCustomersName() {
        return customersName;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(Integer expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public Integer getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(Integer expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getCardIssuedYear() {
        return cardIssuedYear;
    }

    public void setCardIssuedYear(Integer cardIssuedYear) {
        this.cardIssuedYear = cardIssuedYear;
    }
}
