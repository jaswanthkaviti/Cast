package com.Movies.Cast;

import com.Movies.Cast.service.castservice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class CastApplication {

	public static void main(String[] args) {

		SpringApplication.run(CastApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner Jpa(castservice castservice) {
//		return (args) ->
//		{
//			Scanner sc=new Scanner(System. in);
//
//			System.out.print("Enter \n1.Insert Data\n2.Fetch Data:");
//
//			int choice=Integer.parseInt(sc.nextLine());
//
//			if(choice==1)
//			{
//				castservice.insertData();
//			}
//			else if(choice==2)
//			{
//				System.out.print("Enter Movie ID:");
//				castservice.retreiveData(Integer.parseInt(sc.nextLine()));
//			}
//		};
//	}

}
//Integer.parseInt(sc.nextLine())