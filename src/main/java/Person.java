
public class Person {
    String name;
    Montre Pwatch;
    Person(String name){
        this.name = name;
        this.Pwatch = null;
    }

    void watchOwner( Montre m){
        if(this.Pwatch == null){

            this.Pwatch = m;
            System.out.println("Cette montre appartient à : "+ this.name);
        }
        else {
            System.out.println("Elle a déjà une montre");
        }
    }

       void giveTime(){
        if(this.Pwatch != null) {
            System.out.println("Il est: " + this.Pwatch.hr +"h" + this.Pwatch.min );

        }
        else {
            System.out.println("Je suis désolé(e) mais je n'ai pas de montre");
        }
    }

    void demanderHeure(Person p){
        p.giveTime();
    }

}
