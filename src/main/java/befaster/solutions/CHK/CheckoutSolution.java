package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
	
	private static Map<Character, Integer> priceMap = new HashMap<>();
	private static Map<Character, Offer> offersMap = new HashMap<>();
	
	
	static {
		priceMap.put('A', 50);
		priceMap.put('B', 30);
		priceMap.put('C', 20);
		priceMap.put('D', 15);
		
		offersMap.put('A', new Offer(3, 130));
		offersMap.put('B', new Offer(2, 45));
	}
	
	
    public Integer checkout(String skus) {
        
    	// Empty
    	if (skus == null || skus.isEmpty() || skus.isBlank()) {
    		return 0;
    	}
    	
    	int total = 0;
    	
    	Map<Character, Integer> checkoutItems = new HashMap<>();
    	
    	for (char item : skus.toCharArray()) {
    		checkoutItems.put(item, checkoutItems.getOrDefault(item, 0) + 1);
    	}
    	
    	for (Map.Entry<Character, Integer> entry : checkoutItems.entrySet()) {
    		
    		char item = entry.getKey();
    		int count = entry.getValue();
    		
    		if (!priceMap.containsKey(item) || count < 0) {
    			return -1;
    		}
    		
    		int price = priceMap.get(item);
    		
    	}
    	
    }
    
    private static class Offer {
    	private int quantity;
    	private int price;
    	
    	public Offer(int quantity, int price) {
    		this.quantity = quantity;
    		this.price = price;
    	}
    	
    	public int getQuantity() {
    		return this.quantity;
    	}
    	
    	public int getPrice() {
    		return this.getPrice();
    	}
    }
}
