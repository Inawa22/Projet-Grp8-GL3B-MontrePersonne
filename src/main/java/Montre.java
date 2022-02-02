
public class Montre {
    int hr, min;
    Person p;

    Montre(int h, int m) {
        this.hr = h;
        this.min = m;
    }

    Montre(Montre m) {
        this.hr = m.hr;
        this.min = m.min;
    }

    void newday() {
        if ((this.min+1 )>59 && (this.hr+1 )>23 ) {
            this.hr = 0;
            this.min = 0;
        }
        else if((this.min+1 )>59){
            this.min = 0;
            this.hr++;
        }
        else{
            this.min++;
        }

    }
}
