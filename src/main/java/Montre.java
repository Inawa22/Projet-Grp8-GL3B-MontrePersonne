
public class Montre {

    private int hr, min;

    public Montre(int h, int m) {
        this.hr = h;
        this.min = m;

        System.out.println("Une montre vient d'être créer et initialiser à "+hr+":"+min);
    }

    public Montre(Montre m) {
        this.hr = m.hr;
        this.min = m.min;
        System.out.println("Une montre vient d'être créer et initialiser à partir de l'heure d'une autre montre ("+hr+":"+min+")");
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

    public String toString(){
        return String.format("%02d:%02d",this.hr,this.min);
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

    public static void main(){

        Montre richardMille = new Montre(9,25);

        Montre casio = new Montre(richardMille);
    }

}
