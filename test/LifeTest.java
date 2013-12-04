import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LifeTest {
    @Test
    public void should_middle_alive_when_there_are_three_alive_cell_around() throws Exception {
        String[][] input = {{"*","*","*"},
                            {" "," "," "},
                            {" "," "," "}};
        Earth earth = new Earth();
        String[][] expectOutput = {{"*","*","*"},
                                   {" ","*"," "},
                                   {" "," "," "}};

        Life life = new Life(1,1);
        String[][] output = earth.calculateNextStatus(life, input);
        assertThat(output, is(expectOutput));
    }
}
