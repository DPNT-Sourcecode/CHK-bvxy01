package befaster.solutions.HLO;

public class HelloSolution {
    public String hello(String friendName) {
    	
    	if (friendName == null || friendName.isEmpty() || friendName.isBlank()) {
    		throw new IllegalArgumentException("Invalid name");
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("Hello, ");
    	sb.append(friendName);
    	sb.append("!");
    	
        return sb.toString();
    }
}


