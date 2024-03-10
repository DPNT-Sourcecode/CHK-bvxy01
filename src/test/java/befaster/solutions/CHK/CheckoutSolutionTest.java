package befaster.solutions.CHK;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckoutSolutionTest {
    private CheckoutSolution checkoutSolution;

    @BeforeEach
    public void setUp() {
    	checkoutSolution = new CheckoutSolution();
    }
    
    @Test
    public void testCheckoutSolution_withTwoAProducts() {
    	assertThat(checkoutSolution.checkout("AA"), equalTo(100));
    }
    
    @Test
    public void testCheckoutSolution_withThreeAProducts() {
    	assertThat(checkoutSolution.checkout("AAA"), equalTo(130));
    }
    
    @Test
    public void testCheckoutSolution_withTwoBProducts() {
    	assertThat(checkoutSolution.checkout("BB"), equalTo(45));
    }
    
    @Test
    public void testCheckoutSolution_withABProducts() {
    	assertThat(checkoutSolution.checkout("AB"), equalTo(80));
    }
    
    @Test
    public void testCheckoutSolution_withInvalidProduct() {
    	assertThat(checkoutSolution.checkout("X"), equalTo(-1));
    }
    
    @Test
    public void testCheckoutSolution_withInvalidAndValidProduct() {
    	assertThat(checkoutSolution.checkout("AX"), equalTo(-1));
    }
}


