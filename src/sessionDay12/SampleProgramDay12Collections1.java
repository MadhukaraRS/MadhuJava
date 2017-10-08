package sessionDay12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleProgramDay12Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//itemList();
		iteratorExample();
	}
	
	public static void itemList() {
		
		
		List<String> orderPrice = new ArrayList<>();
		orderPrice.add("20999");
		orderPrice.add("1299");
		orderPrice.add("5999");
		orderPrice.add("1199");
		
		List<String> orderItems = new ArrayList<>();
		orderItems.add("Dell Laptop");
		orderItems.add("Mouse");
		orderItems.add("Speakers");
		orderItems.add("Keyboard");
		
		System.out.println(orderItems);
		System.out.println(orderItems.size());
		System.out.println(orderItems.get(2));
		System.out.println(orderItems.isEmpty());
		orderItems.set(3, "Hard Disk");
		orderItems.set(0, "CPU");
		System.out.println(orderItems);
		orderItems.add("Wifi Router");
		System.out.println(orderItems);
		orderItems.add(2, "Adapter");
		System.out.println(orderItems);
		System.out.println(orderItems.indexOf("Speakers"));
		orderItems.addAll(orderPrice);
		System.out.println(orderItems);
		orderItems.remove("1299");
		System.out.println(orderItems);
		System.out.println(orderItems.containsAll(orderPrice));
		orderItems.removeAll(orderPrice);
		System.out.println(orderItems);
		orderItems.retainAll(orderPrice);
		System.out.println(orderItems);
	}
	
	public static void iteratorExample() {
		List<String> orderItems = new ArrayList<>();
		orderItems.add("Dell Laptop");
		orderItems.add("Mouse");
		orderItems.add("Speakers");
		orderItems.add("Keyboard");
		
		Iterator<String> itemsChk = orderItems.iterator();
		System.out.println(itemsChk.hasNext());
		
		while(itemsChk.hasNext()) {
			System.out.println(itemsChk.next());
			itemsChk.remove();
		}
		
		System.out.println("***************************************");
		
		for(int i=0; i<orderItems.size();i++) {
			System.out.println(orderItems.get(i));
		}
		
	}

}
