public class Domov extends Stavba{

    private int pocetOkien;
    private String material;
    private boolean maAlarm;


    public float getRozloha() {
        return rozloha;
    }

    public void setRozloha(float rozloha) {
        this.rozloha = rozloha;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPocetPoschodi() {
        return pocetPoschodi;
    }

    public void setPocetPoschodi(int pocetPoschodi) {
        this.pocetPoschodi = pocetPoschodi;
    }

    public boolean isMaAlarm() {
        return maAlarm;
    }

    public void setMaAlarm(boolean maAlarm) {
        this.maAlarm = maAlarm;
    }


    Domov(float rozloha, int pocetOkien, int pocetPoschodi){
        this.rozloha = rozloha;
        this.pocetOkien = pocetOkien;
        this.pocetPoschodi = pocetPoschodi;

    }


    //Getter pre získanie dát v private fields
    public int getPocetOkien() {
        return pocetOkien;

    }

    //Setter pre získanie (Nastavenie?) dát v private fields
    public void setPocetOkien(int novyPocetOkien){
        pocetOkien = novyPocetOkien;
    }


}
