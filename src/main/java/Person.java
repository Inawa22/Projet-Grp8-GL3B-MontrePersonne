
public class Person {

    String name;
    Montre watch;

    public Person(String name){
        this.name = name;
        this.watch = null;
    }

    public Person(String name, Montre pWatch){
        this.name = name;
        this.watch = pWatch;
    }

    public void setWatch(Montre pWatch) {
        this.watch = pWatch;
    }

    public Montre getWatch() {
        return watch;
    }

    public void removeWatch(){
        if(this.getWatch() != null){
            this.watch = null;
        }
    }

    public String giveTime(){
        String strTime = "";
        if(this.watch != null) {
            System.out.println("Il est: " + this.watch.getHr() +"h" + this.watch.getMin() );
            strTime = watch.toString();
        }
        return strTime;
    }

    public void askHour(Person p){
        String result = p.giveTime();
        if(result != "" && this.watch != null){
            this.watch.setHr(Integer.parseInt(result.substring(0,2)));
            this.watch.setMin(Integer.parseInt(result.substring(2)));
        }
    }

}
