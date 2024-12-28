package com.example.dsdesafio1.services;

import org.springframework.stereotype.Service;

import com.example.dsdesafio1.enetities.Order;

@Service
public class ShippingService {
	
	public int shippingPrice(Order order) {
		int shipValue = (order.getBasic() < 100) ? 20 : (order.getBasic() >= 100 && order.getBasic() < 200) ? shipValue = 12 : 0 ;
		
//		if (order.getBasic() < 100) {
//			shipValue = 20;
//		} else if (order.getBasic() >= 100 && order.getBasic() < 200){
//			shipValue = 12;
//		}
		
		
		
		return  shipValue;
	}
	
}
