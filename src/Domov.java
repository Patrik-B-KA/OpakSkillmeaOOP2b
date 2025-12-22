
public class Domov {

    private float rozloha;
    private int pocetOkien;
    private String material;
    private int pocetPoschodi;
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

    //Toto je metoda
    public float vypocetCenyDomu(int lukrativnaObolast, String menoRodiny){
        System.out.println(menoRodiny);
        float vypocet = lukrativnaObolast* (pocetOkien*800 + rozloha*840);
        return vypocet;
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
