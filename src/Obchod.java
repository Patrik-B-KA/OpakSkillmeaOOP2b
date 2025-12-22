public class Obchod extends Stavba{


    private int pocetPokladni;

    Obchod(float rozloha, int pocetPoschodi, int pocetPokladni){
        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladni = pocetPokladni;

    }

    //Toto je metoda
    public float vypocetCenyDomu(int lukrativnaObolast, String nazovObchodu){
        System.out.println(nazovObchodu);
        float vypocet = lukrativnaObolast* (pocetPokladni*800 + rozloha*840);
        return vypocet;
    }




}
