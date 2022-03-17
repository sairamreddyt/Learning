package com.event.custome;

public class CustomEventListener {
	
		public void onApplicationEvent(CustomEvent event) {
		
		System.out.println(event.toString());
		
	}

}
