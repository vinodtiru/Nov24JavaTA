package JavaOOPS.Banking;

public class Customers implements Comparable<Customers>{
    private String name;
    private Integer age;
    private String email;
    private  Integer phoneNumber;
    private Loan loanAssocaited;
    private String occupation;
    private String address;
    private Card cardPossesed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Loan getLoanAssocaited() {
        return loanAssocaited;
    }

    public void setLoanAssocaited(Loan loanAssocaited) {
        this.loanAssocaited = loanAssocaited;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Card getCardPossesed() {
        return cardPossesed;
    }

    public void setCardPossesed(Card cardPossesed) {
        this.cardPossesed = cardPossesed;
    }

    @Override
    public int compareTo(Customers o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', age=" + age + ", email='" + email + "', occupation='" + occupation + "', cardPossesed=" + cardPossesed.getCardType() + "}";
    }
}
