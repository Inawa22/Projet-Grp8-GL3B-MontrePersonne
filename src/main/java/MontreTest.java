import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MontreTest {
    Montre rolex = null;

    @BeforeEach
    public void init(){
        rolex = new Montre(9,45);
    }

    @org.junit.jupiter.api.Test
    void oneMinuteMore() {
    }

    @org.junit.jupiter.api.Test
    void main() {
        assertNotNull(rolex);
    }
}