public class Raum extends Heizung{
    private Heizung heizung;
    public Raum(){
        this.heizung = new Heizung();
    }
    public Raum(Heizung heizung){
        this.heizung = heizung;
    }
}
