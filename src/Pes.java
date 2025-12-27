public class Pes {
    private String rasa;
    private float hmotnost;
    private String farba;
    private float vyska;
    private boolean samec;
    private int pocetUlovenychMaciek;

    Pes(String rasa, float hmotnost, boolean samec, int pocetUlovenychMaciek){
        this.rasa = rasa;
        this.hmotnost  = hmotnost;
        this.samec = samec;
        this.pocetUlovenychMaciek = pocetUlovenychMaciek;

    }

    public void vydajZvuk(){
        System.out.println("Haf, haf, haf");
    }


}
