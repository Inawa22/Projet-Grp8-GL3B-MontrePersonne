
public class Montre {

    private int hr, min;

    public Montre(int h, int m) {
        this.hr = h;
        this.min = m;
    }

    public Montre(Montre m) {
        this.hr = m.hr;
        this.min = m.min;
    }

    public int getHr(){
        return hr;
    }

    public int getMin() {
        return min;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void oneMinuteMore(){
        if ((this.min+1 )>59){
            this.min = 0;
            if((this.hr+1 )>23){
                this.hr = 0;
            }else{
                this.hr++;
            }
        }else{
            this.min++;
        }
    }

}
