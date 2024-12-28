package com.example.dsdesafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsdesafio1.enetities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		return order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) + shippingService.shippingPrice(order);
	}
}
