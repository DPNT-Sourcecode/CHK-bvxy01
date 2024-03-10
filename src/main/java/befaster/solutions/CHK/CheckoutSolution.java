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
    		
    		
    		
    	}
    	
    }
}



