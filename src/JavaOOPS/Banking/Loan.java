package JavaOOPS.Banking;

public class Loan {
    private String loanId;
    private String loanType;
    private Customers customer;
    private Double interest;
    private Double loanAmount;
    private Integer loanDuration;
    private Double montlyInstalment;

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(Integer loanDuration) {
        this.loanDuration = loanDuration;
    }

    public Double getMontlyInstalment() {
        return montlyInstalment;
    }

    public void setMontlyInstalment(Double montlyInstalment) {
        this.montlyInstalment = montlyInstalment;
    }
}
