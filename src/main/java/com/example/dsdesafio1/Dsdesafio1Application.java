package com.example.dsdesafio1;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dsdesafio1.enetities.Order;
import com.example.dsdesafio1.services.OrderService;

@SpringBootApplication
public class Dsdesafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Dsdesafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero do pedido: ");
		int nPedido = sc.nextInt();
		System.out.print("Digite o valor do pedido: ");
		Double valor = sc.nextDouble();
		System.out.print("Digite o valor do desconto: ");
		Double discount = sc.nextDouble();
		
		Order order = new Order(nPedido, valor, discount);
		
		System.out.println();
		System.out.println("------------------");
		System.out.println("Pedido codigo: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
		System.out.println("------------------");
		
		sc.close();
	}

}
