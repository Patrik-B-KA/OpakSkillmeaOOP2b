public class Macka extends Zviera{

    private int pocetUlovenychMysi;

    Macka(String rasa, float hmotnost, boolean samec, int pocetUlovenychMysi){
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.samec = samec;
        this.pocetUlovenychMysi = pocetUlovenychMysi;


    }

    @Override
    public void vydajZvuk(){
        System.out.println("mnau, mnau");
    }

}
