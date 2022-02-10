import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MontreTest {
    Montre rolex = null;
    Montre hublot = null;


    @BeforeEach
    public void init(){
        rolex = new Montre(9,45);
        hublot = new Montre(7,25);
    }

    @org.junit.jupiter.api.Test
    void oneMinuteMore() {
    }

    @org.junit.jupiter.api.Test
    void main() {
        assertNotNull(rolex);
    }

    public int exist (){
        return  rolex + hublot;
    }

    public int getrolex (){
        return rolex;
    }

    public  int gethublot (){
        return hublot;
    }

}