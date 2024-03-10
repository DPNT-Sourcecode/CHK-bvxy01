package befaster.solutions.SUM;

import org.junit.jupiter.api.Test;
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
    public void testSum_whenXIsNegative() {
    	assertThat(sum.compute(-1, 1), equalTo(0));
    }
}

