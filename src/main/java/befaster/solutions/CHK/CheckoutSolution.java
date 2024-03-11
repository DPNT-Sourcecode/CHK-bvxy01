package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutSolution {
	
	private static Map<Character, Integer> priceMap = new HashMap<>();
	private static Map<Character, List<Offer>> offersMap = new HashMap<>();
	
	
	static {
		priceMap.put('A', 50);
		priceMap.put('B', 30);
		priceMap.put('C', 20);
		priceMap.put('D', 15);
		priceMap.put('E', 40);
		
		List<Offer> listA = new ArrayList<>();
		listA.add(new Offer(3, 130));
		listA.add(new Offer(5, 200));
		offersMap.put('A', listA);
		List<Offer> listB = new ArrayList<>();
		listB.add(new Offer(2, 45));
		offersMap.put('B', listB);
		List<Offer> listE = new ArrayList<>();
		listE.add( new Offer(2, 80));
		offersMap.put('E', listE);
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
    		List<Offer> offerList = offersMap.getOrDefault(item, new ArrayList<>());
    		
    		for (Offer offer : offerList) {
    		
	    		if (offer != null) {
	    			
	    			int offerCount = count / offer.getQuantity();
	    			
	    			total += offerCount * offer.getPrice();
	    			
	    			if (item == 'E') {
	    				int bCount = Math.min(checkoutItems.getOrDefault('B', 0), offerCount);
	    				total -= bCount * priceMap.get('B');
	    				
	    			}
	    			
	    			if (item == 'A') {
	    				int aCount = Math.max(checkoutItems.getOrDefault('A', 0), offerCount);
	    				total -= aCount * priceMap.get('A');
	    			}
	    		
	    			
	    			count %= offer.getQuantity();
	    		}
    		}
    		
    		total += count * price;
    	}
    	
    	return total;
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
    		return this.price;
    	}
    }
}







