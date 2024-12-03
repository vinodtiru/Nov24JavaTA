package com.tekarch.customerms;

import com.tekarch.customerms.Models.Account;
import com.tekarch.customerms.Models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomermsApplication.class, args);

		Account account = new Account();
		account.setAccountNumber(1234L);
		account.setBalance(2000.0);
		Long myAcct = account.getAccountNumber();


		Student student = new Student();
		student.setName("Ramila");
		student.setId(5L);
		student.setAge(20);
		student.setAddress("Bangalore India");
		student.setAvgScore(45);
		student.setRollNumber("12345ABCD");

		Student student2 = new Student(5L,"Vinod","Bangalore India", 20, 45,
				"12345ABCD");
//		student2.setName("Vinod");
//		student2.setId(5L);
//		student2.setAge(20);
//		student2.setAddress("Bangalore India");
//		student2.setAvgScore(45);
//		student2.setRollNumber("12345ABCD");


	}

}
