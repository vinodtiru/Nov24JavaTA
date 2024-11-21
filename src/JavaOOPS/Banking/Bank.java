package JavaOOPS.Banking;

import java.util.ArrayList;
import java.util.Collections;

public class Bank{

    ArrayList<Customers> customers = new ArrayList<>();

    public static void main(String[] args) {
        Account acount = new Account();
        Customers shweta= new Customers();
        Transcation transcation = new Transcation();
        Card card= new Card();
        Loan loan = new Loan();
        shweta.setName("Shweta");
        shweta.setAge(30);
        shweta.setEmail("bfdjjks.gmail.com");
        shweta.setOccupation("Engineer");
        card.setCardType("debit");
        shweta.setCardPossesed(card);

        Customers smaya= new Customers();
        smaya.setName("Arya");
        smaya.setAge(20);
        smaya.setEmail("bfkkjks.gmail.com");
        smaya.setOccupation("Student");
        smaya.setCardPossesed(card);

        Customers srikanth= new Customers();
        srikanth.setName("Srikanth");
        srikanth.setAge(33);
        srikanth.setEmail("bfkkjhfks.gmail.com");
        srikanth.setOccupation("Engineer");
        srikanth.setCardPossesed(card);

        ArrayList<Customers> customers = new ArrayList<>();
        customers.add(shweta);
        customers.add(smaya);
        customers.add(srikanth);

        Collections.sort(customers);

        for(Customers c:customers){
            System.out.println(c.toString());
        }



    }



}
