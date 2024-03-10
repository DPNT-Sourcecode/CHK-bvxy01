package befaster.solutions.SUM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @BeforeEach
    public void setUp() {
        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }
    
    @Test
    public void testSum_whenXIsZero() {
    	assertThat(sum.compute(0, 1), equalTo(1));
    }
    
    @Test
    public void testSum_whenXIsNegative_throwsIllegalArgumentException() {
    	assertThrows(IllegalArgumentException.class, () -> {
    		sum.compute(-1, 1);
    	});
    }
    
    @Test
    public void testSum_whenXIsOverHundred_throwsIllegalArgumentException() {
    	assertThrows(IllegalArgumentException.class, () -> {
    		sum.compute(200, 1);
    	});
    }
    
    @Test
    public void testSum_whenYIsZero() {
    	assertThat(sum.compute(10, 0), equalTo(10));
    }
    
    @Test
    public void testSum_whenYIsNegative_throwsIllegalArgumentException() {
    	assertThrows(IllegalArgumentException.class, () -> {
    		sum.compute(10, -10);
    	});
    }
    
    @Test
    public void testSum_whenYIsOverHundred_throwsIllegalArgumentException() {
    	assertThrows(IllegalArgumentException.class, () -> {
    		sum.compute(10, 210);
    	});
    }
}
